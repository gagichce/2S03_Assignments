package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 47;
        aa = (11 * x) + (39 - y);
        while (i <= 0) {
            bb = (z * y) - 11;
        }
        i = (y * y) + 47;
        bb = (21 * z) + (x - 39);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 47;
        cc = (76 * y) + (y - x);
        while (i <= 0) {
            aa = z - 21;
        }
        return (aa + bb) + cc;
    }
}

