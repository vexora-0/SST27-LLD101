public class Decode implements IDecoder {
    public Frame decode(byte[] fileBytes) {
        return new Frame(fileBytes);
    }
}
