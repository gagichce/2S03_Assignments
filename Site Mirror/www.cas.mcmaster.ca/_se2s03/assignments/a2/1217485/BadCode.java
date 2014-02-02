package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 46;
        aa = (65 * x) + (2 - y);
        while (i <= 0) {
            bb = (z * y) - 65;
        }
        i = (y * y) + 46;
        bb = (32 * z) + (x - 2);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 46;
        cc = (53 * y) + (y - x);
        while (i <= 0) {
            aa = z - 32;
        }
        return (aa + bb) + cc;
    }
}

