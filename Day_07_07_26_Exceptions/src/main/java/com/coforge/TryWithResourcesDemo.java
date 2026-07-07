package com.coforge;

import java.io.IOException;

public class TryWithResourcesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Printer printer = new Printer()){
			printer.usePrinter();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
