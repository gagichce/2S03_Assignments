package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 99;
        aa = (2 * x) + (59 - y);
        while (i <= 0) {
            bb = (z * y) - 2;
        }
        i = (y * y) + 99;
        bb = (98 * z) + (x - 59);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 99;
        cc = (29 * y) + (y - x);
        while (i <= 0) {
            aa = z - 98;
        }
        return (aa + bb) + cc;
    }
}

