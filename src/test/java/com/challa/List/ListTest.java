package com.challa.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest {
	
	@Test
	void SimpleList() {
		List listMock=mock(List.class);
		when(listMock.size()).thenReturn(3);
		assertEquals(3, listMock.size());
	}
	@Test
	void MultipleReturns() {
		List listMock=mock(List.class);
		when(listMock.size()).thenReturn(1).thenReturn(2).thenReturn(4);
		assertEquals(1, listMock.size());
		assertEquals(2, listMock.size());
		assertEquals(4, listMock.size());
		
	}
	
	@Test
	void SpecificParameter() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("SomethingString");
		assertEquals("SomethingString", listMock.get(0));
		assertEquals(null, listMock.get(2));
	}
	@Test
	void GenericParameter() {
		List listMock = mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("SomethingString");
		assertEquals("SomethingString", listMock.get(0));
		assertEquals("SomethingString", listMock.get(2));
		assertEquals("SomethingString", listMock.get(3));
	}
	
	

}
