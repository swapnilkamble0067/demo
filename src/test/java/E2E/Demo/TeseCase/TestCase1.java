package E2E.Demo.TeseCase;

import org.testng.annotations.Test;

public class TestCase1 {

	
		@Test(priority = 1)
		public void login() {
			System.out.println("User logged in Successfully with valid credentials");
		}
		
		
		@Test(priority = 2)
		public void policyCreated() {
			System.out.println("Insurance Policy is created Successfully with zedo dep");
		}
		
		@Test(priority = 3)
		public void downloadPolicy() {
			System.out.println("User downloaded Policy  Successfully");
		}
		
		@Test(priority = 4)
		public void logout() {
			System.out.println("User logged out Successfully.");
		}

	

}
