package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 32;
        aa = (65 * x) + (49 - y);
        while (i <= 0) {
            bb = (z * y) - 65;
        }
        i = (y * y) + 32;
        bb = (86 * z) + (x - 49);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 32;
        cc = (71 * y) + (y - x);
        while (i <= 0) {
            aa = z - 86;
        }
        return (aa + bb) + cc;
    }
}

