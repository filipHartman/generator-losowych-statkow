package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(countHi2("ahixhi"));
    }

    public static String endX(String str) {
        if (str.equals("")) {
            return str;
        }

        if(str.charAt(0) ==  'x') {
            return endX(str.substring(1)) + str.charAt(0);
        }
        return str.charAt(0) + endX(str.substring(1));
    }

    public static int countAbc(String str) {
        if(str.length() < 3) {
            return 0;
        }

        if (str.substring(0, 3).equals("abc")) {
            return 1 + countAbc(str.substring(2));
        }
        return countAbc(str.substring(1));
    }

    public static String stringClean(String str) {
        if(str.equals("")) {
            return str;
        }

        if(str.charAt(0) == str.charAt(1)) {
            return stringClean(str.charAt(0) + str.substring(2));
        }
        return str.charAt(0) + stringClean(str.substring(1));
    }

    public static int countHi2(String str) {
        if(str.equals("hi")) {
            return 1;
        }

        if (str.charAt(0) == 'x') {
            return countHi2(str.substring(1));
        } else {
            if (str.substring(1,3).equals("hi")) {
                return 1 + countHi2(str.substring(3));
            }
            return countHi2(str.substring(1));
        }
    }

}
