package testngsessions;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	@Test(priority = 1, description = "seaerch test")
	public void searchTest() {
		System.out.println("search test");
	}
	

	@Test(priority = -3, description = "add to cart test")
	public void addToCartTest() {
		System.out.println("add to cart test");
	}

	@Test(priority = 2)
	public void checkOutTest() {
		System.out.println("checkout test");
	}
	
	@Test()
	public void paymentTest() {
		System.out.println("payment test");
	}
	
	@Test(priority = -1)
	public void orderTest() {
		System.out.println("order test");
	}
	

}
