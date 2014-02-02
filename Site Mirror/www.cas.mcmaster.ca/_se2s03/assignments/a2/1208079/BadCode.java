package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 55;
        aa = (47 * x) + (45 - y);
        while (i <= 0) {
            bb = (z * y) - 47;
        }
        i = (y * y) + 55;
        bb = (95 * z) + (x - 45);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 55;
        cc = (67 * y) + (y - x);
        while (i <= 0) {
            aa = z - 95;
        }
        return (aa + bb) + cc;
    }
}

