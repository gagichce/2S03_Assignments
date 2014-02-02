package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 30;
        aa = (9 * x) + (31 - y);
        while (i <= 0) {
            bb = (z * y) - 9;
        }
        i = (y * y) + 30;
        bb = (16 * z) + (x - 31);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 30;
        cc = (78 * y) + (y - x);
        while (i <= 0) {
            aa = z - 16;
        }
        return (aa + bb) + cc;
    }
}

