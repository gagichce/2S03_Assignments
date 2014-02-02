package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 6;
        aa = (47 * x) + (61 - y);
        while (i <= 0) {
            bb = (z * y) - 47;
        }
        i = (y * y) + 6;
        bb = (14 * z) + (x - 61);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 6;
        cc = (27 * y) + (y - x);
        while (i <= 0) {
            aa = z - 14;
        }
        return (aa + bb) + cc;
    }
}

