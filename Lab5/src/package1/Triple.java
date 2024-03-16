package package1;


public class Triple<T1, T2, T3> {
    private T1 first;
    private T2 second;
    private T3 third;

    public Triple(T1 first, T2 second, T3 third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean equals(Object otherTriple) {
        if (this == otherTriple) return true;
        if (otherTriple == null || getClass() != otherTriple.getClass()) return false;
        Triple<?, ?, ?> triple = (Triple<?, ?, ?>) otherTriple;
        return first.equals(triple.first) && second.equals(triple.second) && third.equals(triple.third);
    }

    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}