package thread.execution.two.synchronijed.method.sameobject;

public class ClassWith2SynchrnijedMethod {
	
	public synchronized void printLine() {
		int counter = 0;
		while(true) {
			if (counter++ == 50)break;
			System.out.println("priniting line " + Thread.currentThread().getName() + 
					" " + counter);
		}
	}

	public synchronized void printString() {
		int counter = 0;
		while(true) {
			if (counter++ == 50)break;
			System.out.println("priniting string" + Thread.currentThread().getName() + 
					" " + counter);
		}
	}
}
