package Collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QuequeDemo {

	public static void main(String[] args) {
		
		Queue q=new ArrayDeque();
       q.add(4);
       q.add("reena");
       q.add(5);
       System.out.println(q);
       System.out.println(q.getClass());
       System.out.println(q.isEmpty());
       System.out.println(q.offer(3));
       System.out.println(q.spliterator());
       System.out.println(q.iterator());
       System.out.println(q.size());
       System.out.println(q.retainAll(q));
	}

}
