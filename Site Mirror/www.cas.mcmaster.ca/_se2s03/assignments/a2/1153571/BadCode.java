package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 5;
        aa = (9 * x) + (48 - y);
        while (i <= 0) {
            bb = (z * y) - 9;
        }
        i = (y * y) + 5;
        bb = (1 * z) + (x - 48);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 5;
        cc = (93 * y) + (y - x);
        while (i <= 0) {
            aa = z - 1;
        }
        return (aa + bb) + cc;
    }
}

