import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class DataReader {
    public static String[] read(String path) throws IOException {
        String[] data = new String[0];
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        for (int i = 0; (line = bufferedReader.readLine()) != null; i++) {
            data = Arrays.copyOf(data, data.length + 1);
            data[i] = line;
        }

        bufferedReader.close();
        return data;
    }
}
