package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 89;
        aa = (11 * x) + (46 - y);
        while (i <= 0) {
            bb = (z * y) - 11;
        }
        i = (y * y) + 89;
        bb = (47 * z) + (x - 46);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 89;
        cc = (78 * y) + (y - x);
        while (i <= 0) {
            aa = z - 47;
        }
        return (aa + bb) + cc;
    }
}

