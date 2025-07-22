package com.hahagilli.module;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JpaMysqlTest {
    @Test
    public void shouldCreateData() {
        assertThat(true).isEqualTo(true);
    }

    @SpringBootApplication
    static class TestConfiguration {
    }
}
