package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 8;
        aa = (95 * x) + (29 - y);
        while (i <= 0) {
            bb = (z * y) - 95;
        }
        i = (y * y) + 8;
        bb = (25 * z) + (x - 29);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 8;
        cc = (59 * y) + (y - x);
        while (i <= 0) {
            aa = z - 25;
        }
        return (aa + bb) + cc;
    }
}

