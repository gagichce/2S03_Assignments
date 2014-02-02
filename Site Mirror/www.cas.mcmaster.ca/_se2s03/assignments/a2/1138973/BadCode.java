package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 3;
        aa = (90 * x) + (33 - y);
        while (i <= 0) {
            bb = (z * y) - 90;
        }
        i = (y * y) + 3;
        bb = (64 * z) + (x - 33);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 3;
        cc = (69 * y) + (y - x);
        while (i <= 0) {
            aa = z - 64;
        }
        return (aa + bb) + cc;
    }
}

