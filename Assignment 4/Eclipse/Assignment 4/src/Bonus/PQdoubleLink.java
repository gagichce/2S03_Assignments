package Bonus;

import java.io.PrintStream;

public class PQdoubleLink<T extends Comparable<T>> implements PriQueue<T> {

	private PDList<T> head;

	@Override
	public T next() throws Exception {

		if (isEmpty())
			throw new Exception();
		return this.head.getValue();
	}

	@Override
	public void insertItem(int priority, T c) {

		PDList<T> toAdd = new PDList<T>(priority, c);
		if (isEmpty()) {
			insert(toAdd, toAdd, toAdd);
			this.head = toAdd;
		} else {
			// head needs replacing case
			if (toAdd.getPriority() > this.head.getPriority()
					|| (toAdd.getPriority() == this.head.getPriority() && toAdd
							.getValue().compareTo(this.head.getValue()) >= 0)) {
				insert(this.head.getPrevious(), toAdd, this.head);
				this.head = toAdd;
			}
			// business as normal
			else {
				insertHelper(toAdd, this.head.getNext());
			}
		}
	}

	private void insertHelper(PDList<T> toAdd, PDList<T> location) {

		if (toAdd.getPriority() > location.getPriority()
				|| (toAdd.getPriority() == location.getPriority() && (toAdd
						.getValue().compareTo(location.getValue()) >= 0))
				|| isHead(location)) {
			insert(location.getPrevious(), toAdd, location);
		} else
			insertHelper(toAdd, location.getNext());
	}

	private void insert(PDList<T> prev, PDList<T> toInsert, PDList<T> next) {

		doubleLink(prev, toInsert);
		doubleLink(toInsert, next);
	}

	private void doubleLink(PDList<T> left, PDList<T> right) {

		left.setNext(right);
		right.setPrevious(left);
	}

	private void unlink(PDList<T> dead) {

		dead.setNext(null);
		dead.setPrevious(null);
	}

	@Override
	public void deleteItem() {

		if (!isEmpty()) {
			PDList<T> temp = this.head;
			// if there is only one item
			if (isHead(this.head.getNext()))
				this.head = null;
			else {
				doubleLink(this.head.getPrevious(), this.head.getNext());
				this.head = this.head.getNext();
				// no memory leaks/letting the garbage collection do it's thing
				// (I think)
			}
			unlink(temp);
		}

	}

	private boolean isHead(PDList<T> compare) {

		return compare.equals(this.head);
	}

	@Override
	public boolean isEmpty() {

		return head == null;
	}

	@Override
	public void show(PrintStream p) {

		p.println("Priority: " + this.head.getPriority() + " Value: " + this.head.getValue().toString() + showHelper(this.head.getNext()));

	}

	private String showHelper(PDList<T> toShow) {

		if (isHead(toShow))
			return "";
		return "\nPriority: " + toShow.getPriority() + " Value: " + toShow.getValue().toString() + showHelper(toShow.getNext());
	}

}
