package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 15;
        aa = (63 * x) + (49 - y);
        while (i <= 0) {
            bb = (z * y) - 63;
        }
        i = (y * y) + 15;
        bb = (45 * z) + (x - 49);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 15;
        cc = (94 * y) + (y - x);
        while (i <= 0) {
            aa = z - 45;
        }
        return (aa + bb) + cc;
    }
}

