package br.com.mystudies.bytecode.javassist;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ReplaceClassPropertiesTest {

	private ReplaceClassProperties replaceClassProperties;


	@Before
	public void setUp() throws Exception {
		replaceClassProperties = new ReplaceClassProperties();
	}


	
	@Test
	public void test() {
		assertThat(replaceClassProperties.getNameConcreteClass(), equalTo("br.com.mystudies.bytecode.javassist.Service"));
		assertThat(replaceClassProperties.getNameAdapterClass(), equalTo("br.com.mystudies.bytecode.javassist.ServiceAdapter"));
		assertThat(replaceClassProperties.getNameMethodToReplace(), equalTo("execute"));
	}

	
}
