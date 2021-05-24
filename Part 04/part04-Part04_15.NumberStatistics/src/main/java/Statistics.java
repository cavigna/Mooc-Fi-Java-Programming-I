
public class Statistics {
    private int count;
    private int sum;
    private int average;

    public Statistics() {
        this.count = count;
        this.sum = 0;

    }

    public void addNumber(int number) {
        this.count += 1;
        this.sum +=number;
    }

    public int getCount() {

        return this.count;
    }
    public int sum() {
        return this.sum;
    }

    public double average() {
        if (count > 0) {
            return (double) sum() / getCount();
        } else {
            return 0.0;
        }
    }
}
