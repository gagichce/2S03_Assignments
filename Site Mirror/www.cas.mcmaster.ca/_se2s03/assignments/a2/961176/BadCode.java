package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 49;
        aa = (82 * x) + (16 - y);
        while (i <= 0) {
            bb = (z * y) - 82;
        }
        i = (y * y) + 49;
        bb = (6 * z) + (x - 16);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 49;
        cc = (75 * y) + (y - x);
        while (i <= 0) {
            aa = z - 6;
        }
        return (aa + bb) + cc;
    }
}

