package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 91;
        aa = (20 * x) + (82 - y);
        while (i <= 0) {
            bb = (z * y) - 20;
        }
        i = (y * y) + 91;
        bb = (44 * z) + (x - 82);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 91;
        cc = (18 * y) + (y - x);
        while (i <= 0) {
            aa = z - 44;
        }
        return (aa + bb) + cc;
    }
}

