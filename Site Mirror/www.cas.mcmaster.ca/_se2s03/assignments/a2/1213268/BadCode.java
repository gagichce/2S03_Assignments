package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 35;
        aa = (92 * x) + (24 - y);
        while (i <= 0) {
            bb = (z * y) - 92;
        }
        i = (y * y) + 35;
        bb = (20 * z) + (x - 24);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 35;
        cc = (71 * y) + (y - x);
        while (i <= 0) {
            aa = z - 20;
        }
        return (aa + bb) + cc;
    }
}

