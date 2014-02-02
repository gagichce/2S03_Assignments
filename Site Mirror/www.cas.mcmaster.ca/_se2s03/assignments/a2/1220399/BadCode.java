package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 93;
        aa = (47 * x) + (25 - y);
        while (i <= 0) {
            bb = (z * y) - 47;
        }
        i = (y * y) + 93;
        bb = (85 * z) + (x - 25);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 93;
        cc = (22 * y) + (y - x);
        while (i <= 0) {
            aa = z - 85;
        }
        return (aa + bb) + cc;
    }
}

