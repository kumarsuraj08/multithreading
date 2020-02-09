package thread.execution.two.synchronijed.method.sameobject;

import threads.GenericThreadClass;

public class StarterClass {

	public static void main(String[] args) {
		ClassWith2SynchrnijedMethod obj = new ClassWith2SynchrnijedMethod();
		ClassWith2SynchrnijedMethod obj1 = new ClassWith2SynchrnijedMethod();
/*		thread t2 starts execution only after t1 completes as they are calling different sychronijed 
		method on the same object, on the other hand t3 starts excution in parallel with t1 as its 
		invoked on different object instance
*/		GenericThreadClass<ClassWith2SynchrnijedMethod> t1 = 
				new GenericThreadClass<ClassWith2SynchrnijedMethod>(obj, "printLineThread");
		
		GenericThreadClass<ClassWith2SynchrnijedMethod> t2 = 
				new GenericThreadClass<ClassWith2SynchrnijedMethod>(obj, "printStringThread");
				
		GenericThreadClass<ClassWith2SynchrnijedMethod> t3 = 
				new GenericThreadClass<ClassWith2SynchrnijedMethod>(obj1, "printStringThread thread three");

	}

}
