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
		PQdoubleLink<Integer> tes = new PQdoubleLink<Integer>();
		tes.insertItem(4, 3);
		tes.insertItem(5, 3);
		tes.insertItem(6, 3);
		tes.insertItem(6, 90);
		tes.insertItem(1, 3);
		tes.insertItem(90, 3);
		tes.insertItem(2, 3);
		tes.insertItem(123, 123);
		tes.insertItem(1, 3);
		tes.insertItem(-1, 3);
		tes.show(System.out);
		System.out.println("");
	}

}
