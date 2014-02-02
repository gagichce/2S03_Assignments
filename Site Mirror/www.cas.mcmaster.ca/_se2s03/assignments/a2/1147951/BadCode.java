package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 73;
        aa = (27 * x) + (43 - y);
        while (i <= 0) {
            bb = (z * y) - 27;
        }
        i = (y * y) + 73;
        bb = (7 * z) + (x - 43);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 73;
        cc = (53 * y) + (y - x);
        while (i <= 0) {
            aa = z - 7;
        }
        return (aa + bb) + cc;
    }
}

