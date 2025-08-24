public class Draw implements IDraw {
    public void draw(byte[] fileBytes) {
        System.out.println("▶ Playing " + fileBytes.length + " bytes");
    }
}
