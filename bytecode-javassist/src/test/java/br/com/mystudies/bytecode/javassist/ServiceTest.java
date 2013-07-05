package br.com.mystudies.bytecode.javassist;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ServiceTest {

	private Service service;



	@Before
	public void setUp() throws Exception {
		service = new Service();
	}

	
	
	@Test
	public void test() {
		assertThat(service.execute("service"), equalTo("REALLY SERVICE"));
	}

	
}
