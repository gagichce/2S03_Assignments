package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 34;
        aa = (74 * x) + (36 - y);
        while (i <= 0) {
            bb = (z * y) - 74;
        }
        i = (y * y) + 34;
        bb = (55 * z) + (x - 36);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 34;
        cc = (98 * y) + (y - x);
        while (i <= 0) {
            aa = z - 55;
        }
        return (aa + bb) + cc;
    }
}

