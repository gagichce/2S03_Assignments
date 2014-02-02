package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 23;
        aa = (47 * x) + (64 - y);
        while (i <= 0) {
            bb = (z * y) - 47;
        }
        i = (y * y) + 23;
        bb = (94 * z) + (x - 64);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 23;
        cc = (33 * y) + (y - x);
        while (i <= 0) {
            aa = z - 94;
        }
        return (aa + bb) + cc;
    }
}

