package br.com.mystudies.bytecode.javassist;

import java.io.IOException;
import java.util.Properties;

public class ReplaceClassProperties {

	
	private Properties properties;
	
	
	
	public ReplaceClassProperties() {
		load();
	}


	
	


	private void load() {
		try {
			properties = new Properties();
			properties.load(this.getClass().getResourceAsStream("/replace-information.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}





	public String getNameConcreteClass() {
		return getProperties("concrete-class");
	}


	public String getNameAdapterClass() {
		return getProperties("adapter-class");
	}


	public String getNameMethodToReplace() {
		return getProperties("method-replace");
	}


	
	
	private String getProperties(String key) {
		return properties.getProperty(key);
	}








	
}
