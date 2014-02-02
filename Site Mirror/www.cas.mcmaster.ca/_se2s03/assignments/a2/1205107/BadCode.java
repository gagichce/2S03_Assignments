package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 99;
        aa = (11 * x) + (89 - y);
        while (i <= 0) {
            bb = (z * y) - 11;
        }
        i = (y * y) + 99;
        bb = (22 * z) + (x - 89);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 99;
        cc = (26 * y) + (y - x);
        while (i <= 0) {
            aa = z - 22;
        }
        return (aa + bb) + cc;
    }
}

