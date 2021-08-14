package encryptdecrypt;

public abstract class WorkingAlgorithm {
    protected String data;
    protected int key;

    public WorkingAlgorithm(String data, int key) {
        this.data = data;
        this.key = key;
    }

    abstract String getResult();
}
