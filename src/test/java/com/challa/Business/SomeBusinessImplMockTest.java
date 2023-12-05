package com.challa.Business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class SomeBusinessImplMockTest {

	@Test
	void FindtheGreatestFromAllData_BasicScenario() {
		DataService dataserviceMock=mock(DataService.class);
		when(dataserviceMock.retrieveAllData()).thenReturn(new int[] {25,15,5});
		SomethingBusinessImplementation businessImplementation = new SomethingBusinessImplementation(dataserviceMock);
		assertEquals(25, businessImplementation.FindTheGreatestFromAllData());
		
	}
	@Test
	void FindtheGreatestFromAllData_OneValue() {
		DataService dataserviceMock=mock(DataService.class);
		when(dataserviceMock.retrieveAllData()).thenReturn(new int[] {18});
		SomethingBusinessImplementation businessImplementation = new SomethingBusinessImplementation(dataserviceMock);
		assertEquals(18, businessImplementation.FindTheGreatestFromAllData());
		
	}
}
