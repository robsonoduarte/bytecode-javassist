package br.com.mystudies.bytecode.javassist;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ServiceAdapterTest {

	
	private ServiceAdapter serviceAdapter;



	@Before
	public void setUp() throws Exception {
		serviceAdapter = new ServiceAdapter();
	}


	
	@Test
	public void test() {
		assertThat(serviceAdapter.execute("service"), equalTo("ADAPTER SERVICE"));
	}

	
	
}
