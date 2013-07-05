package br.com.mystudies.bytecode.javassist;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TempTest {

	private Temp temp;



	@Before
	public void setUp() throws Exception {
		temp = new Temp();
	}
	
	

/*	@After
	public void tearDown() throws Exception {
	}*/

	
	
	@Test
	public void test() throws Exception {
		
		temp.replace();
		
		
		Service service = new Service();
		
		assertThat(service.execute("service"), equalTo("ADAPTER SERVICE"));
		
		
	}
	
	
	

}
