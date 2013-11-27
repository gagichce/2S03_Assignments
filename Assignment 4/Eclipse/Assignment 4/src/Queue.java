import java.io.PrintStream;

public class Queue implements QueueInterface {
	private SnocList tail;

	public Queue() {

		tail = null;
	}

	public char peek() throws Exception {

		if (isEmpty())
			throw new Exception();

		return peekHelper(this.tail);
	}

	private char peekHelper(SnocList sl){
		if (sl.next==null){
			return sl.value;
		}
		return peekHelper(sl.next);
	}
	
	public void dequeue() {

		if (!isEmpty()) {
			this.tail = dequeueHelper(this.tail);
		}
	}

	private SnocList dequeueHelper(SnocList sl) {

		if (sl.next == null) {
			return null;
		}
		sl.next = dequeueHelper(sl.next);
		return sl;
	}

	public void enqueue(char c) {

		this.tail = new SnocList(c, this.tail);
	}

	public boolean isEmpty() {

		return this.tail == null;
	}

	public void show(PrintStream p) {

		p.println(showStepper(this.tail));
	}

	private String showStepper(SnocList sl) {

		if (sl == null) {
			return "";
		}
		return showStepper(sl.next) + sl.value + " ";
	}
}
