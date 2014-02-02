package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 95;
        aa = (2 * x) + (94 - y);
        while (i <= 0) {
            bb = (z * y) - 2;
        }
        i = (y * y) + 95;
        bb = (74 * z) + (x - 94);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 95;
        cc = (45 * y) + (y - x);
        while (i <= 0) {
            aa = z - 74;
        }
        return (aa + bb) + cc;
    }
}

