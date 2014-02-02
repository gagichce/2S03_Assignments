package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 49;
        aa = (28 * x) + (54 - y);
        while (i <= 0) {
            bb = (z * y) - 28;
        }
        i = (y * y) + 49;
        bb = (83 * z) + (x - 54);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 49;
        cc = (4 * y) + (y - x);
        while (i <= 0) {
            aa = z - 83;
        }
        return (aa + bb) + cc;
    }
}

