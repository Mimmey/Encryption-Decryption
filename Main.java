package encryptdecrypt;

import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String alg = "shift";
        String mode = "enc";
        String data = "";
        int key = 0;

        int position = 0;

        while (position < args.length) {
            switch (args[position]) {
                case "-alg":
                    alg = args[position + 1];
                    position += 2;
                    break;
                case "-mode":
                    mode = args[position + 1];
                    position += 2;
                    break;
                case "-data":
                    data = args[position + 1];
                    position += 2;
                    break;
                case "-key":
                    key = Integer.parseInt(args[position + 1]);
                    position += 2;
                    break;
                case "-in":
                    if (data.equals("")) {
                        reader = new BufferedReader(new FileReader(args[position + 1]));
                        data = reader.readLine();
                        position += 2;
                    }
                    break;
                case "-out":
                    writer = new BufferedWriter(new FileWriter(args[position + 1]));
                    position += 2;
                    break;
                default:
                    position++;
            }
        }

        WorkingAlgorithm algorithm = AlgorithmFactory.createAlgorithm(alg, mode, data, key);
        String result = algorithm.getResult();

        writer.write(Objects.requireNonNullElse(result, "Error!"));

        reader.close();
        writer.close();
    }
}
