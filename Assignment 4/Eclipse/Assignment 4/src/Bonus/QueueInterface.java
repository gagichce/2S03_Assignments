package Bonus;
import java.io.PrintStream;

public interface QueueInterface<T> {
	
	public T peek() throws Exception;

	public void dequeue();

	public void enqueue(T c);

	public boolean isEmpty();

	public void show(PrintStream p);
}