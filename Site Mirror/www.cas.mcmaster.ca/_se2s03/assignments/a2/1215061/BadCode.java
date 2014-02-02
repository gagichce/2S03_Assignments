package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 77;
        aa = (92 * x) + (81 - y);
        while (i <= 0) {
            bb = (z * y) - 92;
        }
        i = (y * y) + 77;
        bb = (93 * z) + (x - 81);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 77;
        cc = (63 * y) + (y - x);
        while (i <= 0) {
            aa = z - 93;
        }
        return (aa + bb) + cc;
    }
}

