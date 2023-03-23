import java.util.Arrays;

public class HumanFromDataConverter {
    public static Human[] convert(String[] data) {
        int id;
        String name;
        int waterCount;
        int gasCount1;
        int gasCount2;
        int electroCount1;
        int electroCount2;

        Human[] humans = new Human[0];

        for (int i = 1; i < data.length; i++) {
            String[] paramsArr = data[i].split("\\|");
            humans = Arrays.copyOf(humans, humans.length + 1);

            id = Integer.parseInt(paramsArr[0]);
            name = paramsArr[1];
            waterCount = Integer.parseInt(paramsArr[2]);
            gasCount1 = Integer.parseInt(paramsArr[3]);
            gasCount2 = Integer.parseInt(paramsArr[4]);
            electroCount1 = Integer.parseInt(paramsArr[5]);
            electroCount2 = Integer.parseInt(paramsArr[6]);

            humans[i - 1] = new Human(id, name, waterCount, gasCount1, gasCount2, electroCount1, electroCount2);
        }
        return humans;
    }

    public static String getHeader(String[] data) {
        return data[0];
    }
}
