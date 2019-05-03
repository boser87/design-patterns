package designpatterns.singleton.threadsafe;

public class SingletonThreadSafe {
    private SingletonThreadSafe() {}

    private static SingletonThreadSafe instance;

    synchronized public static SingletonThreadSafe getInstance() {
        if(instance == null) {
            instance = new SingletonThreadSafe();
        }

        return instance;
    }
}
