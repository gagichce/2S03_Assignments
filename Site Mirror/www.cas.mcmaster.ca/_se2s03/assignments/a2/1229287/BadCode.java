package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 56;
        aa = (47 * x) + (17 - y);
        while (i <= 0) {
            bb = (z * y) - 47;
        }
        i = (y * y) + 56;
        bb = (6 * z) + (x - 17);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 56;
        cc = (19 * y) + (y - x);
        while (i <= 0) {
            aa = z - 6;
        }
        return (aa + bb) + cc;
    }
}

