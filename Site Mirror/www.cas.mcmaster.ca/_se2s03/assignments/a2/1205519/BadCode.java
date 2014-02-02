package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 61;
        aa = (2 * x) + (1 - y);
        while (i <= 0) {
            bb = (z * y) - 2;
        }
        i = (y * y) + 61;
        bb = (15 * z) + (x - 1);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 61;
        cc = (1 * y) + (y - x);
        while (i <= 0) {
            aa = z - 15;
        }
        return (aa + bb) + cc;
    }
}

