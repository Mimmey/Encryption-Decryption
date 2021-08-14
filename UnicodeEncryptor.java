package encryptdecrypt;

public class UnicodeEncryptor extends WorkingAlgorithm {

    public UnicodeEncryptor(String data, int key) {
        super(data, key);
    }

    @Override
    public String getResult() {
        StringBuilder result = new StringBuilder();
        
        for (char c : data.toCharArray()) {
            result.append((char) (c + key));
        }

        return result.toString();
    }
}
