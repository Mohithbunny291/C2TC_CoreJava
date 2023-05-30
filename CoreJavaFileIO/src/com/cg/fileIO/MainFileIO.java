package com.cg.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainFileIO {

	public static void main(String[] args) {
		try {
			BufferedWriter BW = new BufferedWriter(new FileWriter("Output.java"));
			BW.write("public class Output {\r\n"
					+ "\r\n"
					+ "	public static void main(String[] args) {\r\n"
					+ "		// TODO Auto-generated method stub\r\n"
					+ "		System.out.println(\"HI\");\r\n"
					+ "		System.out.println(\"moih\");\r\n"
					+ "	}\r\n"
					+ "\r\n"
					+ "}");
			BW.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedReader BR = new BufferedReader(new FileReader("Output.java"));
			try {
				String s;
				while ((s = BR.readLine()) != null) {
					System.out.println(s);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				BR.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
