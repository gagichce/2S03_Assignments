package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 96;
        aa = (2 * x) + (66 - y);
        while (i <= 0) {
            bb = (z * y) - 2;
        }
        i = (y * y) + 96;
        bb = (69 * z) + (x - 66);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 96;
        cc = (70 * y) + (y - x);
        while (i <= 0) {
            aa = z - 69;
        }
        return (aa + bb) + cc;
    }
}

