package com.test.controller;

import com.test.repository.ShipwreckRepository;
import org.junit.Test;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ShipwreckControllerTest {
    @InjectMocks
    private ShipwreckController controller;
    @Mock
    private ShipwreckRepository repository;

    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGet() {
    }
}
