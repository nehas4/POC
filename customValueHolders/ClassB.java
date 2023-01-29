package customValueHolders;

import org.omg.CORBA.BooleanHolder;
import org.omg.CORBA.IntHolder;
import org.omg.CORBA.StringHolder;

public class ClassB {

	void tesHolderUse(BooleanHolder boolVal, IntHolder intVal, StringHolder stringVal)
	{
		boolVal.value=!boolVal.value;
		intVal.value=intVal.value*2;
		stringVal.value=stringVal.value+"."+stringVal.value;
	}
	
	void tesHolderUse(CustomBooleanHolder boolVal, CustomIntHolder intVal, CustomStringHolder stringVal)
	{
		boolVal.value=!boolVal.value;
		intVal.value=intVal.value*2;
		stringVal.value=stringVal.value+"."+stringVal.value;
	}
	
	void tesHolderUse(Boolean boolVal, Integer intVal, String stringVal)
	{
		boolVal=!boolVal;
		intVal=intVal*2;
		stringVal=stringVal+"."+stringVal;
	}
}
