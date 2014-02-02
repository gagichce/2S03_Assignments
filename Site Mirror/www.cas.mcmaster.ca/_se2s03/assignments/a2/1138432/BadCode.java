package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 1;
        aa = (54 * x) + (57 - y);
        while (i <= 0) {
            bb = (z * y) - 54;
        }
        i = (y * y) + 1;
        bb = (38 * z) + (x - 57);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 1;
        cc = (43 * y) + (y - x);
        while (i <= 0) {
            aa = z - 38;
        }
        return (aa + bb) + cc;
    }
}

