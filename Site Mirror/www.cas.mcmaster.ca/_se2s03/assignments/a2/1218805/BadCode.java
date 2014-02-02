package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 73;
        aa = (65 * x) + (4 - y);
        while (i <= 0) {
            bb = (z * y) - 65;
        }
        i = (y * y) + 73;
        bb = (17 * z) + (x - 4);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 73;
        cc = (49 * y) + (y - x);
        while (i <= 0) {
            aa = z - 17;
        }
        return (aa + bb) + cc;
    }
}

