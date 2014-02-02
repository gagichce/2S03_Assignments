package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 83;
        aa = (74 * x) + (59 - y);
        while (i <= 0) {
            bb = (z * y) - 74;
        }
        i = (y * y) + 83;
        bb = (57 * z) + (x - 59);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 83;
        cc = (94 * y) + (y - x);
        while (i <= 0) {
            aa = z - 57;
        }
        return (aa + bb) + cc;
    }
}

