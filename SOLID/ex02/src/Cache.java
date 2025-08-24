public class Cache implements ICache {
    public void cache(Frame frame) {
        System.out.println("Cached last frame? " + (frame!=null));
    }
}
