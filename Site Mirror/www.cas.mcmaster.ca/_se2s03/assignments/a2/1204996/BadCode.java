package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 44;
        aa = (92 * x) + (73 - y);
        while (i <= 0) {
            bb = (z * y) - 92;
        }
        i = (y * y) + 44;
        bb = (56 * z) + (x - 73);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 44;
        cc = (40 * y) + (y - x);
        while (i <= 0) {
            aa = z - 56;
        }
        return (aa + bb) + cc;
    }
}

