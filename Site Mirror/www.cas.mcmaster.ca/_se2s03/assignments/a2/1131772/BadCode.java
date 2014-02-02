package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 31;
        aa = (63 * x) + (45 - y);
        while (i <= 0) {
            bb = (z * y) - 63;
        }
        i = (y * y) + 31;
        bb = (94 * z) + (x - 45);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 31;
        cc = (50 * y) + (y - x);
        while (i <= 0) {
            aa = z - 94;
        }
        return (aa + bb) + cc;
    }
}

