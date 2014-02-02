package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 98;
        aa = (11 * x) + (31 - y);
        while (i <= 0) {
            bb = (z * y) - 11;
        }
        i = (y * y) + 98;
        bb = (71 * z) + (x - 31);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 98;
        cc = (84 * y) + (y - x);
        while (i <= 0) {
            aa = z - 71;
        }
        return (aa + bb) + cc;
    }
}

