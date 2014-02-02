package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 67;
        aa = (18 * x) + (73 - y);
        while (i <= 0) {
            bb = (z * y) - 18;
        }
        i = (y * y) + 67;
        bb = (5 * z) + (x - 73);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 67;
        cc = (17 * y) + (y - x);
        while (i <= 0) {
            aa = z - 5;
        }
        return (aa + bb) + cc;
    }
}

