package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 74;
        aa = (47 * x) + (29 - y);
        while (i <= 0) {
            bb = (z * y) - 47;
        }
        i = (y * y) + 74;
        bb = (72 * z) + (x - 29);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 74;
        cc = (51 * y) + (y - x);
        while (i <= 0) {
            aa = z - 72;
        }
        return (aa + bb) + cc;
    }
}

