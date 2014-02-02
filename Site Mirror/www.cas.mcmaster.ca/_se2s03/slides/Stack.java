class Stack {
  private List c;
  Stack() { this.c = null; }
  Stack(final List l) { this.c = l; }
  boolean isempty() { return c == null; }
  void push(final int a) { c = new List(a, c); }
  void pop() { c = c.tl; }
  int top() { return c.hd; }
}
