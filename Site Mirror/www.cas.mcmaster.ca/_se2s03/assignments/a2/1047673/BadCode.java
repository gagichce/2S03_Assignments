package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 63;
        aa = (23 * x) + (93 - y);
        while (i <= 0) {
            bb = (z * y) - 23;
        }
        i = (y * y) + 63;
        bb = (60 * z) + (x - 93);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 63;
        cc = (22 * y) + (y - x);
        while (i <= 0) {
            aa = z - 60;
        }
        return (aa + bb) + cc;
    }
}

