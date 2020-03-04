public class Array {
    private int[] data;
    private int size;

    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(int e) {
        add(e, 0);
    }

    public void addLast(int e) {
        add(e, size);
    }

    public void add(int e, int index) {
        if (size == data.length)
            throw new IllegalArgumentException("Add last failed.Array is full");
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add last failed. Index error");

        for (int i = size-1; i >= index; i--)
            data[i + 1] = data[i];

        data[index] = e;
        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed.");
        return data[index];
    }

    public void set(int index, int e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed.");
        data[index] = e;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array size = %d\n capacity = %d\n", size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1)
                res.append(", ");
        }
        res.append("]");
        return res.toString();
    }



}
