
# Flat Messenger
## Opensource Messenger App based on React Native & Firebase 

Flat messenger is comprihensive opensource messenger app based on React Native & Firebase.

### Why Flat Messenger ?

- Serverless & 100% automatic scaling. 
- Javascript is the only language you need to know.
- iOS & Android support.
- Easy to include to another project.
- Easy to customise and make your own messenger.

### Build

Here is step by step tutorial to build the app.

**We are working on web site which will be much better tutorial**

#### Setup Firebase
1. Create Firebase Project
2. Define iOS Bundle Identifier and Android applicationId
3. Add iOS app in Firebase
4. Download "GoogleService-Info.plist"
5. Add Android app in Firebase 
If you didn't change package name manually input "com.cloverstudio.flat" for package name at this moment.

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

Modify app/android/local.properties to fit to your environment.

```$ npm run android```



### License
Flat Messenger uses MIT License.

**Fork it now and start your messenger !!**