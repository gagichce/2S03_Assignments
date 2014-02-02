package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 87;
        aa = (2 * x) + (38 - y);
        while (i <= 0) {
            bb = (z * y) - 2;
        }
        i = (y * y) + 87;
        bb = (83 * z) + (x - 38);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 87;
        cc = (4 * y) + (y - x);
        while (i <= 0) {
            aa = z - 83;
        }
        return (aa + bb) + cc;
    }
}

