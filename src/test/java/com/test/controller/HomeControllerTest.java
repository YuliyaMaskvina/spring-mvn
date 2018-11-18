package com.test.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeControllerTest {
    private HomeController controller;

    @Before
    public void beforeMethod() {
        controller = new HomeController();
    }

    @Test
    public void testHome() {
        String result = controller.home();
        assertEquals(result, "Spring Boot Home");
    }
}
