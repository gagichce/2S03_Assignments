public class PriorityQueue {
	private PList head;
	private PList tail;
	private final PList maxValue = new PList(Integer.MAX_VALUE, 'ÿ');

	public PriorityQueue() {

		this.head = null;
		this.tail = null;
	}

	public PriorityQueue(int priority, char c) {

		this.head = new PList(priority, c);
		this.tail = this.head;
	}

	public char next() throws Exception {

		if (isEmpty())
			throw new Exception();
		return head.getValue();
	}

	public void deleteItem() {

		if (this.head.equals(this.tail)) {
			this.head = null;
			this.tail = null;
		} else {
			PList oldHead = this.head;
			this.head = this.head.getNext();
			oldHead.setNext(null);
		}
	}

	public void insertItem(int priority, char c) {

		PList toAdd = new PList(priority, c);
		if (!isEmpty()) {
			maxValue.setNext(this.head);
			this.head = maxValue;
			insertItem(toAdd, this.head);
			this.head = this.head.getNext();
			maxValue.setNext(null);
		} else {
			this.head = toAdd;
			this.tail = toAdd;
		}

	}

	private void insertItem(PList toAdd, PList location) {

		if (location.getNext() == null) {
			location.setNext(toAdd);
			this.tail = toAdd;
		} else {
			if (toAdd.getPriority() > location.getNext().getPriority()) {
				toAdd.setNext(location.getNext());
				location.setNext(toAdd);
			} else if (toAdd.getPriority() == location.getNext().getPriority()) {
				if (toAdd.getValue() >= location.getNext().getValue()) {
					toAdd.setNext(location.getNext());
					location.setNext(toAdd);
				} else
					insertItem(toAdd, location.getNext());
			}
			else 
				insertItem(toAdd, location.getNext());
		}
	}

	public boolean isEmpty() {

		return this.head == null && this.tail == null;
	}

	public void show() {

		if (!isEmpty()) {
			PList current = this.head;
			do {
				System.out.println("Priority: " + current.getPriority()
						+ " Value: " + current.getValue());
				current = current.getNext();
			} while (current != null);
		} else {
			System.out.println("Queue is empty");

		}
	}
}
