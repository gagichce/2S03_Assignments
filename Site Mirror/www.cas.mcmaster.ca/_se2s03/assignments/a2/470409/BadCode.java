package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 57;
        aa = (91 * x) + (19 - y);
        while (i <= 0) {
            bb = (z * y) - 91;
        }
        i = (y * y) + 57;
        bb = (12 * z) + (x - 19);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 57;
        cc = (53 * y) + (y - x);
        while (i <= 0) {
            aa = z - 12;
        }
        return (aa + bb) + cc;
    }
}

