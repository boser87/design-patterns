package designpatterns.singleton.lazyloaded;

/*
 * https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom#Example_Java_Implementation
 */
public class Something {
    private Something() {}

    /*
     * Since the class initialization phase is guaranteed by the JLS to be sequential, i.e., non-concurrent, no further
     * synchronization is required in the static getInstance method during loading and initialization.
     */
    private static class LazyHolder {
        static final Something INSTANCE = new Something();
    }

    public static Something getInstance() {
        return LazyHolder.INSTANCE;
    }
}
