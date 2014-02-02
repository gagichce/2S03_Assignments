package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 99;
        aa = (27 * x) + (92 - y);
        while (i <= 0) {
            bb = (z * y) - 27;
        }
        i = (y * y) + 99;
        bb = (47 * z) + (x - 92);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 99;
        cc = (20 * y) + (y - x);
        while (i <= 0) {
            aa = z - 47;
        }
        return (aa + bb) + cc;
    }
}

