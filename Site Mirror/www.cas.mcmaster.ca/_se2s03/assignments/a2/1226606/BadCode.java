package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 59;
        aa = (2 * x) + (97 - y);
        while (i <= 0) {
            bb = (z * y) - 2;
        }
        i = (y * y) + 59;
        bb = (42 * z) + (x - 97);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 59;
        cc = (8 * y) + (y - x);
        while (i <= 0) {
            aa = z - 42;
        }
        return (aa + bb) + cc;
    }
}

