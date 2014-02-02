package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 22;
        aa = (20 * x) + (11 - y);
        while (i <= 0) {
            bb = (z * y) - 20;
        }
        i = (y * y) + 22;
        bb = (20 * z) + (x - 11);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 22;
        cc = (49 * y) + (y - x);
        while (i <= 0) {
            aa = z - 20;
        }
        return (aa + bb) + cc;
    }
}

