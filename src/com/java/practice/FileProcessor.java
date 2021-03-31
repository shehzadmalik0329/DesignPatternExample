package com.java.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FileProcessor {
	
	FileProcessor() throws FileNotFoundException{
//		File file = new File("");
//		BufferedReader br = new BufferedReader(new FileReader(file));
		
	}
	
	public void print(int number){
		System.out.println("Print int:"+number);
	}
	
	public void print(Integer number){
		System.out.println("Print Integer:"+number);
	}
	
	public static void main(String[] args){
		try {
			FileProcessor fp = new FileProcessor();
			fp.print(new Integer(1));
			
			final List<String> names = new ArrayList<String>();
			
			names.add("Shehzad");
			names.add("Haris");
			names.add("Qais");
			
			names.remove(2);
			System.out.println("In try");
//			names = new LinkedList<String>();
			throw new FileNotFoundException();
			
		} catch (FileNotFoundException e) {
			System.out.println("In catch");
//			e.printStackTrace();
		} finally {
			System.out.println("In finally");
		}
		
		System.out.println("Outside finally");
	}

}

