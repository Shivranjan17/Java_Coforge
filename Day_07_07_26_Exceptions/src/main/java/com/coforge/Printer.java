package com.coforge;

import java.io.Closeable;
import java.io.IOException;

public class Printer implements Closeable {
	
	public void usePrinter() {
		System.out.println("Printer is ready to use ,start Printing");
	}
	
	
	public void close() throws IOException{
		System.out.println("Printer Closed by Try with resources automatically");
	}

}
