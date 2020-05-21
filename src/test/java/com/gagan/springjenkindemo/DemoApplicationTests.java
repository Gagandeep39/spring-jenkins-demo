/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-05-21 22:55:46
 * @modify date 2020-05-21 22:55:46
 * @desc [description]
 */

package com.gagan.springjenkindemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		assertEquals("Hello", "Hello");
	}

}
