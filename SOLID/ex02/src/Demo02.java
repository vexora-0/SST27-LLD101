public class Demo02 {
    public static void main(String[] args) {
        IDecoder decoder = new Decode();
        IDraw drawer = new Draw();
        ICache cache = new Cache();
        Player player = new Player(decoder, drawer, cache);
        player.play(new byte[]{1,2,3,4});
    }
}
