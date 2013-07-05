package br.com.mystudies.bytecode.javassist;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.util.HotSwapper;

public class Temp {

	public void replace() throws Exception {
		
		
		Service s = new Service();
		
		ClassPool classPool = ClassPool.getDefault();
		
		CtClass serviceAdapter = classPool.getCtClass("br.com.mystudies.bytecode.javassist.ServiceAdapter");
		
		CtClass service = classPool.getCtClass("br.com.mystudies.bytecode.javassist.Service");
		
		
		
		service.getDeclaredMethod("execute").setBody(serviceAdapter.getDeclaredMethod("execute"), null);
		
		
		new HotSwapper(8000).reload(service.getName(), service.toBytecode());
		
		
	}

}
