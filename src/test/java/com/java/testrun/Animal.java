package com.java.testrun;

public class Animal {

	// code ==>method

	public void getSalary() throws Exception {//checked

		try {
			Thread.sleep(3000);// checked
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}

		int[] a = { 10, 20, 30 };// total index =2

		try {
		
			System.out.println(a[5]);// unchecked= only try catch
			
			} catch (Exception e) {
			//e.printStackTrace();
		}finally {
			
		}
		
		throw new Exception("Password not correct");// new exception
	}

}
