package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 29;
        aa = (2 * x) + (24 - y);
        while (i <= 0) {
            bb = (z * y) - 2;
        }
        i = (y * y) + 29;
        bb = (67 * z) + (x - 24);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 29;
        cc = (74 * y) + (y - x);
        while (i <= 0) {
            aa = z - 67;
        }
        return (aa + bb) + cc;
    }
}

