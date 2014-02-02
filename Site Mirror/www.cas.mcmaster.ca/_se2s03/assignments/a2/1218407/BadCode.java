package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 28;
        aa = (29 * x) + (31 - y);
        while (i <= 0) {
            bb = (z * y) - 29;
        }
        i = (y * y) + 28;
        bb = (74 * z) + (x - 31);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 28;
        cc = (94 * y) + (y - x);
        while (i <= 0) {
            aa = z - 74;
        }
        return (aa + bb) + cc;
    }
}

