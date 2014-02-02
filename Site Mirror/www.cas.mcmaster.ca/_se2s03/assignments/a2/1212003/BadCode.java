package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 67;
        aa = (92 * x) + (87 - y);
        while (i <= 0) {
            bb = (z * y) - 92;
        }
        i = (y * y) + 67;
        bb = (47 * z) + (x - 87);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 67;
        cc = (12 * y) + (y - x);
        while (i <= 0) {
            aa = z - 47;
        }
        return (aa + bb) + cc;
    }
}

