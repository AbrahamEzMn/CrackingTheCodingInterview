package com.crackingthecodinginerview.abrahamezmn.chapterOne;

/*
 * Interview Questions
 * 1.1
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 *
 * Hints: #44, #117, #132
 * #44 Try a hash table.
 * #117 Could a bit vector be useful?
 * #132 Can you solve it in 0(N lo g N) time? What might a solution like that look like?
 * */

public class Question1_1 {

    public static boolean isUniqueCharacters(String string) {
        boolean [] flags = new boolean ['z'-'A'+1];

        for ( char character:  string.toCharArray() ) {
            if(character - 'A' < 0 || character - 'z' > 'z' || flags[character-'A']){
                return false;
            }

            flags[character-'A'] = true;
        }

        return true;
    }
}
