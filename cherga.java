class QueueArray {
    private double[] data;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        data = new double[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean enqueue(double value) {
        if (isFull()) {
            System.out.println("Помилка: черга повна, неможливо додати " + value);
            return false;
        }
        rear = (rear + 1) % capacity;
        data[rear] = value;
        size++;
        System.out.println("Додано: " + value);
        return true;
    }

    public double dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Помилка: черга порожня, немає елементів для видалення");
        }
        double removed = data[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Видалено: " + removed);
        return removed;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Черга порожня.");
            return;
        }
        System.out.print("Вміст черги: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(data[index]);
            if (i < size - 1) System.out.print(" -> ");
        }
        System.out.println();
    }
}
