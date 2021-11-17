package c4;

public class C008ByteUShift {
    public static void main(String[] args) {
        char hex[] = {
                '0', '1', '2', '3', '4', '5', '6', '7', '8',
                '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b = (byte) 0xf1;
        byte c = (byte) (b >> 4);
        byte d = (byte) (b >>> 4);
        byte e = (byte) ((b & 0xff) >> 4);

        System.out.println("    b = 0x"+ hex[(b >> 4) & 0x0f] +
                hex[b & 0x0f]);
        System.out.println("    b = 0x"+ hex[(b >>> 4) & 0x0f] +
                hex[b & 0x0f]);

    }
}
