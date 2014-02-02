package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 20;
        aa = (2 * x) + (78 - y);
        while (i <= 0) {
            bb = (z * y) - 2;
        }
        i = (y * y) + 20;
        bb = (94 * z) + (x - 78);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 20;
        cc = (20 * y) + (y - x);
        while (i <= 0) {
            aa = z - 94;
        }
        return (aa + bb) + cc;
    }
}

