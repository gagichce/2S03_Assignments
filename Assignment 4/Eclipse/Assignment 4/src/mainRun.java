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
		System.out.println(myQueue.peek());
		myQueue.dequeue();
		System.out.println(myQueue.peek());
		System.out.println(myStack.isEmpty());
		System.out.println("this");
	}

}
