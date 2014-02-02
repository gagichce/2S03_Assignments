package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 18;
        aa = (92 * x) + (55 - y);
        while (i <= 0) {
            bb = (z * y) - 92;
        }
        i = (y * y) + 18;
        bb = (86 * z) + (x - 55);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 18;
        cc = (55 * y) + (y - x);
        while (i <= 0) {
            aa = z - 86;
        }
        return (aa + bb) + cc;
    }
}

