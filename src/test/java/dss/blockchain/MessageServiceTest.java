package dss.blockchain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MessageServiceTest {

	
	@Test
	void testGet() {
		assertEquals("Hello JUnit 5", MessageService.get());
	}
	
	@Test
	void testGet1() {
		assertEquals("Hello JUnit 4", MessageService.get());
	}

}
