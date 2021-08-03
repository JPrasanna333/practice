package com.prasanna.Opps;

public class MainBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoldenEagle ge = new GoldenEagle();
		SerpentEagle se = new SerpentEagle();
		VegSparrow vs = new VegSparrow();
		NonVegSparrow nvs = new NonVegSparrow();
		InSky s = new InSky();
		s.permitBirds(ge);
		s.permitBirds(se);
		s.permitBirds(vs); 
		s.permitBirds(nvs);
		
	}

}
