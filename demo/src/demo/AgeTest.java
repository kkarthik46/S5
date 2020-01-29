package demo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AgeTest {
	Age age;
	@Before
	public void inti()
	{
		age=new Age();
	}
	
	@Test
	public void test() {
		
		assertEquals("eligible to vote",age.election(20));
	}
	@Test
	public void test1() {
		
		assertEquals("eligible to vote",age.election(23));
	}
}
