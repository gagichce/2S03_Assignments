package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 91;
        aa = (63 * x) + (1 - y);
        while (i <= 0) {
            bb = (z * y) - 63;
        }
        i = (y * y) + 91;
        bb = (44 * z) + (x - 1);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 91;
        cc = (25 * y) + (y - x);
        while (i <= 0) {
            aa = z - 44;
        }
        return (aa + bb) + cc;
    }
}

