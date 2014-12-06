//Colin Gagich 1224692 gagichce@mcmaster.ca
//November 2013
//This is a main class, to run files and get things going and such
public class mainRun {

	public static void main(String[] args) throws Exception {
		Stack myStack = new Stack('t');
		myStack.push('d');
		myStack.push('e');
		myStack.push('f');
		myStack.reverse(myStack.top);
		myStack.show(System.out);
		myStack.reverse(myStack.top);
		myStack.show(System.out);
		StringBuffer test = new StringBuffer();
		myStack.show(test);
		System.out.println(test.toString());
//		Queue myQueue = new Queue();
//		myQueue.enqueue('c');
//		myQueue.enqueue('e');
//		myQueue.enqueue('f');
//		myQueue.enqueue('f');
//		myQueue.enqueue('f');
//		myQueue.enqueue('f');
//		myQueue.enqueue('f');
//		System.out.println(myQueue.peek());
//		myQueue.enqueue('f');
//		myQueue.enqueue('f');
//		myQueue.enqueue('f');
//		myQueue.dequeue();
//		
//		myQueue.show(System.out);
		PriorityQueue Pq = new PriorityQueue();
		Pq.insertItem(3, 'g');
		Pq.insertItem(Integer.MAX_VALUE, 'ÿ');
		
		
		Pq.insertItem(4, 'g');
		Pq.insertItem(4, 'h');
		Pq.insertItem(Integer.MAX_VALUE, Character.MAX_VALUE);
		Pq.insertItem(Integer.MAX_VALUE, 'û');
		Pq.insertItem(2, 'g');
		Pq.insertItem(4, 'f');
		Pq.insertItem(6, 'g');

		Pq.show(System.out);
		System.out.println(myStack.isEmpty());
		
		PriorityQueue myQueue = new PriorityQueue();
		myQueue.insertItem(234, 'k');
		myQueue.insertItem(23, 'k');
		myQueue.insertItem(5, 'k');
		myQueue.insertItem(345, 'k');
		myQueue.insertItem(234, 's');
		myQueue.insertItem(6, 'k');
		myQueue.insertItem(765, 'k');
		myQueue.insertItem(34, 'k');
		myQueue.insertItem(-6, 'k');
		myQueue.insertItem(2345, 's');
		myQueue.insertItem(536456, 'k');
		myQueue.insertItem(-04, 'k');
		myQueue.insertItem(4789, 'k');
		myQueue.insertItem(21123, 'k');
		myQueue.insertItem(536456, 'k');
		
		StringBuffer tester = new StringBuffer();
		myQueue.show(tester);
		System.out.println(tester.toString());
	}

}
