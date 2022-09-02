package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest01 {
  @Test
  public void test() {
	  System.out.println("IN TEST");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before TEST");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After TEST");

  }

}
