package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 90;
        aa = (92 * x) + (85 - y);
        while (i <= 0) {
            bb = (z * y) - 92;
        }
        i = (y * y) + 90;
        bb = (12 * z) + (x - 85);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 90;
        cc = (70 * y) + (y - x);
        while (i <= 0) {
            aa = z - 12;
        }
        return (aa + bb) + cc;
    }
}

