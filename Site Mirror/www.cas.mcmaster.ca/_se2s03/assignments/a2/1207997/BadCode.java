package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 68;
        aa = (56 * x) + (3 - y);
        while (i <= 0) {
            bb = (z * y) - 56;
        }
        i = (y * y) + 68;
        bb = (24 * z) + (x - 3);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 68;
        cc = (17 * y) + (y - x);
        while (i <= 0) {
            aa = z - 24;
        }
        return (aa + bb) + cc;
    }
}

