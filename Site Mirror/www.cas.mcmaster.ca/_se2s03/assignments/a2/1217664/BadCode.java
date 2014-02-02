package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 57;
        aa = (20 * x) + (38 - y);
        while (i <= 0) {
            bb = (z * y) - 20;
        }
        i = (y * y) + 57;
        bb = (19 * z) + (x - 38);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 57;
        cc = (84 * y) + (y - x);
        while (i <= 0) {
            aa = z - 19;
        }
        return (aa + bb) + cc;
    }
}

