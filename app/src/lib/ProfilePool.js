import {
    getUserProfile
} from '../lib/backend';

import * as utils from '../lib/myutils';
import consts from '../lib/constants';

class ProfilePool {

    constructor(){
        this.profilePool = {};
    }

    async get(userId) {

        const now = utils.now();

        // search memory cache
        const memoryCache = this.profilePool[userId];
        if(memoryCache && memoryCache.timestamp > now - consts.profilePoolCacheLife){
            return memoryCache.user;
        }

        // search async cache
        const storageCache = await utils.storageGetItem(consts.storageKeyProfilePoolCache + userId);
        if(storageCache && storageCache.timestamp > now - consts.profilePoolCacheLife){
            // save to memory
            this.profilePool[userId] = storageCache;
            return storageCache.user;
        }

        const user = await getUserProfile(userId, false);
        const cachedData = {
            user:user,
            timestamp:now
        };

        // save to memory
        this.profilePool[userId] = cachedData;

        // save to storage
        utils.storageSaveItem(consts.storageKeyProfilePoolCache + userId, cachedData);

        return user;

    }   


}


export default new ProfilePool();