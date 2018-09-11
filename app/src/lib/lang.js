import React from 'react';
import { View, Text } from "react-native";

class Lang {

}

Lang.print = (text) => {
    return text;
}

export const L10N = Lang.l10n;
export const l10n = Lang.print;
export default Lang;