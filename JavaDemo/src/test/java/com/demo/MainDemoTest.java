package com.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainDemoTest {

    @Test
    public void sysHelloTest() {
        MainDemo demo = new MainDemo();
        String result = demo.sysHello();
        Assertions.assertEquals("Hello", result);
    }
}
