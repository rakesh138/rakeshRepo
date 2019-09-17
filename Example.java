package com.nt.abstraction;

 /*     Advantages of Abstraction
  *      
  * 1. We can achieve security.becoz we r hiding internal implementation details.
  * 2. without affecting outside person ,we can able to perform any type of changes in our 
  *   internal system and hence enhancement will become easy.
  * 3.it improves maintainability of the application
  * 4.it improves easiness to use our system  */
        
 abstract class Example {
	
	abstract void m1();
	
	static int a=90;
	int x;
	public Example(int x) {
	
		this.x = x;
	}

	
	
	static {
		System.out.println("From abstract class Static block");
	}
	{
		System.out.println("from abstract class Non-static block");
	}
	
   
	static void m2() {
		System.out.println("Example Static method");
	}
	void m3() {
		System.out.println("abstract class Non-static method");
	}
	 public void m3(){
		 System.out.println("hii From Repository");
	 }
	
}
