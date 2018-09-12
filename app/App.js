import React from 'react';

import { Provider } from 'react-redux';

import store from './src/redux/store.js';
import messengerEventHandler from './src/lib/backend/firebaseEventHandler';
import pushNotificationHandler from './src/lib/PushNotificationHandler';

// Screens
import AppRoot from './src/views/AppRoot';

// debug settings
//console.disableYellowBox = true; 

class App extends React.Component {

  constructor(props) {
    super(props);
    
    messengerEventHandler.setStore(store);
    pushNotificationHandler.setStore(store);
  }

  componentDidMount = () => {

  }

  render() {

    return (
      <Provider store={store}>
        <AppRoot />
      </Provider>
    );
  }
}

export default App;

