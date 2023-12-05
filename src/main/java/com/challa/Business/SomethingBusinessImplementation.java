package com.challa.Business;

public class SomethingBusinessImplementation {

	private DataService dataService;
	
	public SomethingBusinessImplementation(DataService dataService) {
		super();
		this.dataService=dataService;
		
	}

	public int FindTheGreatestFromAllData() {
		int[] data=dataService.retrieveAllData();
		int GreatestValue=Integer.MIN_VALUE;
		for(int value:data) {
		if( value> GreatestValue) {
			GreatestValue=value;
		}
		}
		return GreatestValue;
	}
}
interface DataService{
	int[] retrieveAllData();
}