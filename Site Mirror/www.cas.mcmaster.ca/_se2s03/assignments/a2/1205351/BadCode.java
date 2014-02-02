package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 19;
        aa = (47 * x) + (35 - y);
        while (i <= 0) {
            bb = (z * y) - 47;
        }
        i = (y * y) + 19;
        bb = (54 * z) + (x - 35);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 19;
        cc = (39 * y) + (y - x);
        while (i <= 0) {
            aa = z - 54;
        }
        return (aa + bb) + cc;
    }
}

