package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 51;
        aa = (9 * x) + (24 - y);
        while (i <= 0) {
            bb = (z * y) - 9;
        }
        i = (y * y) + 51;
        bb = (80 * z) + (x - 24);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 51;
        cc = (4 * y) + (y - x);
        while (i <= 0) {
            aa = z - 80;
        }
        return (aa + bb) + cc;
    }
}

