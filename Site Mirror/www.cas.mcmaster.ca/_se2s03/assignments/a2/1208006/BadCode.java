package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 11;
        aa = (20 * x) + (61 - y);
        while (i <= 0) {
            bb = (z * y) - 20;
        }
        i = (y * y) + 11;
        bb = (16 * z) + (x - 61);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 11;
        cc = (64 * y) + (y - x);
        while (i <= 0) {
            aa = z - 16;
        }
        return (aa + bb) + cc;
    }
}

