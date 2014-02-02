package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 80;
        aa = (74 * x) + (28 - y);
        while (i <= 0) {
            bb = (z * y) - 74;
        }
        i = (y * y) + 80;
        bb = (72 * z) + (x - 28);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 80;
        cc = (3 * y) + (y - x);
        while (i <= 0) {
            aa = z - 72;
        }
        return (aa + bb) + cc;
    }
}

