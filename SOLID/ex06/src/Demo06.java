public class Demo06 {
    public static void main(String[] args) {
        new Aviary().release(new Aviary());
        new Aviary().release(new Penguin()); // runtime error to compile error
    }
}
