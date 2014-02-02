package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 86;
        aa = (83 * x) + (99 - y);
        while (i <= 0) {
            bb = (z * y) - 83;
        }
        i = (y * y) + 86;
        bb = (71 * z) + (x - 99);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 86;
        cc = (41 * y) + (y - x);
        while (i <= 0) {
            aa = z - 71;
        }
        return (aa + bb) + cc;
    }
}

