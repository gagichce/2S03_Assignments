package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 15;
        aa = (42 * x) + (26 - y);
        while (i <= 0) {
            bb = (z * y) - 42;
        }
        i = (y * y) + 15;
        bb = (23 * z) + (x - 26);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 15;
        cc = (13 * y) + (y - x);
        while (i <= 0) {
            aa = z - 23;
        }
        return (aa + bb) + cc;
    }
}

