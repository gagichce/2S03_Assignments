package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 87;
        aa = (56 * x) + (92 - y);
        while (i <= 0) {
            bb = (z * y) - 56;
        }
        i = (y * y) + 87;
        bb = (95 * z) + (x - 92);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 87;
        cc = (48 * y) + (y - x);
        while (i <= 0) {
            aa = z - 95;
        }
        return (aa + bb) + cc;
    }
}

