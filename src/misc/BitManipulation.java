package misc;

public class BitManipulation {

    public static int rotationShiftLeft(int i, int n) {
        return (i << n) | (i >> 32 - n);
    }

    public static int rotationShiftRight(int i, int n) {
        return (i >> n) | (i << 32 - n);
    }

    public static byte rotationShiftLeft(byte i, int n) {
        return (byte) ((i << n) | (i >> 8 - n));
    }

    public static byte rotationShiftRight(byte i, int n) {
        return (byte) ((i >> n) | (i << 8 - n));
    }

    public static byte[] changeEndianness(byte[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            byte b = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = b;
        }

        return arr;
    }

    public static int changeEndianness(int n) {
        int output = 0x00000000;

        output |= ((n & 0xFF000000) >> 24);
        output |= ((n & 0x00FF0000) >>  8);
        output |= ((n & 0x0000FF00) <<  8);
        output |= ((n & 0x000000FF) << 24);

        return output;
    }

    public static int[] changeEndianness(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = changeEndianness(arr[i]);
        }
        return arr;
    }

}
