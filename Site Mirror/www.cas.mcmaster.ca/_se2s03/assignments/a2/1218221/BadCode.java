package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 2;
        aa = (47 * x) + (33 - y);
        while (i <= 0) {
            bb = (z * y) - 47;
        }
        i = (y * y) + 2;
        bb = (46 * z) + (x - 33);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 2;
        cc = (68 * y) + (y - x);
        while (i <= 0) {
            aa = z - 46;
        }
        return (aa + bb) + cc;
    }
}

