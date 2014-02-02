package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 25;
        aa = (28 * x) + (81 - y);
        while (i <= 0) {
            bb = (z * y) - 28;
        }
        i = (y * y) + 25;
        bb = (42 * z) + (x - 81);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 25;
        cc = (90 * y) + (y - x);
        while (i <= 0) {
            aa = z - 42;
        }
        return (aa + bb) + cc;
    }
}

