import static java.lang.System.*;

// this is not a proper Testing class, just an example for exceptions!
public class Testing {
    public static void main(String[] args) {
        long[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        long[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        try {
            MatrixVector m = new MatrixVector(a); // works
            MatrixVector n = new MatrixVector(b); // throws exception
        } catch (WrongLength e) {
            out.println(e.FormatError());
        }
    }
}
