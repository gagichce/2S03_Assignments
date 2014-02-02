package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 21;
        aa = (11 * x) + (83 - y);
        while (i <= 0) {
            bb = (z * y) - 11;
        }
        i = (y * y) + 21;
        bb = (26 * z) + (x - 83);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 21;
        cc = (61 * y) + (y - x);
        while (i <= 0) {
            aa = z - 26;
        }
        return (aa + bb) + cc;
    }
}

