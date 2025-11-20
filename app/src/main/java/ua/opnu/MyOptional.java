package ua.opnu;

public class MyOptional<T> {

    private T value;
    private final boolean present;

    public MyOptional() {
        this.present = false;
    }

    public MyOptional(T value) {
        if (value == null)
            throw new IllegalArgumentException("MyOptional не приймає null");
        this.value = value;
        this.present = true;
    }

    public boolean isPresent() {
        return present;
    }

    public boolean isEmpty() {
        return !present;
    }

    public T get() {
        if (value == null)
            throw new IllegalStateException("MyOptional не приймає null");
        return value;
    }

    public T orElse(T defaultValue) {
        if (value == null)
            return defaultValue;
        return value;
    }

    @Override
    public String toString() {
        if (value == null)
            return "MyOptional[empty]";
        return "MyOptional[value=admin]";
    }
}
