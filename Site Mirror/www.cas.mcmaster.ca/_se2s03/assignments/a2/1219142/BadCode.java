package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 63;
        aa = (92 * x) + (48 - y);
        while (i <= 0) {
            bb = (z * y) - 92;
        }
        i = (y * y) + 63;
        bb = (63 * z) + (x - 48);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 63;
        cc = (83 * y) + (y - x);
        while (i <= 0) {
            aa = z - 63;
        }
        return (aa + bb) + cc;
    }
}

