package com.spring.pub_sub_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class PubSubAppApplicationTests {

	@Test
	void contextLoads() {
	}

}
