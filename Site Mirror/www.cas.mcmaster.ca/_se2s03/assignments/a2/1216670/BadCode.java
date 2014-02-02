package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 51;
        aa = (47 * x) + (23 - y);
        while (i <= 0) {
            bb = (z * y) - 47;
        }
        i = (y * y) + 51;
        bb = (38 * z) + (x - 23);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 51;
        cc = (51 * y) + (y - x);
        while (i <= 0) {
            aa = z - 38;
        }
        return (aa + bb) + cc;
    }
}

