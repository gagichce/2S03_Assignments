package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 95;
        aa = (29 * x) + (62 - y);
        while (i <= 0) {
            bb = (z * y) - 29;
        }
        i = (y * y) + 95;
        bb = (74 * z) + (x - 62);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 95;
        cc = (88 * y) + (y - x);
        while (i <= 0) {
            aa = z - 74;
        }
        return (aa + bb) + cc;
    }
}

