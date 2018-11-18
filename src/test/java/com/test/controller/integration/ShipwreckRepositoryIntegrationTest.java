package com.test.controller.integration;

import com.test.App;
import com.test.model.Shipwreck;
import com.test.repository.ShipwreckRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = App.class)
public class ShipwreckRepositoryIntegrationTest {
    @Autowired
    private ShipwreckRepository repository;

    @Test
    public void testFindAll() {
        List<Shipwreck> wrecks = repository.findAll();
        assertThat(wrecks.size(), is(greaterThanOrEqualTo(0)));
    }
}
