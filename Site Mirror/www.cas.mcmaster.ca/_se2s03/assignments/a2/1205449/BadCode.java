package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 64;
        aa = (29 * x) + (13 - y);
        while (i <= 0) {
            bb = (z * y) - 29;
        }
        i = (y * y) + 64;
        bb = (27 * z) + (x - 13);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 64;
        cc = (32 * y) + (y - x);
        while (i <= 0) {
            aa = z - 27;
        }
        return (aa + bb) + cc;
    }
}

