//Colin Gagich 1224692 gagichce@mcmaster.ca
//November 2013
//This is a main class, to run files and get things going and such
public class mainRun {

	public static void main(String[] args) throws Exception {
		Stack myStack = new Stack('t');
		myStack.push('d');
		myStack.push('e');
		myStack.push('f');
		myStack.show(System.out);
		Queue myQueue = new Queue();
		myQueue.enqueue('c');
		myQueue.enqueue('e');
		myQueue.enqueue('f');
		myQueue.enqueue('f');
		myQueue.enqueue('f');
		myQueue.enqueue('f');
		myQueue.enqueue('f');
		System.out.println(myQueue.peek());
		myQueue.enqueue('f');
		myQueue.enqueue('f');
		myQueue.enqueue('f');
		myQueue.dequeue();
		
		myQueue.show(System.out);
		PriorityQueue Pq = new PriorityQueue();
		Pq.insertItem(3, 'g');
		Pq.insertItem(Integer.MAX_VALUE, '�');
		
		
		Pq.insertItem(4, 'g');
		SnocList myScno = new SnocList('a', new SnocList('p', new SnocList('p',null)));
		
		Pq.insertItem(4, 'h');
		Pq.insertItem(Integer.MAX_VALUE, '�');
		Pq.insertItem(Integer.MAX_VALUE, '�');
		Pq.insertItem(2, 'g');
		Pq.insertItem(4, 'f');
		Pq.insertItem(6, 'g');

		Pq.show(System.out);
		System.out.println(myStack.isEmpty());
	}

}
