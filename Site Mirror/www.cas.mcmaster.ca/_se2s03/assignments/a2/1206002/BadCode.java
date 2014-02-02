package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 40;
        aa = (83 * x) + (28 - y);
        while (i <= 0) {
            bb = (z * y) - 83;
        }
        i = (y * y) + 40;
        bb = (21 * z) + (x - 28);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 40;
        cc = (55 * y) + (y - x);
        while (i <= 0) {
            aa = z - 21;
        }
        return (aa + bb) + cc;
    }
}

