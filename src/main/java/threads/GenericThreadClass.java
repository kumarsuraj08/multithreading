package threads;

import thread.execution.two.synchronijed.method.sameobject.ClassWith2SynchrnijedMethod;

public class GenericThreadClass<T> implements Runnable {
	T obj;
	Thread t = null;
	
	public GenericThreadClass(T obj, String threadName) {
		this.obj = obj;
		t = new Thread(threadName);
		t.start();
	}

	@Override
	public void run() {
		if (t.getName().equals("printLineThread")) {
			((ClassWith2SynchrnijedMethod)this.obj).printLine();
		} else {
			((ClassWith2SynchrnijedMethod)this.obj).printString();
		}
	}
}
