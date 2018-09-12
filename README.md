
# Flat Messenger
## Opensource Messenger App based on React Native & Firebase 

![Trailer Video](https://github.com/cloverstudio/flat/blob/master/docs/trailer.gif?raw=true "Trailer Video")


Flat messenger is comprihensive opensource messenger app based on React Native & Firebase.

### Why Flat Messenger ?

- Serverless & 100% automatic scaling. 
- Javascript is the only language you need to know.
- iOS & Android support.
- Easy to include to another project.
- Easy to customise and make your own messenger.

### Build

**First of all, you have to setup everything you need to develop React Native app. If you are beginner please go through [official document](https://facebook.github.io/react-native/) and setup environment.**

Here is step by step tutorial to build the app.

#### Setup Firebase
1. Create Firebase Project
2. Define iOS Bundle Identifier and Android applicationId
3. Add iOS app in Firebase
4. Download "GoogleService-Info.plist"
5. Add Android app in Firebase 
6. Download "google-services.json"
7. Put "GoogleService-Info.plist" under app/ios
8. Put "google-services.json" under app/android/app

#### Build iOS

```$ cd app```

```$ npm install```

```$ cd ios```

```$ pod install```

Open app/ios/FlatMessenger.xcworkspace and chanege Bundle Identifier

```$ cd ../```

```$ npm run ios (on /app)```

#### Buid Android

Change applicationId in app/android/app/build.gradle

Chante project.ext.react in app/android/app/build.gradle

Modify app/android/local.properties to fit to your environment.

```$ npm run android```

#### What you need to do to enable all features.
1. Enable, Firestore, Realtime Database, Auth by telephone number, FCM, Ftorega in Firebase.
2. Deploy function to Firebase. ( see /firebase )
3. Setup push notification in iOS developer portal and in Firebase.

**We are working on detailed document now. Please watch this repository to keep updated**

### License
Flat Messenger uses MIT License.

**Fork it now and start your messenger !!**