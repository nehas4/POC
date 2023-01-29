package customValueHolders;

import org.omg.CORBA.BooleanHolder;
import org.omg.CORBA.IntHolder;
import org.omg.CORBA.StringHolder;

public class ClassC 
{
	
	void testCorbaHolders(BooleanHolder bool, IntHolder val, StringHolder str)
	{
		ClassB classB = new ClassB();
		classB.tesHolderUse(bool, val, str);
	}
	
	void testCustomHolders(CustomBooleanHolder bool, CustomIntHolder val, CustomStringHolder str)
	{
		ClassB classB = new ClassB();
		classB.tesHolderUse(bool, val, str);
	}
	
	void testWrappers(Boolean bool, Integer val, String str)
	{
		ClassB classB = new ClassB();
		classB.tesHolderUse(bool, val, str);
	}
}
