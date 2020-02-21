package com.actitime.generics;

import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		System.out.println(url);
		String status = f.getExcelData("CreateCustomer",1, 4);
		System.out.println(status);
		
	   
	}

}
