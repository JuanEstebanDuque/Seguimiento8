package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import model.Country;
import model.CountryData;


public class Main {
	public static void main(String[] args) {
		
		CountryData data = new CountryData();
		try {
			String path = "PaisesCompe.txt";
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String line = "";
			String[] country;
			line = br.readLine();
			int n = Integer.parseInt(line);
			for (int i=0;i<n;i++) {
				line = br.readLine();
				System.out.println(line);
				country = line.split(";");
				data.country.add(new Country(country[0], Integer.parseInt(country[1]), Integer.parseInt(country[2]),
						Integer.parseInt(country[3]), Integer.parseInt(country[4]), Integer.parseInt(country[5]),
						Integer.parseInt(country[6])));
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("Masculino");
		Collections.sort(data.country);
		for(int i=0;i<data.country.size();i++) {
			System.out.println(data.country.get(i).getName()+ " " +data.country.get(i).getGoldMedalFemale()+ " " + data.country.get(i).getSilverMedalFemale() + " " + data.country.get(i).getGoldMedalFemale());
		}
		System.out.println("----------");
		System.out.println("");
		System.out.println("Femenino");
		data.sortByName();
		for(int i=0;i<data.country.size();i++) {
			System.out.println(data.country.get(i).getName()+ " " +data.country.get(i).getGoldMedalFemale()+ " " + data.country.get(i).getSilverMedalFemale() + " " + data.country.get(i).getGoldMedalFemale());
		}
		System.out.println("----------");
		System.out.println("");
		System.out.println("Combinado");
		Country x;
		
		for(int i=0;i<data.country.size();i++) {
			for(int j=i+1;j<data.country.size();j++) {
				if(data.country.get(j).getTotalGold() > data.country.get(i).getTotalGold()) {
					x = data.country.get(j);
					data.country.remove(j);
					data.country.add(i, x);
				}
			}
		}
		for(int i=0;i<data.country.size();i++) {
			System.out.println(data.country.get(i).getName()+ " " +data.country.get(i).getGoldMedalFemale()+ " " + data.country.get(i).getSilverMedalFemale() + " " + data.country.get(i).getGoldMedalFemale());
		}
	}
	

}
