package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 27;
        aa = (20 * x) + (60 - y);
        while (i <= 0) {
            bb = (z * y) - 20;
        }
        i = (y * y) + 27;
        bb = (31 * z) + (x - 60);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 27;
        cc = (42 * y) + (y - x);
        while (i <= 0) {
            aa = z - 31;
        }
        return (aa + bb) + cc;
    }
}

