package com.coforge;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CheckedExceptionsDemo {
	
	public static void readFile() throws FileNotFoundException {
//		File f = new File("data.txt");
//		Scanner sc = new Scanner(f);
//		System.out.println(sc.nextLine());
		
		try(Scanner sc = new Scanner(new File("data.txt"))){
			System.out.println(sc.nextLine());
		}
		catch(FileNotFoundException f) {
			f.printStackTrace();
		}
	}

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		
		readFile();
		


	}

}
