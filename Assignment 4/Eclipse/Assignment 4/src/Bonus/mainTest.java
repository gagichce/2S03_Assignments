package Bonus;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class mainTest {

	@Test
	public void doubleLinkPriQueueTest() {

		PQdoubleLink<String> myPq = new PQdoubleLink<String>();
		myPq.insertItem(500, "ThisIsn'tMyName");
		try {
			assertEquals("ThisIsn'tMyName", myPq.next());
		} catch (ObjectIsEmpty e) {
			fail("Something messed up bad");
		}
		myPq.insertItem(501, "ThisIsn'tMyNameEither");
		try {
			assertEquals("ThisIsn'tMyNameEither", myPq.next());
		} catch (ObjectIsEmpty e) {
			fail("Something messed up bad");
		}
		myPq.deleteItem();
		myPq.deleteItem();
		try {
			myPq.next();
			fail("values came from no-where");
		} catch (ObjectIsEmpty e) {
			assertEquals("stack trace wasn't equal", "Queue was empty!",
					e.getMessage());
		}
		myPq = new PQdoubleLink<String>();
		try {
			myPq.next();
			fail("values came from no-where");
		} catch (ObjectIsEmpty e) {
			assertEquals("stack trace wasn't equal", "Queue was empty!",
					e.getMessage());
		}
		StringBuffer tester = new StringBuffer();
		myPq.show(tester);
		assertEquals("Queue is empty!", tester.toString());
		myPq.insertItem(234, "YouKnowWhatThisIsn'tByNow");
		myPq.insertItem(224, "IMean");
		myPq.insertItem(234, "ToUnderstand");
		myPq.insertItem(36434, "IsTo");
		myPq.insertItem(6786, "PerceivePatterns");
		myPq.insertItem(234234, "AndThis");
		myPq.insertItem(6786, "ClearlyDoesn'tHaveAPattern");
		myPq.insertItem(Integer.MAX_VALUE - 1, "Right?");
		myPq.insertItem(23424234, "Maybe.");
		myPq.insertItem(23452, "It's12:25TheDayBeforeThisIsDue.");
		myPq.insertItem(76, "That'sAMofCOURSE");
		myPq.insertItem(797768, "IsThis15OperationsYet?");
		myPq.insertItem(246456, "Almost?");
		myPq.insertItem(4556, "HOMESTRETCH");
		myPq.insertItem(34532, "15 WOOOOO!");
		tester = new StringBuffer();
		myPq.show(tester);
		assertEquals(
				"Priority: 2147483646 Value: Right? Priority: 23424234 Value: Maybe. Priority: 797768 Value: IsThis15OperationsYet? Priority: 246456 Value: Almost? Priority: 234234 Value: AndThis Priority: 36434 Value: IsTo Priority: 34532 Value: 15 WOOOOO! Priority: 23452 Value: It's12:25TheDayBeforeThisIsDue. Priority: 6786 Value: PerceivePatterns Priority: 6786 Value: ClearlyDoesn'tHaveAPattern Priority: 4556 Value: HOMESTRETCH Priority: 234 Value: YouKnowWhatThisIsn'tByNow Priority: 234 Value: ToUnderstand Priority: 224 Value: IMean Priority: 76 Value: That'sAMofCOURSE",
				tester.toString());
		PQdoubleLink<Integer> myPqInt = new PQdoubleLink<Integer>();
		myPqInt.insertItem(1, 1);
		myPqInt.insertItem(1, 2);
		myPqInt.insertItem(1, 3);
		myPqInt.insertItem(1, 4);
		myPqInt.insertItem(1, 5);
		myPqInt.insertItem(1, 6);
		myPqInt.insertItem(1, 7);
		myPqInt.insertItem(1, 8);
		myPqInt.insertItem(1, 9);
		myPqInt.insertItem(1, 10);
		myPqInt.insertItem(1, 11);
		myPqInt.insertItem(1, 12);
		myPqInt.insertItem(1, 13);
		myPqInt.insertItem(1, 14);
		myPqInt.insertItem(1, 15);
		tester = new StringBuffer();
		myPqInt.show(tester);
		assertEquals("Priority: 1 Value: 15 Priority: 1 Value: 14 Priority: 1 Value: 13 Priority: 1 Value: 12 Priority: 1 Value: 11 Priority: 1 Value: 10 Priority: 1 Value: 9 Priority: 1 Value: 8 Priority: 1 Value: 7 Priority: 1 Value: 6 Priority: 1 Value: 5 Priority: 1 Value: 4 Priority: 1 Value: 3 Priority: 1 Value: 2 Priority: 1 Value: 1", tester.toString());
		
		//trying to find the most ridiculous data type to test. getting there
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
		tester = new StringBuffer();
		myPqBool.show(tester);
		assertEquals("Priority: 786 Value: true Priority: 234 Value: true Priority: 234 Value: true Priority: 234 Value: true Priority: 234 Value: true Priority: 78 Value: true Priority: 78 Value: false Priority: 41 Value: false Priority: 4 Value: true Priority: 4 Value: false Priority: 3 Value: true Priority: 3 Value: false Priority: 3 Value: false Priority: 2 Value: true Priority: 2 Value: true Priority: 2 Value: false Priority: 1 Value: false",tester.toString());
		
		// very upset that I cannot do this :(
		//PQdoubleLink<PQdoubleLink<Boolean>> ridic = new PQdoubleLink<PQdoubleLink<Boolean>>();
		
		PQdoubleLink<Byte> myBytes = new PQdoubleLink<Byte>();
		myBytes.insertItem(3123, (byte) 22);
		try {
			assertEquals((byte)22, (byte) myBytes.next());
		} catch (ObjectIsEmpty e) {
			fail("something bad happened");
		}
		myBytes.insertItem(3123, (byte) 255);
		//thought for sure this would break something.. guess not
		myBytes.insertItem(Integer.MAX_VALUE + 9001, (byte) 45);
		try {
			assertEquals((byte) 22, (byte) myBytes.next());
		} catch (ObjectIsEmpty e) {
			fail("something bad happened");
		}
	}

	// yes
	// I copy pasta'd my code from the real assignment and changed a few things.
	// programming is about being lazy and admitting it.
	@Test
	public void PriQueueTest() {

		PriorityQueue<Character> myQueue = new PriorityQueue<Character>();
		assertThat("Queue was not empty", myQueue.isEmpty());
		myQueue.insertItem(1, 'c');
		assertThat("Queue was empty", !myQueue.isEmpty());
		try {
			assertEquals("Queue was empty or wrong thing on top", 'c',
					(char) myQueue.next());
		} catch (Exception e) {
			fail("Queue was empty");
		}
		myQueue = new PriorityQueue<Character>(2, 'd');
		// testing constructor with an item in it
		try {
			assertEquals("Queue was empty or wrong thing on top", 'd',
					(char) myQueue.next());
		} catch (Exception e) {
			fail("Queue was empty");
		}
		// exception tests
		myQueue = new PriorityQueue<Character>();
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
		myQueue = new PriorityQueue<Character>();
		PriorityQueue<Character> myQueue2 = new PriorityQueue<Character>();
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
		myQueue = new PriorityQueue<Character>();
		myQueue2 = new PriorityQueue<Character>();

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

		myQueue = new PriorityQueue<Character>();
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

		// changed a few values
		myQueue = new PriorityQueue<Character>();
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
		Queue<Character> myQueue = new Queue<Character>();
		assertThat("Queue was not empty", myQueue.isEmpty());
		myQueue.enqueue('c');
		assertThat("Queue was empty", !myQueue.isEmpty());
		try {
			assertEquals('c', (char) myQueue.peek());
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
		myQueue = new Queue<Character>();
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
			assertEquals('f', (char) myQueue.peek());
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
		myQueue = new Queue<Character>();

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
		myQueue = new Queue<Character>();
		tester = new StringBuffer();
		for (int i = 0; i < 2560; i++) {
			myQueue.enqueue('c');
		}
		for (int i = 0; i < 2559; i++) {
			myQueue.dequeue();
		}
		try {
			assertEquals("Top not equal", 'c', (char) myQueue.peek());
		} catch (ObjectIsEmpty e) {
			fail("Queue was empty!");
		}
		myQueue.dequeue();
		assertThat("Queue was not empty!", myQueue.isEmpty());
	}

	@Test
	public void ArrayListStackTest() {

		// three exception cases
		ArrayListStack<Character> myStack = new ArrayListStack<Character>();
		try {
			myStack.top();
			fail("Should have thrown ObjectIsEmpty");
		} catch (ObjectIsEmpty e) {
			assertThat("Stack wasn't empty!",
					e.getMessage().contains("Stack is empty!"));
		}

		myStack = new ArrayListStack<Character>();
		myStack.push('c');
		myStack.pop();
		try {
			myStack.top();
			fail("Should have tahrown ObjectIsEmpty");
		} catch (ObjectIsEmpty e) {
			assertThat("Stack wasn't empty!",
					e.getMessage().contains("Stack is empty!"));
		}
		myStack = new ArrayListStack<Character>();
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
		myStack = new ArrayListStack<Character>();
		assertThat("Stack wasn't empty!", myStack.isEmpty());

		StringBuffer tester = new StringBuffer();
		myStack = new ArrayListStack<Character>();
		myStack.push('a');
		myStack.push('b');
		myStack.push('c');
		myStack.push('d');
		myStack.push('e');
		myStack.push('f');
		myStack.push('g');
		myStack.show(tester);
		assertEquals("g f e d c b a ", tester.toString());

		myStack = new ArrayListStack<Character>();
		tester = new StringBuffer();

		for (int i = 0; i < 2560; i++) {
			myStack.push('f');
		}
		for (int i = 0; i < 2559; i++) {
			myStack.pop();
		}

		try {
			assertEquals('f', (char) myStack.top());
		} catch (ObjectIsEmpty e) {
			fail("There wasn't anything there, toolbag");
		}

		myStack = new ArrayListStack<Character>();
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
			assertEquals(' ', (char) myStack.top());
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
		Stack<Character> myStack = new Stack<Character>();
		try {
			myStack.top();
			fail("Should have thrown ObjectIsEmpty");
		} catch (ObjectIsEmpty e) {
			assertThat("Stack wasn't empty!",
					e.getMessage().contains("Stack is empty!"));
		}

		myStack = new Stack<Character>();
		myStack.push('c');
		myStack.pop();
		try {
			myStack.top();
			fail("Should have thrown ObjectIsEmpty");
		} catch (ObjectIsEmpty e) {
			assertThat("Stack wasn't empty!",
					e.getMessage().contains("Stack is empty!"));
		}
		myStack = new Stack<Character>();
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
		myStack = new Stack<Character>();
		assertThat("Stack wasn't empty!", myStack.isEmpty());

		StringBuffer tester = new StringBuffer();
		myStack = new Stack<Character>();
		myStack.push('a');
		myStack.push('b');
		myStack.push('c');
		myStack.push('d');
		myStack.push('e');
		myStack.push('f');
		myStack.push('g');
		myStack.show(tester);
		assertEquals("g f e d c b a ", tester.toString());

		myStack = new Stack<Character>();
		tester = new StringBuffer();

		for (int i = 0; i < 2560; i++) {
			myStack.push('f');
		}
		for (int i = 0; i < 2559; i++) {
			myStack.pop();
		}

		try {
			assertEquals('f', (char) myStack.top());
		} catch (ObjectIsEmpty e) {
			fail("There wasn't anything there, toolbag");
		}

		myStack = new Stack<Character>();
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
			assertEquals(' ', (char) myStack.top());
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
