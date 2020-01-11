package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{

	
	int a;
	int b;
	
	public MyCalculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	
	@Override
	public void plus() {
		int p = a+b;
		System.out.println(a + " + " + b + " = " + p);		
	}

	@Override
	public void minus() {
		int m = a-b;
		System.out.println(a + " - " + b + " = " + m);
	}

	@Override
	public void multiply() {
		int mp = a*b;
		System.out.println(a + " * " + b + " = " + mp);
		
	}

	@Override
	public void devide() {
		int d = a/b;
		System.out.println(a + " / " + b + " = " + d);
		
	}

}
