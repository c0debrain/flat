var firebase = require("firebase-admin");
var moment = require('moment');
var Chance = require('chance');
var chance = new Chance();

var serviceAccount = require("../serviceAccountKey.json");

firebase.initializeApp({
    credential: firebase.credential.cert(serviceAccount),
    databaseURL: "https://sirius-70e10.firebaseio.com"
});

// constants
const TARGET_USERS = [
    "271d8670db9749b69e49065594cc",
    "ed50781422a27a68f02012faf99d",
    "57ea5191966de7c208788b818e7f",
    "567a2e6c6a7cc040b3018b711d17",
    "3ab2ab462f8498d4dd24464691af",
    "fa9809084f6315362bfe3335fe92",
    "206292f38388573dd9ca92a87eef",
    "e49b31134618a842ab9979ba6aa8",
    "598b0d522c1f0e47389a87d0d95d",
    "d7978f7dfe3f971fb49451e8190d",
    "af7ed0678a604bbb994937bc9b4a",
    "9b1a04ca69dc79c3086a64f354eb",
    "d7978f7dfe3f971fb49451e8190d",
    "af7ed0678a604bbb994937bc9b4a",
    "0baa8a7fd1147e3bfad012abf067",
    "16e413785975626719c848eab5f2",
    "be9840f8a281761acb391a185e8c",
    "8593dd6f8ae9f1633f3eeabb0616",
    "SQz4pxVyo9YU9naTaGrfZL6hQlm2",
    "6d92682ffab213bee26ae03453a4",
    "a72edf6594896255465121e9b4e5",
    "888e556a763a05f9fdfe5fa62964",
    "9bbb7aa32ed93cb6e7aa4a3c2776"
    
];
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
const settings = {timestampsInSnapshots: true};
firestore.settings(settings);

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
