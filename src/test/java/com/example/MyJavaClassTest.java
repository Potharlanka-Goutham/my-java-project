package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyJavaClassTest {

    @Test
    public void testAdd() {
        MyJavaClass myJavaClass = new MyJavaClass();
        assertEquals(5, myJavaClass.add(2, 3));
    }
}
