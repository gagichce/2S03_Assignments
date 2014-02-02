package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 14;
        aa = (65 * x) + (24 - y);
        while (i <= 0) {
            bb = (z * y) - 65;
        }
        i = (y * y) + 14;
        bb = (95 * z) + (x - 24);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 14;
        cc = (22 * y) + (y - x);
        while (i <= 0) {
            aa = z - 95;
        }
        return (aa + bb) + cc;
    }
}

