package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 90;
        aa = (47 * x) + (61 - y);
        while (i <= 0) {
            bb = (z * y) - 47;
        }
        i = (y * y) + 90;
        bb = (47 * z) + (x - 61);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 90;
        cc = (37 * y) + (y - x);
        while (i <= 0) {
            aa = z - 47;
        }
        return (aa + bb) + cc;
    }
}

