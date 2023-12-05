package com.challa.Business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinsessImpStublTest {

	@Test
	void FindTheGreatestNumber_BasicScenario() {
		DataserviceStub dataserviceStub = new DataserviceStub();
		SomethingBusinessImplementation businessImplementation = new SomethingBusinessImplementation(dataserviceStub);
		int result = businessImplementation.FindTheGreatestFromAllData();
		assertEquals(55, result);

	}
	@Test
	void FindTheGreatestNumber_One() { 
		DataserviceStub1 dataserviceStub = new DataserviceStub1();
		SomethingBusinessImplementation businessImplementation = new SomethingBusinessImplementation(dataserviceStub);
		int result = businessImplementation.FindTheGreatestFromAllData();
		assertEquals(99, result);
	}

}

class DataserviceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 25, 55, 18 };
	}
}
class DataserviceStub1 implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 99 };
	}
}