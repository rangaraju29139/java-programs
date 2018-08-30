
public class WorkerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//widening
       Manager m= new Worker();
       Worker w=(Worker)m;
       w.max(3, 4);
       w.max(3.2, 3.2);
       w.max(3L, 2L);
	}

}
