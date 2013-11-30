package Bonus;

public class PDList<T> {
	
	private PDList<T> prev;
	private PDList<T> next;
	private int priority;
	private T value;
	
	public PDList(int priority, T value){
		this.setPriority(priority);
		this.setValue(value);
	}
	
	public PDList(int priority, T value, PDList<T> prev, PDList<T> next){
		this.setPriority(priority);
		this.setValue(value);
		this.setPrevious(prev);
		this.setNext(next);
	}

	public PDList<T> getPrevious() {

		return prev;
	}

	public void setPrevious(PDList<T> prev) {

		this.prev = prev;
	}

	public PDList<T> getNext() {

		return next;
	}

	public void setNext(PDList<T> next) {

		this.next = next;
	}

	public int getPriority() {

		return priority;
	}

	public void setPriority(int priority) {

		this.priority = priority;
	}

	public T getValue() {

		return value;
	}

	public void setValue(T value) {

		this.value = value;
	}
}
