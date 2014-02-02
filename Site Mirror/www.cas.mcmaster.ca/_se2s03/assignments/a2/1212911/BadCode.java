package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 33;
        aa = (2 * x) + (64 - y);
        while (i <= 0) {
            bb = (z * y) - 2;
        }
        i = (y * y) + 33;
        bb = (39 * z) + (x - 64);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 33;
        cc = (34 * y) + (y - x);
        while (i <= 0) {
            aa = z - 39;
        }
        return (aa + bb) + cc;
    }
}

