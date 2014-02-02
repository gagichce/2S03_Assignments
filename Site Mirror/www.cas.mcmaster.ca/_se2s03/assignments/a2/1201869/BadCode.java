package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 57;
        aa = (38 * x) + (75 - y);
        while (i <= 0) {
            bb = (z * y) - 38;
        }
        i = (y * y) + 57;
        bb = (31 * z) + (x - 75);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 57;
        cc = (32 * y) + (y - x);
        while (i <= 0) {
            aa = z - 31;
        }
        return (aa + bb) + cc;
    }
}

