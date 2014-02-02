package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 27;
        aa = (2 * x) + (44 - y);
        while (i <= 0) {
            bb = (z * y) - 2;
        }
        i = (y * y) + 27;
        bb = (73 * z) + (x - 44);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 27;
        cc = (14 * y) + (y - x);
        while (i <= 0) {
            aa = z - 73;
        }
        return (aa + bb) + cc;
    }
}

