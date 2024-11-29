package az.abbtech.lesson_7.tasks.task_1;

public class GenericStorage<T extends Person> {
    private T[] items;
    private int size;

    public GenericStorage() {
        this(10);   // Default size
    }

    public GenericStorage(int length) {
        items = (T[]) new Person[length];
        size = 0;
    }

    public boolean addItem(T item) {
        if (item == null) {
            System.out.println("Cannot add null item.");
            return false;
        }
        if (size == items.length) {
            resizeArray();
        }
        items[size++] = item;
        return true;
    }

    private void resizeArray() {
        int newSize = items.length + items.length / 2;      // Increase size by 50%
        T[] newItems = (T[]) new Person[newSize];
        for (int i = 0; i < size; i++) {
            newItems[i] = items[i];
        }
        items = newItems;
    }

    public boolean removeItem(T item) {
        if (item == null) return false;     // Prevent null removals
        boolean removed = false;
        for (int i = 0; i < size; i++) {
            if (items[i] != null && items[i].equals(item)) {
                shiftLeft(i);
                size--;
                removed = true;
                break;
            }
        }
        return removed;
    }

    private void shiftLeft(int index) {
        for (int i = index; i < size-1; i++) {
            items[i] = items[i+1];
        }
        items[size-1] = null;
    };

    public T searchItemById(int id) {
        for (int i = 0; i < size; i++) {
            if (items[i] != null && items[i].getId() == id) {
                return items[i];
            }
        }
        return null;
    }

    public T searchItemByName(String name) {
        for (int i = 0; i < size; i++) {
            if (items[i] != null && items[i].getName().equalsIgnoreCase(name)) {
                return items[i];
            }
        }
        return null;
    }

    public void displayAllItems() {
        if (size == 0) {
            System.out.println("Storage is empty.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println((i+1) + "." + items[i]);
        }
    }
}
