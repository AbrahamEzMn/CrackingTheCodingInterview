package com.crackingthecodinginerview.abrahamezmn.chapterOne;

/*
 * Interview Questions
 * 1.2
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
 *
 * Hints: #1, #84, #122, #131
 * #1 Describe what it means for two strings to be permutations of each other. Now, look at that definition you provided.
 * Can you check the strings against that definition?
 * #84 There is one solution that is O(N lo g N) time. Another solution uses some space, but is O(N) time.
 * #122 Could a hash table be useful?
 * #131  Two strings that are permutations should have the same characters, but in different orders.
 * Can you make the orders the same?
 * */
public class Question1_2 {

    public static boolean isPermutation(String string1, String string2) {

        if (string1.length() != string2.length()){
            return false;
        }

        int [] letterCount = new int ['z' + 1];

        for (char character: string1.toCharArray()) {
            letterCount[character]++;
        }

        for (char character: string1.toCharArray()) {
            letterCount[character]--;
        }

        for (int count: letterCount) {
            if (count != 0){
                return false;
            };
        }


        return true;
    }

}
