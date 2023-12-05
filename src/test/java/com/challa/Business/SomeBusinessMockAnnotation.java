package com.challa.Business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockAnnotation {

	@Mock
	private DataService dataService;
	
	@InjectMocks
	private SomethingBusinessImplementation businessImplementation;
	
	@Test
	void FindtheGreatestFromAllData_BasicScenario() {
		when(dataService.retrieveAllData()).thenReturn(new int[] {25,15,5});
		assertEquals(25, businessImplementation.FindTheGreatestFromAllData());
		
	}
	@Test
	void FindtheGreatestFromAllData_OneValue() {
		when(dataService.retrieveAllData()).thenReturn(new int[] {18});
		assertEquals(18, businessImplementation.FindTheGreatestFromAllData());
		
	}
	@Test
	void FindTheGreatestFromAllData_EmptyValues() {
		when(dataService.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, businessImplementation.FindTheGreatestFromAllData());
	}
}
