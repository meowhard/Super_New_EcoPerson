import java.io.IOException;

public class Main {
    static String path = "c:\\data\\super_new_data\\data.csv";
    static int maxConsumption = 400;

    public static void main(String[] args) throws IOException {
        String[] data = DataReader.read(path);
        Human[] convertedData = HumanFromDataConverter.convert(data);
        String header = HumanFromDataConverter.getHeader(data);
        Human[] filtered = HumanFilter.filter(convertedData, maxConsumption);
        HumanWriter.write(header, filtered, path);
    }
}