import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Input input = new Input("c:\\data\\super_new_data\\data.csv", 400);
        processing(input.getPath(), input.getMaxConsumption());
    }

    static void processing(String path, int maxConsumption) throws IOException {
        String[] data = DataReader.read(path);
        Human[] convertedData = HumanFromDataConverter.convert(data);
        String header = HumanFromDataConverter.getHeader(data);
        Human[] filtered = HumanFilter.filter(convertedData, maxConsumption);
        HumanWriter.write(header, filtered, path);
    }
}