package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 38;
        aa = (20 * x) + (31 - y);
        while (i <= 0) {
            bb = (z * y) - 20;
        }
        i = (y * y) + 38;
        bb = (6 * z) + (x - 31);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 38;
        cc = (60 * y) + (y - x);
        while (i <= 0) {
            aa = z - 6;
        }
        return (aa + bb) + cc;
    }
}

