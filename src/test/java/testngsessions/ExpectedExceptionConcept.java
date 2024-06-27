package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	String name;
	
	
	
	@Test(priority = 1, description = "add to cart test", expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void addToCartTest() {
		System.out.println("add to cart test");
		
		int i = 9/0;
		System.out.println("Hello");
		ExpectedExceptionConcept obj = null;
		System.out.println(obj.name);//NPE
	}

}
