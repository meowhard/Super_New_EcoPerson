import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class HumanWriter {
    public static void write(String header, Human[] filtered, String path) throws IOException {
        Path sourcePath = Path.of(path);
        Path resultPath = Path.of(sourcePath.getParent() + "\\result.csv");
        Files.write(resultPath, (header + "\n").getBytes());
        for (int i = 0; i < filtered.length; i++) {
            Files.write(resultPath, (filtered[i].getId() + "|" +
                    filtered[i].getName() + "|" +
                    filtered[i].getWaterCount() + "|" +
                    filtered[i].getGasCount1() + "|" +
                    filtered[i].getGasCount2() + "|" +
                    filtered[i].getElectroCount1() + "|" +
                    filtered[i].getElectroCount2() + "\n").getBytes(), StandardOpenOption.APPEND);
        }
    }
}
