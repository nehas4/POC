package customValueHolders;

import org.omg.CORBA.BooleanHolder;
import org.omg.CORBA.IntHolder;
import org.omg.CORBA.StringHolder;

public class ClassA {
	
	public static void main(String[] args)
	{
		ClassA classA = new ClassA();
		//classA.holderCallingFunc();
		classA.testAllHolders(false, 100, "test");
	}
	
	void testAllHolders(boolean boolVal, int intVal, String strVal)
	{
		ClassC classC = new ClassC();
		
		BooleanHolder boolHolder = new BooleanHolder(boolVal);
		IntHolder intHolder = new IntHolder(intVal);
		StringHolder stringHolder = new StringHolder(strVal);
		classC.testCorbaHolders(boolHolder, intHolder, stringHolder);
		
		System.out.println("=============Using Corba holders===============");
		System.out.println("Boolean	: Before="+boolVal+"	| After="+boolHolder.value);
		System.out.println("Integer	: Before="+intVal+"		| After="+intHolder.value);
		System.out.println("String	: Before="+strVal+"		| After="+stringHolder.value);
		
		
		CustomBooleanHolder custBool = new CustomBooleanHolder(boolVal);
		CustomIntHolder custInt = new CustomIntHolder(intVal);
		CustomStringHolder custStr = new CustomStringHolder(strVal);
		classC.testCustomHolders(custBool, custInt, custStr);
		
		System.out.println("=============Using Custom holders===============");
		System.out.println("Boolean	: Before="+boolVal+"	| After="+custBool.value);
		System.out.println("Integer	: Before="+intVal+"		| After="+custInt.value);
		System.out.println("String	: Before="+strVal+"		| After="+custStr.value);
		
		Boolean boolWrapper = new Boolean(boolVal);
		Integer intWrapper = new Integer(intVal);
		classC.testWrappers(boolWrapper, intWrapper, strVal);
		
		System.out.println("=============Using Wrapper classes===============");
		System.out.println("Boolean	: Before="+boolVal+"	| After="+boolWrapper);
		System.out.println("Integer	: Before="+intVal+"		| After="+intWrapper);
		System.out.println("String	: Before="+strVal+"		| After="+strVal);
	}
	
	void holderCallingFunc()
	{
		BooleanHolder boolVal = new BooleanHolder(false);
		IntHolder intVal = new IntHolder(100);
		StringHolder stringVal = new StringHolder("Original Value");
		
		System.out.println("=============Original values===============");
		System.out.println("Original boolVal="+boolVal.value);
		System.out.println("Original intVal="+intVal.value);
		System.out.println("Original stringVal="+stringVal.value);
		
		ClassB classB = new ClassB();
		classB.tesHolderUse(boolVal, intVal, stringVal);
		
		System.out.println("\n=============Holder Functions call===============");
		System.out.println("ClassA: After ClassB func called boolVal="+boolVal.value);
		System.out.println("ClassA: After ClassB func called intVal="+intVal.value);
		System.out.println("ClassA: After ClassB func called stringVal="+stringVal.value);
		
		
		CustomBooleanHolder custBool = new CustomBooleanHolder(boolVal.value);
		CustomIntHolder custInt = new CustomIntHolder(intVal.value);
		CustomStringHolder custStr = new CustomStringHolder(stringVal.value);
		classB.tesHolderUse(custBool, custInt, custStr);
		
		System.out.println("\n=============Custom Holder Class call===============");
		System.out.println("Custom boolean Value="+custBool.value);
		System.out.println("Custom integer Value="+custInt.value);
		System.out.println("Custom string Value= "+custStr.value);
	}

}
