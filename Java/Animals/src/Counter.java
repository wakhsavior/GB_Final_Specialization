public class Counter implements AutoCloseable {
    private int counter = 0;
    private boolean isOpen;

    public int getCounter() {
        return counter;

    }

    public int add() throws CloseCounterException {
        if (!isOpen) {
            throw new CloseCounterException("Счетчик закрыт.");
        }
        return ++counter;
    }
    public void openCounter() {
        isOpen = true;
    }

    { // Инициализатор, выполняется каждый раз при вызове конструктора
        isOpen = true;
    }

    public Counter() {

    }

    public Counter(int counter) {
        this.counter = counter;
    }

    public void closeCounter() {
        isOpen = false;
    }

    @Override
    public void close() throws Exception {
        closeCounter();
    }
}

