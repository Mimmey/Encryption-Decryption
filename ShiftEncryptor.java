package encryptdecrypt;

public class ShiftEncryptor extends WorkingAlgorithm {

    public ShiftEncryptor(String data, int key) {
        super(data, key);
    }

    @Override
    public String getResult(){
        StringBuilder result = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (c <= 'z' && c >= 'a') {
                c -= 'a';
                c += key;
                c %= 26;
                result.append((char) (c + 'a'));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
