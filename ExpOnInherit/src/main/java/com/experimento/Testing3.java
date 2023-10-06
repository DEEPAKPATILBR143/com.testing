package com.experimento;

import org.springframework.beans.factory.annotation.Autowired;

public class Testing3 implements Testing1{

	@Autowired
	static
	Testing2 testing2;
	public void tst3() {
		System.out.println("333333");
		
	}
	public static void main(String args[]) {	
		/*
		 * Testing3 tst = new Testing3(); tst.tst2(); tst.tst3(); tst.tst1();
		 * tst.name();
		 */
		System.out.println("first");
		Testing3 dum = new Testing3();
		testing2.tst2();
		dum.tst3();
		
		
}
	
	protected void name1() {
		// TODO Auto-generated method stub
		System.out.println("in 3333");
	}

}