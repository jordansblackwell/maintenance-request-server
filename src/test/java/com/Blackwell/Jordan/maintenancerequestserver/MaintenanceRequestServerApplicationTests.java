package com.Blackwell.Jordan.maintenancerequestserver;

import com.Blackwell.Jordan.maintenancerequestserver.domain.maintenanceRequest.models.MaintenanceRequest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class MaintenanceRequestServerApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void testConstructor() {
		MaintenanceRequest request = new MaintenanceRequest(1L, "Allegra", "Garland", "allegragarland@example.com", "A101", "Roach infestation in kitchen");

		assertEquals(1L, request.getId());
		assertEquals("Allegra", request.getFirstName());
		assertEquals("Garland", request.getLastName());
		assertEquals("allegragarland@example.com", request.getEmail());
		assertEquals("A101", request.getAptNumber());
		assertEquals("Roach infestation in kitchen", request.getDescription());
	}
}

