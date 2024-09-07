package com.alok.automation.buildpacks;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class BuildpacksApplicationTests {

	@Test
	void contextLoads() {
	}

}
