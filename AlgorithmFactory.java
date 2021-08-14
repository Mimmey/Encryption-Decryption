package encryptdecrypt;

public class AlgorithmFactory {
    public static WorkingAlgorithm createAlgorithm(String type, String mode, String data, int key) {
        if ("shift".equals(type) && "enc".equals(mode)) {
            return new ShiftEncryptor(data, key);
        } else if ("shift".equals(type) && "dec".equals(mode)) {
            return new ShiftDecryptor(data, key);
        } else if ("unicode".equals(type) && "enc".equals(mode)) {
            return new UnicodeEncryptor(data, key);
        } else if ("unicode".equals(type) && "dec".equals(mode)) {
            return new UnicodeDecryptor(data, key);
        } else {
            return null;
        }
    }
}
