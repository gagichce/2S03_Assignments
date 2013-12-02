package Bonus;

public class mainTester {

	public static void main(String[] args) {

		Queue<String> myStringQueue = new Queue<String>();

		myStringQueue.enqueue("this");
		myStringQueue.enqueue("that");
		myStringQueue.enqueue("oops");
		myStringQueue.enqueue("hi");
		myStringQueue.dequeue();
		myStringQueue.show(System.out);
		PriorityQueue<Integer> myQueue = new PriorityQueue<Integer>();
		myQueue.insertItem(1, 4);
		myQueue.insertItem(1, 5);
		myQueue.insertItem(2, 6);
		myQueue.insertItem(1, 7);
		myQueue.insertItem(1, 3);
		myQueue.deleteItem();
		// myQueue.show(System.out);
		PQdoubleLink<Boolean> myPqBool = new PQdoubleLink<Boolean>();
		myPqBool.insertItem(4, true);
		myPqBool.insertItem(2, true);
		myPqBool.insertItem(78, true);
		myPqBool.insertItem(234, true);
		myPqBool.insertItem(3, true);
		myPqBool.insertItem(234, true);
		myPqBool.insertItem(786, true);
		myPqBool.insertItem(234, true);
		myPqBool.insertItem(2, true);
		myPqBool.insertItem(234, true);
		myPqBool.insertItem(1, false);
		myPqBool.insertItem(2, false);
		myPqBool.insertItem(3, false);
		myPqBool.insertItem(78, false);
		myPqBool.insertItem(3, false);
		myPqBool.insertItem(4, false);
		myPqBool.insertItem(41, false);
		myPqBool.show(System.out);
		System.out.println("");
	}

}
