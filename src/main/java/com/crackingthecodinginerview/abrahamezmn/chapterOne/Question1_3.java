package com.crackingthecodinginerview.abrahamezmn.chapterOne;

/*
 * Interview Questions
 * 1.3
 * URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient
 * space at the end to hold the additional characters, and that you are given the "true" length of the string.
 * (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
 * EXAMPLE
 * Input:  "Mr John Smith    " , 13
 * Output: "Mr%20John%20Smith"
 *
 * Hints: #53,#118
 * #53 It's often easiest to modify strings by going from the end of the string to the beginning.
 * #118 You might find you need to know the number of spaces. Can you just count them?
 * */
public class Question1_3 {

    public static String getParameters(String string, int length) {

        char [] output = string.toCharArray();
        int index = output.length-1;

        for (int i = length - 1; i >= 0; i--){
            if(string.charAt(i) == ' ') {
                output[index--] ='0';
                output[index--] ='2';
                output[index--] ='%';
            }
            else {
                output[index--] = string.charAt(i);
            }
        }

        return new String(output);
    }

}
