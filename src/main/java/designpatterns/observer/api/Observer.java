package designpatterns.observer.api;

public interface Observer<T extends State> {
    void update(T state);
}
