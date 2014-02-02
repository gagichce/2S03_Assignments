package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 71;
        aa = (83 * x) + (21 - y);
        while (i <= 0) {
            bb = (z * y) - 83;
        }
        i = (y * y) + 71;
        bb = (42 * z) + (x - 21);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 71;
        cc = (74 * y) + (y - x);
        while (i <= 0) {
            aa = z - 42;
        }
        return (aa + bb) + cc;
    }
}

