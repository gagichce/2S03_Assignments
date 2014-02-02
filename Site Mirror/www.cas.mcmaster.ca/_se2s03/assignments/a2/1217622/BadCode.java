package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 92;
        aa = (56 * x) + (10 - y);
        while (i <= 0) {
            bb = (z * y) - 56;
        }
        i = (y * y) + 92;
        bb = (16 * z) + (x - 10);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 92;
        cc = (40 * y) + (y - x);
        while (i <= 0) {
            aa = z - 16;
        }
        return (aa + bb) + cc;
    }
}

