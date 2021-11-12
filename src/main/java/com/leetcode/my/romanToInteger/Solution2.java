package com.leetcode.my.romanToInteger;

class Solution2 {

    public int romanToInt(String s) {
        int num = 0;
        int precedence = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    if (precedence > 1) {
                        num -= 1;
                    } else {
                        num += 1;
                    }
                    precedence = 1;
                    break;
                case 'V':
                    if (precedence > 2) {
                        num -= 5;
                    } else {
                        num += 5;
                    }
                    precedence = 2;
                    break;
                case 'X':
                    if (precedence > 3) {
                        num -= 10;
                    } else {
                        num += 10;
                    }
                    precedence = 3;
                    break;
                case 'L':
                    if (precedence > 4) {
                        num -= 50;
                    } else {
                        num += 50;
                    }
                    precedence = 4;
                    break;
                case 'C':
                    if (precedence > 5) {
                        num -= 100;
                    } else {
                        num += 100;
                    }
                    precedence = 5;
                    break;
                case 'D':
                    if (precedence > 6) {
                        num -= 500;
                    } else {
                        num += 500;
                    }
                    precedence = 6;
                    break;
                case 'M':
                    num += 1000;
                    precedence = 7;
                    break;
            }
        }
        return num;
    }
}
