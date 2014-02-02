class FStack {
  private final List c;
  FStack() { this.c = null; }
  FStack(final List l) { this.c = l; }
  static boolean isempty(final FStack l) { return l.c == null; }
  static FStack push(final int a, final FStack l) { 
    return new FStack(new List(a, l.c)); }
  static FStack pop(final FStack l) { return new FStack(l.c.tl); }
  static int top(final FStack l) { return l.c.hd; }
}
