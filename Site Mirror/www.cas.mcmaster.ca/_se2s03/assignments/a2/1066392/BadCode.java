package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 88;
        aa = (68 * x) + (22 - y);
        while (i <= 0) {
            bb = (z * y) - 68;
        }
        i = (y * y) + 88;
        bb = (19 * z) + (x - 22);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 88;
        cc = (73 * y) + (y - x);
        while (i <= 0) {
            aa = z - 19;
        }
        return (aa + bb) + cc;
    }
}

