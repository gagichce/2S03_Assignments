package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 91;
        aa = (38 * x) + (18 - y);
        while (i <= 0) {
            bb = (z * y) - 38;
        }
        i = (y * y) + 91;
        bb = (60 * z) + (x - 18);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 91;
        cc = (17 * y) + (y - x);
        while (i <= 0) {
            aa = z - 60;
        }
        return (aa + bb) + cc;
    }
}

