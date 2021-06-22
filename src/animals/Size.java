package animals;

public enum Size {
    SMALL(1), MEDIUM (2), BIG (3), ENORMOUS(4);

    private int size;

    Size(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }
}
