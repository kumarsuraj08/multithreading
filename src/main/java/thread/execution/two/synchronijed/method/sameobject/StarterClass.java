package thread.execution.two.synchronijed.method.sameobject;

import threads.GenericThreadClass;

public class StarterClass {

	public static void main(String[] args) {
		ClassWith2SynchrnijedMethod obj = new ClassWith2SynchrnijedMethod();
		GenericThreadClass<ClassWith2SynchrnijedMethod> t1 = 
				new GenericThreadClass<ClassWith2SynchrnijedMethod>(obj, "printLineThread");
		
		GenericThreadClass<ClassWith2SynchrnijedMethod> t2 = 
				new GenericThreadClass<ClassWith2SynchrnijedMethod>(obj, "printStringThread");
	}

}
