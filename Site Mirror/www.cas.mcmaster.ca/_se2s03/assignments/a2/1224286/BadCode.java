package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 31;
        aa = (20 * x) + (18 - y);
        while (i <= 0) {
            bb = (z * y) - 20;
        }
        i = (y * y) + 31;
        bb = (76 * z) + (x - 18);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 31;
        cc = (94 * y) + (y - x);
        while (i <= 0) {
            aa = z - 76;
        }
        return (aa + bb) + cc;
    }
}

