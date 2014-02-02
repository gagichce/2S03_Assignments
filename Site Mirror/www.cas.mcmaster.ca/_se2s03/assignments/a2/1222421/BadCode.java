package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 49;
        aa = (11 * x) + (75 - y);
        while (i <= 0) {
            bb = (z * y) - 11;
        }
        i = (y * y) + 49;
        bb = (32 * z) + (x - 75);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 49;
        cc = (95 * y) + (y - x);
        while (i <= 0) {
            aa = z - 32;
        }
        return (aa + bb) + cc;
    }
}

