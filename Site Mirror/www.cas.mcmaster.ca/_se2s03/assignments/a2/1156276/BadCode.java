package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 82;
        aa = (90 * x) + (62 - y);
        while (i <= 0) {
            bb = (z * y) - 90;
        }
        i = (y * y) + 82;
        bb = (16 * z) + (x - 62);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 82;
        cc = (83 * y) + (y - x);
        while (i <= 0) {
            aa = z - 16;
        }
        return (aa + bb) + cc;
    }
}

