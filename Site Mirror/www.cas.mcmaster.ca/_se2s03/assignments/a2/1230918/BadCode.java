package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 67;
        aa = (2 * x) + (71 - y);
        while (i <= 0) {
            bb = (z * y) - 2;
        }
        i = (y * y) + 67;
        bb = (35 * z) + (x - 71);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 67;
        cc = (48 * y) + (y - x);
        while (i <= 0) {
            aa = z - 35;
        }
        return (aa + bb) + cc;
    }
}

