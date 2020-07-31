package HomeWork6;

import java.util.Arrays;

public class DataContainer<T> {
    private T[] data;
    int current = 0;

    public DataContainer(T[] intArr) {
        this.data = intArr;

    }

    /**
     * Пока счетчик меньше длины массива присваиваем по индексу введенное значение.
     * Если счетчик значений больше длины массива, расширяем массив в соответствии с количеством введенныых значений и присваиваем
     * значения по индексу.
     */

    public int add(T item) {
        current++;
        if (current > data.length) {
            data = Arrays.copyOf(data, data.length + 1);

        }
        int index = current - 1;
        this.data[index] = item;
        return index;

    }

    public T get(int index) {
        return this.data[index];
    }

    public T[] getItems() {
        return data;
    }

    /**
     * Удаляем элемент по индексу со смещением последующих элементов на одну ячейку влево, оставляя пустой последнюю ячейку.
     * Переносим все элементы массива в массив меньшего размера.
     * false - При введении несуществующего индекса изменений не происходит.
     */

    public boolean deleteIndex(int index) {
        if (index <= data.length - 1) {
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        }
        return false;
    }

    /**
     * Удаляем элемент по значению со смещением последующих элементов на одну ячейку влево, оставляя пустой последнюю ячейку.
     * Переносим все элементы массива в массив меньшего размера.
     * false - При введении несуществующего значения изменений не происходит.
     */

    public boolean deleteElement(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)) {
                for (int k = i; k < data.length - 1; k++) {
                    data[k] = data[k + 1];
                }
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        }
        return false;

    }
}













