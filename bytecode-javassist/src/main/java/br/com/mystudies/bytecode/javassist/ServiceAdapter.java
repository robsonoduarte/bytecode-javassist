package br.com.mystudies.bytecode.javassist;

public class ServiceAdapter {

	public String execute(String string) {
		return "ADAPTER " + string.toUpperCase() ;
	}

}
