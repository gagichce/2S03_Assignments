package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 76;
        aa = (46 * x) + (24 - y);
        while (i <= 0) {
            bb = (z * y) - 46;
        }
        i = (y * y) + 76;
        bb = (25 * z) + (x - 24);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 76;
        cc = (32 * y) + (y - x);
        while (i <= 0) {
            aa = z - 25;
        }
        return (aa + bb) + cc;
    }
}

