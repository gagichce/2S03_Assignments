package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 86;
        aa = (18 * x) + (67 - y);
        while (i <= 0) {
            bb = (z * y) - 18;
        }
        i = (y * y) + 86;
        bb = (89 * z) + (x - 67);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 86;
        cc = (43 * y) + (y - x);
        while (i <= 0) {
            aa = z - 89;
        }
        return (aa + bb) + cc;
    }
}

