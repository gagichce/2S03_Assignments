package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 65;
        aa = (2 * x) + (35 - y);
        while (i <= 0) {
            bb = (z * y) - 2;
        }
        i = (y * y) + 65;
        bb = (32 * z) + (x - 35);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 65;
        cc = (27 * y) + (y - x);
        while (i <= 0) {
            aa = z - 32;
        }
        return (aa + bb) + cc;
    }
}

