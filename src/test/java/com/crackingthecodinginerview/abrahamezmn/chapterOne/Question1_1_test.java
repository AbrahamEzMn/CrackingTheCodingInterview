package com.crackingthecodinginerview.abrahamezmn.chapterOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Question1_1_test {

    @Test
    void test1() {
        assertTrue(Question1_1.isUniqueCharacters("Abrhems"));
    }

    @Test
    void test2() {
        assertFalse(Question1_1.isUniqueCharacters("Abraham"));
    }

    @Test
    void test3() {
        assertTrue(Question1_1.isUniqueCharacters("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWYXZ"));
    }

    @Test
    void test4() {
        assertFalse(Question1_1.isUniqueCharacters("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWYXZa"));
    }

    @Test
    void test5() {
        assertFalse(Question1_1.isUniqueCharacters("1"));
    }

    @Test
    void test6() {
        assertFalse(Question1_1.isUniqueCharacters("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWYXZ1"));
    }
}
