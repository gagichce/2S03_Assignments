package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 43;
        aa = (56 * x) + (75 - y);
        while (i <= 0) {
            bb = (z * y) - 56;
        }
        i = (y * y) + 43;
        bb = (66 * z) + (x - 75);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 43;
        cc = (79 * y) + (y - x);
        while (i <= 0) {
            aa = z - 66;
        }
        return (aa + bb) + cc;
    }
}

