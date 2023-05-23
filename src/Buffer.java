public class semaphore {
    private int empty;
    private int mutex=1;
    private int full=0;

    public semaphore(int buffer_size) {
        this.empty = buffer_size;
    }

}
