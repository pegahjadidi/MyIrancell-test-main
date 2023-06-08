package com.pegahjadidi.myirancelltask

fun digitByLocale(englishDigit: String): String {
    var result = ""
    var fa = '۰'
    for (char in englishDigit) {

        fa = char

        when (char) {

            '0' -> fa = '۰'
            '1' -> fa = '۱'
            '2' -> fa = '۲'
            '3' -> fa = '۳'
            '4' -> fa = '۴'
            '5' -> fa = '۵'
            '6' -> fa = '۶'
            '7' -> fa = '۷'
            '8' -> fa = '۸'
            '9' -> fa = '۹'

        }
        result = "${result}$fa"
    }
    return result

}