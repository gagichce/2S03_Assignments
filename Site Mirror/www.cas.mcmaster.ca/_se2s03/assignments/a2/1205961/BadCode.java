package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 96;
        aa = (38 * x) + (98 - y);
        while (i <= 0) {
            bb = (z * y) - 38;
        }
        i = (y * y) + 96;
        bb = (43 * z) + (x - 98);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 96;
        cc = (23 * y) + (y - x);
        while (i <= 0) {
            aa = z - 43;
        }
        return (aa + bb) + cc;
    }
}

