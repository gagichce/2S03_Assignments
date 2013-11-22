public class Queue {
	private SnocList head;
	private SnocList tail;

	public Queue() {

		head = null;
		tail = null;
	}

	public char peek() throws Exception {

		if (isEmpty()) {
			throw new Exception();
		}
		return head.value;
	}

	public void dequeue() {

		if (!isEmpty())
			head = head.next;
	}
	
	public void enqueue(char c){
		if(isEmpty()){
			head = new SnocList(c);
			tail = head;
		}
		else{
			tail.next = new SnocList(c);
			tail = tail.next;
		}
	}

	public boolean isEmpty() {

		return head == null && tail == null;
	}
}
