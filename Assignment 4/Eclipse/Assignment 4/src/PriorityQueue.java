import java.io.PrintStream;

public class PriorityQueue implements PriQueue{
	// turns out the end of the list doesn't really matter here
	// because it is never referenced, things are never really added to the tail
	// unless they belong there as this is a priority queue.
	private PList head;
	private final PList maxValue = new PList(Integer.MAX_VALUE, Character.MAX_VALUE);

	public PriorityQueue() {

		this.head = null;
	}

	public PriorityQueue(int priority, char c) {

		this.head = new PList(priority, c);
	}

	public char next() throws ObjectIsEmpty {

		if (isEmpty())
			throw new ObjectIsEmpty("PriQueue is empty!");
		return head.getValue();
	}

	public void deleteItem() {

		if (!isEmpty()) {
			PList temp = this.head;
			this.head = this.head.getNext();
			// dereference just incase of mem leaks, not 100% sure if this is an
			// issue but just making sure
			temp.setNext(null);
		}
	}

	public void insertItem(int priority, char c) {

		this.maxValue.setNext(this.head);
		this.head = this.maxValue;
		insertSort(new PList(priority, c), this.head);
		this.head = this.head.getNext();
		// not really needed but just incase. could free up memory maybe, in the
		// right case where the reference could point to something that is no
		// longer needed.
		this.maxValue.setNext(null);
	}

	// I do my sorting this way because it allows me to not
	// worry about the head case, where the head is replaced.
	// adding the max possible value to the top before sorting
	// and then removing it after is a dirty way of fixing this,
	// but it will always work.
	private void insertSort(PList toAdd, PList location) {

		if (location.getNext() == null) {
			location.setNext(toAdd);
		} else {
			if (toAdd.getPriority() > location.getNext().getPriority()) {
				toAdd.setNext(location.getNext());
				location.setNext(toAdd);
			} else if (toAdd.getPriority() == location.getNext().getPriority()) {
				if (toAdd.getValue() >= location.getNext().getValue()) {
					toAdd.setNext(location.getNext());
					location.setNext(toAdd);
				} else
					insertSort(toAdd, location.getNext());
			} else
				insertSort(toAdd, location.getNext());
		}
	}

	public boolean isEmpty() {

		return this.head == null;
	}

	public void show(PrintStream p) {

		if (!isEmpty()) {
			PList stepper = this.head;
			do {
				p.println("Priority: " + stepper.getPriority() + " Value: "
						+ stepper.getValue());
				stepper = stepper.getNext();
			} while (stepper != null);
		} else
			p.println("Queue is empty");
	}
	
	public void show(StringBuffer sb) {

		if (!isEmpty()) {
			PList stepper = this.head;
			do {
				sb.append("Priority: " + stepper.getPriority() + " Value: "
						+ stepper.getValue() + " ");
				stepper = stepper.getNext();
			} while (stepper != null);
		} else
			sb.append("Queue is empty");
	}
}
