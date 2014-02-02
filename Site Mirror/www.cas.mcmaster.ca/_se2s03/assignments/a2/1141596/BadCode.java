package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 92;
        aa = (81 * x) + (88 - y);
        while (i <= 0) {
            bb = (z * y) - 81;
        }
        i = (y * y) + 92;
        bb = (8 * z) + (x - 88);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 92;
        cc = (9 * y) + (y - x);
        while (i <= 0) {
            aa = z - 8;
        }
        return (aa + bb) + cc;
    }
}

