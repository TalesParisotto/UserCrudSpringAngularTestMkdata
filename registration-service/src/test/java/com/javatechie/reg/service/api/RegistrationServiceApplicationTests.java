package com.javatechie.reg.service.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegistrationServiceApplicationTests {


	@Test
	public void findAllUsers() throws Exception {

		assertTimeout(Duration.ofMillis(10000), () -> {
			Thread.sleep(5000);

			System.out.println("I got here");
		});

	}
}
