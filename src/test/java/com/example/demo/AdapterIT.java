package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AdapterIT {

	@Test
	void getNumberTest() {

		Adapter.getContract();

	}

}
