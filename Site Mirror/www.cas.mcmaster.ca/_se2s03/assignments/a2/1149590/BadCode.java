package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 6;
        aa = (27 * x) + (57 - y);
        while (i <= 0) {
            bb = (z * y) - 27;
        }
        i = (y * y) + 6;
        bb = (70 * z) + (x - 57);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 6;
        cc = (4 * y) + (y - x);
        while (i <= 0) {
            aa = z - 70;
        }
        return (aa + bb) + cc;
    }
}

