package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 27;
        aa = (92 * x) + (66 - y);
        while (i <= 0) {
            bb = (z * y) - 92;
        }
        i = (y * y) + 27;
        bb = (79 * z) + (x - 66);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 27;
        cc = (20 * y) + (y - x);
        while (i <= 0) {
            aa = z - 79;
        }
        return (aa + bb) + cc;
    }
}

