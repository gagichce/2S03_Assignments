package Bonus;
import java.io.PrintStream;

public interface StackInterface<T> {
	public T top() throws Exception;

	public void pop();

	public void push(T c);

	public boolean isEmpty();

	public void show(PrintStream p);
}
