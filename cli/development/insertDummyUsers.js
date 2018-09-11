var firebase = require("firebase-admin");
var moment = require('moment');
var Chance = require('chance');
var chance = new Chance();
var fetch = require('node-fetch');

var serviceAccount = require("../serviceAccountKey.json");

firebase.initializeApp({
    credential: firebase.credential.cert(serviceAccount),
    databaseURL: "https://sirius-70e10.firebaseio.com"
});

// constants
const NUMBER_OF_USERS = 20;


const firestore = firebase.firestore();
const settings = {timestampsInSnapshots: true};
firestore.settings(settings);

const database = firebase.database();

const profileCollection = firestore.collection('profiles');

(async () => {

  for(let i = 0 ; i < NUMBER_OF_USERS ; i++){

    // get sample data
    const res = await fetch('https://randomuser.me/api/?nat=US');
    const data = await res.json();
    const userData = data.results[0];

    const name =userData.name.first + " " + userData.name.last;
    const phone = userData.phone
    let photoUrl = userData.picture.medium;
    
    let telephoneNumber = "+3850000000";
    telephoneNumber += i < 10 ? "0" + i : i ;

    const userId = chance.string({ length: 28, pool: '0123456789abcdef' });

    if(i % 3 == 0)
      photoUrl = null;

    const insertData = {
      userId: userId,
      telephoneNumber:telephoneNumber,
      createdAt: moment().toDate().getTime(),
      displayName:name,
      photoUrl:photoUrl,
      telephoneNumber:telephoneNumber,
      status: chance.sentence({ words: 5 })
    };
  
    await profileCollection.add(insertData);

    /*
    // insert history
    var ref = database.ref('/history/' + userId);
    await ref.set({
      userId: userId,
      chats: {},
      lastUpdate: 0
    });
    */


  }

})();
