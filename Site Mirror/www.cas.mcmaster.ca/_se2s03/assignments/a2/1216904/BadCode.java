package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 22;
        aa = (2 * x) + (12 - y);
        while (i <= 0) {
            bb = (z * y) - 2;
        }
        i = (y * y) + 22;
        bb = (53 * z) + (x - 12);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 22;
        cc = (21 * y) + (y - x);
        while (i <= 0) {
            aa = z - 53;
        }
        return (aa + bb) + cc;
    }
}

