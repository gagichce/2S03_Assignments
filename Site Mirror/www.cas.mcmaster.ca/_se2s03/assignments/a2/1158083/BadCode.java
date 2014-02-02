package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 57;
        aa = (45 * x) + (57 - y);
        while (i <= 0) {
            bb = (z * y) - 45;
        }
        i = (y * y) + 57;
        bb = (40 * z) + (x - 57);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 57;
        cc = (80 * y) + (y - x);
        while (i <= 0) {
            aa = z - 40;
        }
        return (aa + bb) + cc;
    }
}

