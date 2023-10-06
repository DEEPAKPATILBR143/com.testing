package com.experimento;

public abstract class Testing2 implements Testing1{

	public void name() {
		System.out.println("name");
	}
	protected abstract void name1();
		
	public static int add(int a,int b) {
		System.out.println("in addddd ");
		int sum = a + b;
		return sum;
	}
	
	public static int sub(int a,int b) {
	System.out.println("in subsss");
		int sum = a - b;
		return sum;
	}

	public  int tst2() {
		int i=10,j=5;
		int y = add(i, j);
		int z= sub(i,j);
		System.out.println("add method   "+y+"  sub method    "+z);
		return z;
	}
	
	public Testing2() {
		// TODO Auto-generated constructor stub
		System.out.println("Class constructor");
	}
		public static void main(String args[]) {
			
			Testing2 bt = new Testing2() {
				
				@Override
				protected void name1() {
					// TODO Auto-generated method stub
				System.out.println("in name1111");	
				}
				
			};

			bt.name1();
			bt.tst2();
		}
}
