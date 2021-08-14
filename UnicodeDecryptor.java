package encryptdecrypt;

public class UnicodeDecryptor extends WorkingAlgorithm {

    public UnicodeDecryptor(String data, int key) {
        super(data, key);
    }

    @Override
    public String getResult() {
        StringBuilder result = new StringBuilder();

        for (char c : data.toCharArray()) {
            result.append((char) (c - key));
        }

        return result.toString();
    }
}
