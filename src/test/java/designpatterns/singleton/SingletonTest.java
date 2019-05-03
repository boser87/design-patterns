package designpatterns.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void onlyOneInstance() {
        Singleton singleton = Singleton.getInstance();
        Singleton another = Singleton.getInstance();

        assertTrue(singleton == another);
    }

}
