package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 57;
        aa = (65 * x) + (48 - y);
        while (i <= 0) {
            bb = (z * y) - 65;
        }
        i = (y * y) + 57;
        bb = (39 * z) + (x - 48);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 57;
        cc = (34 * y) + (y - x);
        while (i <= 0) {
            aa = z - 39;
        }
        return (aa + bb) + cc;
    }
}

