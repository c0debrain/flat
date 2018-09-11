// Deploy
// firebase deploy --only functions:onNewMessage

//import firebase functions modules
const functions = require('firebase-functions');

//import admin module
const admin = require('firebase-admin');

// initialize
admin.initializeApp(functions.config().firebase);

// initialize firestore
const firestore = admin.firestore();
const settings = {timestampsInSnapshots: true};
firestore.settings(settings);

// demo web api
// functions
const apiHelloWorld = require('./src/helloWorld');
exports.test2 = functions.https.onRequest((req, res) => {
    return apiHelloWorld(req, res);
});

exports.onNewMessage = functions.database
                        .ref('/chat/{chatId}')
                        .onUpdate((snapshot, context) => {

    const messaging = admin.messaging();
    const afterData = snapshot.after.val();
    const beforeData = snapshot.before.val();

    const messagesAfter = Object.keys(afterData.messages).map( key => afterData.messages[key]);
    const messagesBefore = Object.keys(beforeData.messages).map( key => beforeData.messages[key]);

    const newMessage = messagesAfter.find( (message1) => {

        let isExists = false;

        messagesBefore.forEach( (message2) => {

            if(message2._id === message1._id)
                isExists = true;

        });

        return !isExists;

    });

    if(!newMessage){
        return false;
    }

    const senderUserId = newMessage.userId;

    const collection = firestore.collection("profiles");
    collection.where("userId", "=", senderUserId).get().then( (querySnapshot) => {

        if (querySnapshot.size === 0)
            return Promise.resolve();

        const userData = querySnapshot.docs[0].data();

            // Notification details.
        const payload = {
            notification: {
                title: userData.displayName + " sent a message ",
                body: newMessage.text,
            },
            data: {
                chatId: String(context.params.chatId),
                fromUserId: String(senderUserId),
                text: String(newMessage.text),
                createdAt: String(newMessage.createdAt)
            },
        };

        // Set the message as high priority and have it expire after 24 hours.
        const options = {
            collapseKey: 'flat',
            contentAvailable: true,
            priority: 'high',
            timeToLive: 60 * 60 * 24,
        };

        // get notification tokens
        const tokens = afterData.notificationTokens;

        const pushTokens = Object.keys(tokens).map( key => tokens[key]).map( (token) => {
            return token.pushToken;
        });

        return messaging.sendToDevice(pushTokens, payload, options);

    }).then((response) => {

        console.log('Successfully sent message:', response);
        return Promise.resolve(true);

    }).catch( (e) => {
        console.error(e);
    });

    return true;

});

exports.test2 = functions.https.onRequest((req, res) => {

    const messaging = admin.messaging();

    // Notification details.
    const payload = {
        notification: {
        title: 'hello',
        body: 'hello',
        },
        data: {
        extra: 'extra_data',
        },
    };

    // Set the message as high priority and have it expire after 24 hours.
    const options = {
        collapseKey: 'flat',
        contentAvailable: true,
        priority: 'high',
        timeToLive: 60 * 60 * 24,
    };

    const pushTokens = [
        'c6eFsRG6GLU:APA91bE_1mJEp-weTCCwQm9rUuseHn3I_ocbCxThJQzeVjHxqzN2w1_sjCw3E_FGYNQrtJMKpYkvu0VJesvUrH_B2-JLWbON0i8128DsElKWgbcRrHeC5eiGBxQLA_waTA2oQu31y3I4S6zjm9niasmgpy0xBL9PhA',
        'dMZh0A14Z88:APA91bHFT5RspaIzr7Pf6-l-WlVs_neTfpIzOEWZcG0UTROD9ZdsAQ5qFW0uSuVC1Ir2OrAHPojcTOcBYVj2Fj4h0jp0h4FEi4_MGVAkypXv6Cj0CtwgwieAs29MKBNEUNut4b3-R-u9VD0QtEE-wFcfWsuOAFH91w'
    ];

    
    messaging.sendToDevice(pushTokens, payload, options)
    .then((response) => {
        console.log('Successfully sent message:', response);

        return "";

    }).catch( (e) => {
        console.error(e);
    });

    return res.send('Hello World1!');

});
    
    
    

