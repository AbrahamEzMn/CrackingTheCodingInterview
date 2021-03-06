package com.crackingthecodinginerview.abrahamezmn.chapterOne;

/*
 * Interview Questions
 * 1.4
 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement
 * of letters. The palindrome does not need to be limited to just dictionary words.
 *
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco eta", etc.)
 * Hints: #106, #121, #134, #136
 *
 * #106 You do not have to—and should not—generate all permutations. This would be very inefficient.
 * #121 What characteristics would a string that is a permutation of a palindrome have?
 * #134 Have you tried a hash table? You should be able to get this down to 0(N) time.
 * #136 Can you reduce the space usage by using a bit vector?
 * */

public class Question1_4 {

    public static boolean havePalindromePermutation(String string) {

        int [] flags = new int[256];

        for (char character : string.toCharArray()){
            if (character > 256){
                return false;
            }

            flags[character]++;
        }

        for (int count : flags){
            if (count > 1){
                if (count % 2 != 0){
                    return false;
                }
            }
        }

        return true;
    }
}
