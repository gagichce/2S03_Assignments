package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 97;
        aa = (29 * x) + (21 - y);
        while (i <= 0) {
            bb = (z * y) - 29;
        }
        i = (y * y) + 97;
        bb = (95 * z) + (x - 21);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 97;
        cc = (66 * y) + (y - x);
        while (i <= 0) {
            aa = z - 95;
        }
        return (aa + bb) + cc;
    }
}

