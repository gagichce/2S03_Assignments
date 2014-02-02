package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 30;
        aa = (92 * x) + (73 - y);
        while (i <= 0) {
            bb = (z * y) - 92;
        }
        i = (y * y) + 30;
        bb = (88 * z) + (x - 73);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 30;
        cc = (77 * y) + (y - x);
        while (i <= 0) {
            aa = z - 88;
        }
        return (aa + bb) + cc;
    }
}

