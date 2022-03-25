package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CountryData {
	public ArrayList<Country> country;
	
	public CountryData(){
		country = new ArrayList<>();
	}
	
	public void addCountry(Country p) {
		country.add(p);
	}
	
	public void sortByName() {
		Collections.sort(country, new Comparator<Country>() {

			@Override
			public int compare(Country o1, Country o2) {
				if(o1.goldMedalMale-o2.goldMedalMale ==0 ){
					if(o1.silverMedalMale-o2.silverMedalMale == 0) {
						if(o1.bronzeMedalMale-o2.bronzeMedalMale == 0) {
							return o1.name.compareTo(o2.name);
						} else {
							return o1.bronzeMedalMale-o2.bronzeMedalMale;
						}
					} else {
						return o1.silverMedalMale-o2.silverMedalMale;
					}
				}else {
					return o1.goldMedalMale-o2.goldMedalMale;
				}
			}
		});
	}
}
