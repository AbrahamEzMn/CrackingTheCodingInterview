package com.crackingthecodinginerview.abrahamezmn.chapterOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Question1_3_test {

    @Test
    void test1() {
        assertEquals(Question1_3.getParameters("Mr John Smith    " , 13),"Mr%20John%20Smith");
    }

    @Test
    void test2() {
        assertEquals(Question1_3.getParameters(" Abraham Esparza Moreno      " , 23),"%20Abraham%20Esparza%20Moreno");
    }

    @Test
    void test3() {
        assertNotEquals(Question1_3.getParameters("MraJohn Smith    " , 13),"Mr%20John%20Smith");
    }
}
