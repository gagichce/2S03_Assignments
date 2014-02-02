package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 59;
        aa = (20 * x) + (63 - y);
        while (i <= 0) {
            bb = (z * y) - 20;
        }
        i = (y * y) + 59;
        bb = (10 * z) + (x - 63);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 59;
        cc = (34 * y) + (y - x);
        while (i <= 0) {
            aa = z - 10;
        }
        return (aa + bb) + cc;
    }
}

