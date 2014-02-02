package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 82;
        aa = (38 * x) + (81 - y);
        while (i <= 0) {
            bb = (z * y) - 38;
        }
        i = (y * y) + 82;
        bb = (49 * z) + (x - 81);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 82;
        cc = (62 * y) + (y - x);
        while (i <= 0) {
            aa = z - 49;
        }
        return (aa + bb) + cc;
    }
}

