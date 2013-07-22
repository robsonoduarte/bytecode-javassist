package br.com.mystudies.bytecode.javassist;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.util.HotSwapper;

public class ReplaceClass {

	
	private ClassPool classPool = ClassPool.getDefault();

	private ReplaceClassProperties replaceClassProperties;
	
	
	
	public ReplaceClass() {
		replaceClassProperties = new ReplaceClassProperties();
	}
	
	
	public void replaceBodyMethod() throws Exception {	
		reloadByteCode(replaceMethod(getConcreteClass(), getAdpaterClass()));
	}


	
	private CtClass replaceMethod(CtClass concreteClass, CtClass adpaterClass) throws Exception{
		String methodName = replaceClassProperties.getNameMethodToReplace();
		concreteClass.getDeclaredMethod(methodName).setBody(adpaterClass.getDeclaredMethod(methodName), null);
		return concreteClass;
	}
	
	
	
	private void reloadByteCode(CtClass ctClass) throws Exception{
		new HotSwapper(8000).reload(ctClass.getName(), ctClass.toBytecode());
	}

	
	private CtClass getAdpaterClass() throws Exception {
		return getCtClass(replaceClassProperties.getNameAdapterClass());
	}



	private CtClass getConcreteClass() throws Exception {
		return getCtClass(replaceClassProperties.getNameConcreteClass());
	}

	
	
	private CtClass getCtClass(String nameClass) throws Exception {
		return classPool.get(nameClass);
	}
		
}
