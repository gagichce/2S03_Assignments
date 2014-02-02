package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 21;
        aa = (54 * x) + (87 - y);
        while (i <= 0) {
            bb = (z * y) - 54;
        }
        i = (y * y) + 21;
        bb = (14 * z) + (x - 87);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 21;
        cc = (15 * y) + (y - x);
        while (i <= 0) {
            aa = z - 14;
        }
        return (aa + bb) + cc;
    }
}

