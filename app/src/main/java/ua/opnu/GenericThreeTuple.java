package ua.opnu;

public class GenericThreeTuple<T, V, S> {

    public final GenericTwoTuple<T, V> oneTwo;
    public final S three;

    public GenericThreeTuple(T first, V second, S three) {
        this.oneTwo = new GenericTwoTuple<>(first, second);
        this.three = three;
    }

    @Override
    public String toString() {
        return "(" + oneTwo.first + "," + oneTwo.second + "," + three + ')';
    }
}
