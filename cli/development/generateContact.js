var firebase = require("firebase-admin");
var moment = require('moment');

var serviceAccount = require("../serviceAccountKey.json");

firebase.initializeApp({
    credential: firebase.credential.cert(serviceAccount),
    databaseURL: "https://sirius-70e10.firebaseio.com"
});

// constants
const NUMBER_OF_USERS = 20;
const TARGET_USER = "SQz4pxVyo9YU9naTaGrfZL6hQlm2";

const firestore = firebase.firestore();
const settings = {timestampsInSnapshots: true};
firestore.settings(settings);

const database = firebase.database();

const profileCollection = firestore.collection('profiles');
const contactCollection = firestore.collection('contacts');

(async () => {

    // get users contact
    let querySnapshot = await contactCollection.where("userId", "=", TARGET_USER).get();
    
    if (querySnapshot.size == 0) {

      // save new contact data
      // create default user data
      const defaultData = {
        userId: TARGET_USER,
        createdAt: utils.now(),
        updatedAt: utils.now(),
        contacts: [
          userData.userId
        ]
      };
      
      await collection.add(defaultData);
      querySnapshot = await contactCollection.where("userId", "=", TARGET_USER).get();
    }

    const userContact = querySnapshot.docs[0].data()
    const userContactDoc = querySnapshot.docs[0].ref;

    // get all users
    const resultSnapshot = await profileCollection.get();

    for(let i = 0 ; i < NUMBER_OF_USERS ; i++){

      // fetch user
      const user = resultSnapshot.docs[i].data();
      if(user.userId == TARGET_USER) continue;

      const exist = userContact.contacts.filter((row) => {
        return row == user.userId
      });
  
      if(exist.length > 0) {

        continue;
      } else {

      }

      userContact.contacts.push(user.userId);

    }

    await userContactDoc.set({
      contacts: userContact.contacts,
      updatedAt: moment().toDate().getTime()
    }, { merge: true });


})();
