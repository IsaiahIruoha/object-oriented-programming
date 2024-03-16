package package1;

public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public boolean equals(Object otherPair) {
        if (this == otherPair) return true;
        if (otherPair == null || getClass() != otherPair.getClass()) return false;
        Pair<?> pair = (Pair<?>) otherPair;
        return first.equals(pair.first) && second.equals(pair.second);
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}