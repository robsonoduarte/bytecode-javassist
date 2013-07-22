package br.com.mystudies.bytecode.javassist;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ReplaceClassTest {

	
	private ReplaceClass replaceClass;



	@Before
	public void setUp() throws Exception {
		replaceClass = new ReplaceClass();
	}
	

	
	
	@Test
	public void test() throws Exception {
		
		Service service = new Service();
		
		replaceClass.replaceBodyMethod();
		
		assertThat(service.execute("service"), equalTo("ADAPTER SERVICE"));
	}
	

}
