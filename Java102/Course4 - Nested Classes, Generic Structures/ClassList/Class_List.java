package ClassList;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Class_List<T> {

    private T[] dataList;
    private int size;

    @SuppressWarnings("unchecked")
    public Class_List() {
        this.dataList = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public Class_List(int capacity) {
        this.dataList = (T[]) new Object[capacity];
    }

    public int arraySize() {
        return this.size;
    }

    public int getCapacity() {
        return this.dataList.length;
    }

    public void add(T data) {
        if (this.size == this.dataList.length) {
            T[] arrayIncreaseLength;
            arrayIncreaseLength = Arrays.copyOf(this.dataList, this.dataList.length * 2);
            this.dataList = arrayIncreaseLength;
        }

        for (int i = 0; i < this.dataList.length; i++) {
            if (this.dataList[i] == null) {
                this.dataList[i] = data;
                this.size++;
                break;
            }
        }
    }

    public void printArray() {
        int counter = 0;
        System.out.print("[");
        for (T x : this.dataList) {
            if (x == null)
                continue;

            if (counter == this.size - 1) {
                System.out.print(x);
                break;
            }
            System.out.print(x + ",");
            counter++;
        }
        System.out.print("]");
        System.out.println();
    }

    public T getIndex(int index) {
        if (index < 0 || index >= this.dataList.length) {
            return null;
        } else {
            return this.dataList[index];
        }
    }

    public void setIndex(int index, T data) {
        if (index < 0 || index >= this.size) {
            System.out.println("Invalid index.");
        } else {
            this.dataList[index] = data;
        }
    }

    public void removeData(int index) {
        if (index < 0 || index >= this.size) {
            System.out.println("Invalid index.");
        } else {
            for (int i = 0; i < (this.size - index - 1); i++) {
                this.dataList[index + i] = this.dataList[index + i + 1];
            }
            this.dataList[this.size - 1] = null;
            this.size = this.size - 1;
        }
    }

    public int indexOf(T data) {
        for (int i = 0; i < this.size; i++) {
            if (this.dataList[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = 0; i < this.size; i++) {
            if (this.dataList[this.size - i] == data) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmptyArray() {
        return this.size == 0;
    }

    public T[] toArray() {
        return this.dataList;
    }

    public void clear() {
        Arrays.fill(this.dataList, null);
        this.size = 0;
    }

    public boolean includes(T data) {
        for (int i = 0; i < this.size; i++) {
            if (dataList[i] == data) {
                return true;
            }
        }
        return false;
    }

    public Class_List<T> sublist(int start, int finish) {
        Class_List<T> subArray = new Class_List<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            subArray.add((T)(this.getIndex(i)));
        }
        return subArray;
    }
}

// by rraeich
