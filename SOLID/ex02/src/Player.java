public class Player {
    private Frame last;
    IDecoder decoder;
    IDraw drawer;
    ICache cache;
    public Player(IDecoder decoder, IDraw drawer, ICache cache) {
        this.decoder = decoder;
        this.drawer = drawer;
        this.cache = cache;
    }
    void play(byte[] fileBytes){
        // decode
        last = decoder.decode(fileBytes);
        // draw UI
        drawer.draw(fileBytes);
        // cache
        cache.cache(last);
    }
}