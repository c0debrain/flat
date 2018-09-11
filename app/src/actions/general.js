import * as types from './types';

export function resetData(type) {

    return {
        type: types.GeneralResetData,
        data: type
    }

}