package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 26;
        aa = (4 * x) + (54 - y);
        while (i <= 0) {
            bb = (z * y) - 4;
        }
        i = (y * y) + 26;
        bb = (31 * z) + (x - 54);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 26;
        cc = (66 * y) + (y - x);
        while (i <= 0) {
            aa = z - 31;
        }
        return (aa + bb) + cc;
    }
}

