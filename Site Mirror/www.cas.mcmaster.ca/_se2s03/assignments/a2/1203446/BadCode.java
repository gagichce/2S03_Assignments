package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 15;
        aa = (11 * x) + (62 - y);
        while (i <= 0) {
            bb = (z * y) - 11;
        }
        i = (y * y) + 15;
        bb = (73 * z) + (x - 62);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 15;
        cc = (50 * y) + (y - x);
        while (i <= 0) {
            aa = z - 73;
        }
        return (aa + bb) + cc;
    }
}

