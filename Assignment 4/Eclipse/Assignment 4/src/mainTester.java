import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class mainTester {

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void PriQueueTest() {

		PriorityQueue myQueue = new PriorityQueue();
		assertThat("Queue was not empty", myQueue.isEmpty());
		myQueue.insertItem(1, 'c');
		assertThat("Queue was empty", !myQueue.isEmpty());
		try {
			assertEquals("Queue was empty or wrong thing on top", 'c',
					myQueue.next());
		} catch (Exception e) {
			fail("Queue was empty");
		}
		myQueue = new PriorityQueue(2, 'd');
		// testing constructor with an item in it
		try {
			assertEquals("Queue was empty or wrong thing on top", 'd',
					myQueue.next());
		} catch (Exception e) {
			fail("Queue was empty");
		}
		// exception tests
		myQueue = new PriorityQueue();
		try {
			myQueue.next();
			fail("Queue should have been empty!");
		} catch (ObjectIsEmpty e) {
			assertEquals("PriQueue is empty!", e.getMessage());
		}
		myQueue.insertItem(500, 'd');
		myQueue.deleteItem();
		try {
			myQueue.next();
			fail("Queue should have been empty!");
		} catch (ObjectIsEmpty e) {
			assertEquals("PriQueue is empty!", e.getMessage());
		}
		myQueue.insertItem(234, 'e');
		myQueue.deleteItem();
		myQueue.insertItem(75675, 'E');
		myQueue.deleteItem();
		try {
			myQueue.next();
			fail("Queue should have been empty!");
		} catch (ObjectIsEmpty e) {
			assertEquals("PriQueue is empty!", e.getMessage());
		}
		// rest of the test cases
		myQueue = new PriorityQueue();
		PriorityQueue myQueue2 = new PriorityQueue();
		// adding things in any order should matter right?
		myQueue.insertItem(5, '4');
		myQueue.insertItem(234, '9');
		myQueue2.insertItem(234, '9');
		myQueue2.insertItem(5, '4');
		StringBuffer tester = new StringBuffer();
		StringBuffer tester2 = new StringBuffer();
		myQueue.show(tester);
		myQueue2.show(tester2);
		assertEquals("Queue's are not the same", tester.toString(),
				tester2.toString());

		myQueue.insertItem(567567, '?');
		myQueue.insertItem(32, '1');
		myQueue.insertItem(2, 'G');

		myQueue2.insertItem(32, '1');
		myQueue2.insertItem(567567, '?');
		myQueue2.insertItem(2, 'G');
		tester = new StringBuffer();
		tester2 = new StringBuffer();
		myQueue.show(tester);
		myQueue2.show(tester2);
		assertEquals("Queue's are not the same", tester.toString(),
				tester2.toString());

		// testing the max case
		myQueue2.insertItem(Integer.MAX_VALUE, Character.MAX_VALUE);
		myQueue.insertItem(Integer.MAX_VALUE, Character.MAX_VALUE);

		tester = new StringBuffer();
		tester2 = new StringBuffer();
		myQueue.show(tester);
		myQueue2.show(tester2);
		assertEquals("Queue's are not the same", tester.toString(),
				tester2.toString());

		// testing the min case
		myQueue.insertItem(Integer.MIN_VALUE, Character.MIN_VALUE);
		myQueue2.insertItem(Integer.MIN_VALUE, Character.MIN_VALUE);

		tester = new StringBuffer();
		tester2 = new StringBuffer();
		myQueue.show(tester);
		myQueue2.show(tester2);
		assertEquals("Queue's are not the same", tester.toString(),
				tester2.toString());

		// testing the max case, duplicate entries
		myQueue2.insertItem(Integer.MAX_VALUE, Character.MAX_VALUE);
		myQueue.insertItem(Integer.MAX_VALUE, Character.MAX_VALUE);

		tester = new StringBuffer();
		tester2 = new StringBuffer();
		myQueue.show(tester);
		myQueue2.show(tester2);
		assertEquals("Queue's are not the same", tester.toString(),
				tester2.toString());
		// reset for new Queue's
		myQueue = new PriorityQueue();
		myQueue2 = new PriorityQueue();

		// adding order doesn't matter
		myQueue.insertItem(234, 'k');
		myQueue.insertItem(23, 'k');
		myQueue.insertItem(5, 'k');
		myQueue.insertItem(345, 'k');
		myQueue.insertItem(234, 'k');
		myQueue.insertItem(6, 'k');
		myQueue.insertItem(765, 'k');
		myQueue.insertItem(34, 'k');
		myQueue.insertItem(-6, 'k');
		myQueue.insertItem(2345, 'k');
		myQueue.insertItem(536456, 'k');
		myQueue.insertItem(-04, 'k');
		myQueue.insertItem(4789, 'k');
		myQueue.insertItem(21123, 'k');
		myQueue.insertItem(536456, 'k');

		myQueue2.insertItem(-6, 'k');
		myQueue2.insertItem(765, 'k');
		myQueue2.insertItem(234, 'k');
		myQueue2.insertItem(23, 'k');
		myQueue2.insertItem(5, 'k');
		myQueue2.insertItem(345, 'k');
		myQueue2.insertItem(234, 'k');
		myQueue2.insertItem(536456, 'k');
		myQueue2.insertItem(6, 'k');
		myQueue2.insertItem(536456, 'k');
		myQueue2.insertItem(34, 'k');
		myQueue2.insertItem(2345, 'k');
		myQueue2.insertItem(-04, 'k');
		myQueue2.insertItem(4789, 'k');
		myQueue2.insertItem(21123, 'k');
		tester = new StringBuffer();
		tester2 = new StringBuffer();
		myQueue.show(tester);
		myQueue2.show(tester2);
		assertEquals("Queue's are not the same", tester.toString(),
				tester2.toString());

		myQueue = new PriorityQueue();
		myQueue.insertItem(234, 'k');
		myQueue.insertItem(23, 'k');
		myQueue.insertItem(5, 'k');
		myQueue.insertItem(345, 'k');
		myQueue.insertItem(234, 'k');
		myQueue.insertItem(6, 'k');
		myQueue.insertItem(765, 'k');
		myQueue.insertItem(34, 'k');
		myQueue.insertItem(-6, 'k');
		myQueue.insertItem(2345, 'k');
		myQueue.insertItem(536456, 'k');
		myQueue.insertItem(-04, 'k');
		myQueue.insertItem(4789, 'k');
		myQueue.insertItem(21123, 'k');
		myQueue.insertItem(536456, 'k');
		tester = new StringBuffer();
		myQueue.show(tester);
		assertEquals(
				"Queue is not what it should be",
				"Priority: 536456 Value: k Priority: 536456 Value: k Priority: 21123 Value: k Priority: 4789 Value: k Priority: 2345 Value: k Priority: 765 Value: k Priority: 345 Value: k Priority: 234 Value: k Priority: 234 Value: k Priority: 34 Value: k Priority: 23 Value: k Priority: 6 Value: k Priority: 5 Value: k Priority: -4 Value: k Priority: -6 Value: k ",
				tester.toString());

		//changed a few values
		myQueue = new PriorityQueue();
		myQueue.insertItem(234, 'k');
		myQueue.insertItem(23, 'k');
		myQueue.insertItem(5, 'k');
		myQueue.insertItem(345, 'k');
		myQueue.insertItem(234, 's');
		myQueue.insertItem(6, 'k');
		myQueue.insertItem(765, 'k');
		myQueue.insertItem(34, 'k');
		myQueue.insertItem(-6, 'k');
		myQueue.insertItem(2345, 's');
		myQueue.insertItem(536456, 'k');
		myQueue.insertItem(-04, 'k');
		myQueue.insertItem(4789, 'k');
		myQueue.insertItem(21123, 'k');
		myQueue.insertItem(536456, 'k');
		tester = new StringBuffer();
		myQueue.show(tester);
		assertEquals(
				"Queue is not what it should be",
				"Priority: 536456 Value: k Priority: 536456 Value: k Priority: 21123 Value: k Priority: 4789 Value: k Priority: 2345 Value: s Priority: 765 Value: k Priority: 345 Value: k Priority: 234 Value: s Priority: 234 Value: k Priority: 34 Value: k Priority: 23 Value: k Priority: 6 Value: k Priority: 5 Value: k Priority: -4 Value: k Priority: -6 Value: k ",
				tester.toString());

	}

	@Test
	public void QueueTest() {

		// first three
		Queue myQueue = new Queue();
		assertThat("Queue was not empty", myQueue.isEmpty());
		myQueue.enqueue('c');
		assertThat("Queue was empty", !myQueue.isEmpty());
		try {
			assertEquals('c', myQueue.peek());
		} catch (Exception e) {
			fail("Something wen't horribly wrong.");
		}
		myQueue.dequeue();
		assertThat("Queue was not empty", myQueue.isEmpty());

		// exception testings.
		try {
			myQueue.peek();
			fail("Queue was not empty");
		} catch (ObjectIsEmpty e) {
			assertEquals(e.getMessage(), "Queue was empty!");
		}
		myQueue = new Queue();
		try {
			myQueue.peek();
			fail("Queue was not empty, that took skill");
		} catch (ObjectIsEmpty e) {
			assertEquals(e.getMessage(), "Queue was empty!");
		}
		for (int i = 0; i < 2560; i++) {
			myQueue.enqueue('f');
		}
		for (int i = 0; i < 2559; i++) {
			myQueue.dequeue();
		}
		try {
			assertEquals('f', myQueue.peek());
		} catch (ObjectIsEmpty e) {
			fail("Queue was empty");
		}
		myQueue.dequeue();
		try {
			myQueue.peek();
			fail("Queue was not empty, that took skill");
		} catch (ObjectIsEmpty e) {
			assertEquals(e.getMessage(), "Queue was empty!");
		}
		// longer testings
		myQueue = new Queue();

		myQueue.enqueue('d');
		myQueue.enqueue('d');
		myQueue.enqueue('d');
		myQueue.enqueue('d');
		myQueue.enqueue('d');
		myQueue.enqueue('d');
		myQueue.enqueue('d');
		myQueue.enqueue('d');
		myQueue.enqueue('d');
		myQueue.enqueue('d');
		myQueue.enqueue('d');
		myQueue.enqueue('d');
		myQueue.enqueue('d');
		myQueue.enqueue('d');
		myQueue.enqueue('d');
		myQueue.enqueue('d');
		myQueue.enqueue('d');
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		StringBuffer tester = new StringBuffer();
		myQueue.show(tester);
		assertEquals("Output not equal", "d d d d d d d d d ",
				tester.toString());
		myQueue.dequeue();
		myQueue.enqueue('e');
		tester = new StringBuffer();
		myQueue.show(tester);
		assertEquals("Output not equal", "d d d d d d d d e ",
				tester.toString());
		myQueue = new Queue();
		tester = new StringBuffer();
		for (int i = 0; i < 2560; i++) {
			myQueue.enqueue('c');
		}
		for (int i = 0; i < 2559; i++) {
			myQueue.dequeue();
		}
		try {
			assertEquals("Top not equal", 'c', myQueue.peek());
		} catch (ObjectIsEmpty e) {
			fail("Queue was empty!");
		}
		myQueue.dequeue();
		assertThat("Queue was not empty!", myQueue.isEmpty());
	}

	@Test
	public void ArrayListStackTest() {

		// three exception cases
		ArrayListStack myStack = new ArrayListStack();
		try {
			myStack.top();
			fail("Should have thrown ObjectIsEmpty");
		} catch (ObjectIsEmpty e) {
			assertThat("Stack wasn't empty!",
					e.getMessage().contains("Stack is empty!"));
		}

		myStack = new ArrayListStack();
		myStack.push('c');
		myStack.pop();
		try {
			myStack.top();
			fail("Should have thrown ObjectIsEmpty");
		} catch (ObjectIsEmpty e) {
			assertThat("Stack wasn't empty!",
					e.getMessage().contains("Stack is empty!"));
		}
		myStack = new ArrayListStack();
		myStack.push('c');
		myStack.push('c');
		myStack.push('e');
		myStack.push('c');
		myStack.push('d');
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		try {
			myStack.top();
			fail("Should have thrown ObjectIsEmpty");
		} catch (ObjectIsEmpty e) {
			assertEquals("Stack wasn't empty!", e.getMessage(),
					"Stack is empty!");
		}

		// the rest of the cases
		myStack = new ArrayListStack();
		assertThat("Stack wasn't empty!", myStack.isEmpty());

		StringBuffer tester = new StringBuffer();
		myStack = new ArrayListStack();
		myStack.push('a');
		myStack.push('b');
		myStack.push('c');
		myStack.push('d');
		myStack.push('e');
		myStack.push('f');
		myStack.push('g');
		myStack.show(tester);
		assertEquals("g f e d c b a ", tester.toString());

		myStack = new ArrayListStack();
		tester = new StringBuffer();

		for (int i = 0; i < 2560; i++) {
			myStack.push('f');
		}
		for (int i = 0; i < 2559; i++) {
			myStack.pop();
		}

		try {
			assertEquals('f', myStack.top());
		} catch (ObjectIsEmpty e) {
			fail("There wasn't anything there, toolbag");
		}

		myStack = new ArrayListStack();
		myStack.push('i');
		myStack.push('m');
		myStack.push(' ');
		myStack.push('b');
		myStack.push('o');
		myStack.push('r');
		myStack.push('e');
		myStack.push('d');
		myStack.push('.');
		myStack.push(' ');
		myStack.push('I');
		myStack.push(' ');
		myStack.push('w');
		myStack.push('e');
		myStack.push('n');
		myStack.push('t');
		myStack.push(' ');
		try {
			assertEquals(' ', myStack.top());
		} catch (ObjectIsEmpty e) {
			fail("Something went horribly wrong");
		}
		myStack.push('t');
		myStack.push('h');
		myStack.push('e');
		myStack.push('r');
		myStack.push('e');
		myStack.push('.');
		tester = new StringBuffer();
		myStack.show(tester);
		assertEquals(". e r e h t   t n e w   I   . d e r o b   m i ",
				tester.toString());
		myStack.pop();
		tester = new StringBuffer();
		myStack.show(tester);
		assertEquals("e r e h t   t n e w   I   . d e r o b   m i ",
				tester.toString());
		myStack.pop();
		myStack.pop();
		tester = new StringBuffer();
		myStack.show(tester);
		assertEquals("e h t   t n e w   I   . d e r o b   m i ",
				tester.toString());
	}

	@Test
	public void StackTest() {

		// three exception cases
		Stack myStack = new Stack();
		try {
			myStack.top();
			fail("Should have thrown ObjectIsEmpty");
		} catch (ObjectIsEmpty e) {
			assertThat("Stack wasn't empty!",
					e.getMessage().contains("Stack is empty!"));
		}

		myStack = new Stack();
		myStack.push('c');
		myStack.pop();
		try {
			myStack.top();
			fail("Should have thrown ObjectIsEmpty");
		} catch (ObjectIsEmpty e) {
			assertThat("Stack wasn't empty!",
					e.getMessage().contains("Stack is empty!"));
		}
		myStack = new Stack();
		myStack.push('c');
		myStack.push('c');
		myStack.push('e');
		myStack.push('c');
		myStack.push('d');
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		try {
			myStack.top();
			fail("Should have thrown ObjectIsEmpty");
		} catch (ObjectIsEmpty e) {
			assertEquals("Stack wasn't empty!", e.getMessage(),
					"Stack is empty!");
		}

		// the rest of the cases
		myStack = new Stack();
		assertThat("Stack wasn't empty!", myStack.isEmpty());

		StringBuffer tester = new StringBuffer();
		myStack = new Stack();
		myStack.push('a');
		myStack.push('b');
		myStack.push('c');
		myStack.push('d');
		myStack.push('e');
		myStack.push('f');
		myStack.push('g');
		myStack.show(tester);
		assertEquals("g f e d c b a ", tester.toString());

		myStack = new Stack();
		tester = new StringBuffer();

		for (int i = 0; i < 2560; i++) {
			myStack.push('f');
		}
		for (int i = 0; i < 2559; i++) {
			myStack.pop();
		}

		try {
			assertEquals('f', myStack.top());
		} catch (ObjectIsEmpty e) {
			fail("There wasn't anything there, toolbag");
		}

		myStack = new Stack();
		myStack.push('i');
		myStack.push('m');
		myStack.push(' ');
		myStack.push('b');
		myStack.push('o');
		myStack.push('r');
		myStack.push('e');
		myStack.push('d');
		myStack.push('.');
		myStack.push(' ');
		myStack.push('I');
		myStack.push(' ');
		myStack.push('w');
		myStack.push('e');
		myStack.push('n');
		myStack.push('t');
		myStack.push(' ');
		try {
			assertEquals(' ', myStack.top());
		} catch (ObjectIsEmpty e) {
			fail("Something went horribly wrong");
		}
		myStack.push('t');
		myStack.push('h');
		myStack.push('e');
		myStack.push('r');
		myStack.push('e');
		myStack.push('.');
		tester = new StringBuffer();
		myStack.show(tester);
		assertEquals(". e r e h t   t n e w   I   . d e r o b   m i ",
				tester.toString());
		myStack.pop();
		tester = new StringBuffer();
		myStack.show(tester);
		assertEquals("e r e h t   t n e w   I   . d e r o b   m i ",
				tester.toString());
		myStack.pop();
		myStack.pop();
		tester = new StringBuffer();
		myStack.show(tester);
		assertEquals("e h t   t n e w   I   . d e r o b   m i ",
				tester.toString());
	}

}
