package com.cg.CSVReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) {
		String path = "C:\\Users\\mohit\\Downloads\\FL_insurance_sample.csv\\FL_insurance_sample.csv";
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((line = br.readLine()) != null) {
				String[] value = line.split(",");
				System.out.println(value[0]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
