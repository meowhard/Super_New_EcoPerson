public class Input {
    private final String PATH;
    private final int MAX_CONSUMPTION;

    public Input(String path, int maxConsumption) {
        this.PATH = path;
        this.MAX_CONSUMPTION = maxConsumption;
    }

    public String getPath() {
        return PATH;
    }

    public int getMaxConsumption() {return MAX_CONSUMPTION;}
}
