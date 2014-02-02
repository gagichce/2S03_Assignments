package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 7;
        aa = (90 * x) + (41 - y);
        while (i <= 0) {
            bb = (z * y) - 90;
        }
        i = (y * y) + 7;
        bb = (50 * z) + (x - 41);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 7;
        cc = (29 * y) + (y - x);
        while (i <= 0) {
            aa = z - 50;
        }
        return (aa + bb) + cc;
    }
}

