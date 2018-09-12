var firebase = require("firebase-admin");
var moment = require('moment');
var Chance = require('chance');
var chance = new Chance();

var settings = require('./settings');
var serviceAccount = require("../serviceAccountKey.json");

firebase.initializeApp({
    credential: firebase.credential.cert(serviceAccount),
    databaseURL: settings.firestoreURL
});

// constants
const TARGET_USERS = settings.messageUsers;

const MESSAGES = [
  "Hello!",
  "Good morning.",
  "“Good afternoon",
  "Good evening",
  "It’s nice to meet you.",
  "It’s a pleasure to meet you.”",
  "I’d like you to meet my father.",
  "Morning",
  "Hi!",
  "How are things",
  "What’s new?",
  "It’s good to see you.",
  "G’day!",
  "Howdy!",
  "Hey",
  "Hey there.",
  "What’s up?",
  "Sup?",
  "How’s it going?",
  "What’s happening",
  "What’s happenin",
  "Yo!"
]

const firestore = firebase.firestore();
const firestoreSettings = {timestampsInSnapshots: true};
firestore.settings(firestoreSettings);

const database = firebase.database();

const profileCollection = firestore.collection('profiles');
const contactCollection = firestore.collection('contacts');

const getChatsByUserId = async (userId) => {

  return new Promise( (res,rej) => {

    var ref = database.ref('/history/' + userId);
    ref.once('value', (data) => {
      const value = data.val();
      
      if(!value)
        return res(null);

      const chats = value.chats;

      const chatIds = Object.keys(chats);

      res(chatIds);

    });

  });

}

const sendRandomMessage = async (userId,chatId) => {

  return new Promise( (res,rej) => {
    
    const messageId = chance.string({ length: 28, pool: '0123456789abcdef' });

    const message = {
      _id : messageId,
      createdAt: firebase.database.ServerValue.TIMESTAMP,
      text: MESSAGES[Math.floor(Math.random() * MESSAGES.length)],
      attachment: {},
      userId: userId
    };

    let writeOnce = true;
    
    const messageRef = firebase.database().ref("/chat/" + chatId + "/messages/" + message._id);
    messageRef.on('value', async (data) => {

      const val = data.val();

      if (val)
        return;

      if (writeOnce) {
        writeOnce = false;
        const result = await messageRef.set(message);
        console.log(result);
      }

      messageRef.off();
      res(message);

    });
    
  });
  
}

(async () => {

  for(let i = 0 ; i < TARGET_USERS.length ; i++){

    const senderUserId = TARGET_USERS[i];

    // get history of the user to get chat
    const chatIds = await getChatsByUserId(senderUserId);

    if(!chatIds)
      continue;

    for(let ii = 0 ; ii < chatIds.length ; ii++){

      const chatId = chatIds[ii];

      if(!chatId)
        continue;

      await sendRandomMessage(senderUserId,chatId);

    }

  }


  console.log('batch done');
  process.exit(0);
})();
