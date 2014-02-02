package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 20;
        aa = (11 * x) + (18 - y);
        while (i <= 0) {
            bb = (z * y) - 11;
        }
        i = (y * y) + 20;
        bb = (10 * z) + (x - 18);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 20;
        cc = (67 * y) + (y - x);
        while (i <= 0) {
            aa = z - 10;
        }
        return (aa + bb) + cc;
    }
}

