import java.util.Arrays;

public class HumanFilter {
    public static Human[] filter(Human[] humans, int maxConsumption) {
        Human[] filtered = new Human[0];
        int j = 0;

        for (int i = 0; i < humans.length; i++) {
            if ((humans[i].getWaterCount() < maxConsumption) &&
                    (humans[i].getGasCount1() < maxConsumption) &&
                    (humans[i].getGasCount2() < maxConsumption) &&
                    (humans[i].getElectroCount1() < maxConsumption) &&
                    (humans[i].getElectroCount2() < maxConsumption)) {
                filtered = Arrays.copyOf(filtered, filtered.length + 1);
                filtered[j] = humans[i];
                j++;
            }
        }
        return filtered;
    }
}
