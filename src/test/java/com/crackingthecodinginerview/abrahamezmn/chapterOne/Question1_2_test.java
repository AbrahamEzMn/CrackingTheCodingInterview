package com.crackingthecodinginerview.abrahamezmn.chapterOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Question1_2_test {

    @Test
    void test1() {
        assertTrue(Question1_2.isPermutation("abraham", "maharba"));
    }

    @Test
    void test2() {
        assertFalse(Question1_2.isPermutation("abraham", "maharsaa"));
    }

    @Test
    void test3() {
        assertTrue(Question1_2.isPermutation("aassddd", "ddaassd"));
    }

}
