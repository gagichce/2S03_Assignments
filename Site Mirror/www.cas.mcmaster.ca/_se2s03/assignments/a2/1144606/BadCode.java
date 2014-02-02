package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 44;
        aa = (9 * x) + (92 - y);
        while (i <= 0) {
            bb = (z * y) - 9;
        }
        i = (y * y) + 44;
        bb = (67 * z) + (x - 92);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 44;
        cc = (33 * y) + (y - x);
        while (i <= 0) {
            aa = z - 67;
        }
        return (aa + bb) + cc;
    }
}

