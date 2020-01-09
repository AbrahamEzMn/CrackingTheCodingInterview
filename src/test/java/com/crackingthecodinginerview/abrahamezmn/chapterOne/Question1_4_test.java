package com.crackingthecodinginerview.abrahamezmn.chapterOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Question1_4_test {

    @Test
    void test1() {
        assertTrue(Question1_4.havePalindromePermutation("tact coa"));
    }

    @Test
    void test2() {
        assertFalse(Question1_4.havePalindromePermutation("tacct coa"));
    }

}
