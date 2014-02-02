package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 54;
        aa = (65 * x) + (18 - y);
        while (i <= 0) {
            bb = (z * y) - 65;
        }
        i = (y * y) + 54;
        bb = (62 * z) + (x - 18);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 54;
        cc = (40 * y) + (y - x);
        while (i <= 0) {
            aa = z - 62;
        }
        return (aa + bb) + cc;
    }
}

