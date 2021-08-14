package encryptdecrypt;

public class ShiftDecryptor extends WorkingAlgorithm {
    
    public ShiftDecryptor(String data, int key) {
        super(data, key);
    }

    @Override
    public String getResult(){
        StringBuilder result = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (c <= 'z' && c >= 'a') {
                int cInt = c;
                cInt -= 'a';
                cInt -= key;
                cInt %= 26;

                while(cInt < 0) {
                    cInt += 26;
                }

                result.append((char) (cInt + 'a'));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
