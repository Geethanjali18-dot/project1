package com.actitime.generics;

import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		FileLib f=new FileLib();
		f.getExcelData("CreateCustomer", 1, 4);
	}

}
