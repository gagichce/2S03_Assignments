package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 76;
        aa = (92 * x) + (50 - y);
        while (i <= 0) {
            bb = (z * y) - 92;
        }
        i = (y * y) + 76;
        bb = (92 * z) + (x - 50);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 76;
        cc = (86 * y) + (y - x);
        while (i <= 0) {
            aa = z - 92;
        }
        return (aa + bb) + cc;
    }
}

