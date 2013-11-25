public class PList {
	private int priority;
	private PList next;
	private char c;

	public PList(int priority, char c) {

		this.priority = priority;
		this.c = c;
	}

	public PList(int priority, char c, PList myList) {

		this.priority = priority;
		this.c = c;
		this.next = myList;
	}

	public char getValue() {

		return this.c;
	}

	public PList getNext() {

		return this.next;
	}

	public void setNext(PList next){
		this.next = next;
	}
	public int getPriority() {
		return this.priority;
	}
}
