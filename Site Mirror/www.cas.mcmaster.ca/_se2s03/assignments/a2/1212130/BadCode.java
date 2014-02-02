package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 66;
        aa = (2 * x) + (39 - y);
        while (i <= 0) {
            bb = (z * y) - 2;
        }
        i = (y * y) + 66;
        bb = (14 * z) + (x - 39);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 66;
        cc = (40 * y) + (y - x);
        while (i <= 0) {
            aa = z - 14;
        }
        return (aa + bb) + cc;
    }
}

