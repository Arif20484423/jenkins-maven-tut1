package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ATest {

    @Test
    public void test(){
        A a = new A();
        Assertions.assertEquals("Hello",a.getHello());
    }
}
