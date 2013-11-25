//Colin Gagich 1224692 gagichce@mcmaster.ca
//November 2013
//This is a main class, to run files and get things going and such
public class mainRun {

	public static void main(String[] args) throws Exception {
		Stack myStack = new Stack('t');
		myStack.push('d');
		myStack.push('e');
		myStack.push('f');
		myStack.pop();
		Queue myQueue = new Queue();
		myQueue.enqueue('c');
		myQueue.enqueue('e');
		myQueue.enqueue('f');
		myQueue.dequeue();
		System.out.println(myQueue.peek());
		System.out.println(myStack.isEmpty());
		
		PriorityQueue Pq = new PriorityQueue();
		Pq.insertItem(3, 'g');
		Pq.insertItem(Integer.MAX_VALUE, 'ÿ');
		
		
		Pq.insertItem(4, 'g');
		
		
		Pq.insertItem(4, 'h');
		Pq.insertItem(Integer.MAX_VALUE, 'þ');
		Pq.insertItem(Integer.MAX_VALUE, 'û');
		Pq.insertItem(2, 'g');
		Pq.insertItem(4, 'f');
		Pq.insertItem(6, 'g');

		Pq.show();
		System.out.println(myStack.isEmpty());
	}

}
