package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 54;
        aa = (11 * x) + (25 - y);
        while (i <= 0) {
            bb = (z * y) - 11;
        }
        i = (y * y) + 54;
        bb = (89 * z) + (x - 25);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 54;
        cc = (96 * y) + (y - x);
        while (i <= 0) {
            aa = z - 89;
        }
        return (aa + bb) + cc;
    }
}

