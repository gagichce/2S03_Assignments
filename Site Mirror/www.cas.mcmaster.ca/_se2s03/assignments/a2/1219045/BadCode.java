package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 39;
        aa = (29 * x) + (69 - y);
        while (i <= 0) {
            bb = (z * y) - 29;
        }
        i = (y * y) + 39;
        bb = (32 * z) + (x - 69);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 39;
        cc = (3 * y) + (y - x);
        while (i <= 0) {
            aa = z - 32;
        }
        return (aa + bb) + cc;
    }
}

