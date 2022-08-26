public class Lens {
    static int COUNTER = 0;
    private int minFocalLength;
    private int maxFocalLength;

    public Lens(int minFocalLength, int maxFocalLength) {
        if(minFocalLength < maxFocalLength) {
            this.minFocalLength = minFocalLength;
            this.maxFocalLength = maxFocalLength;
        }else{
            System.out.println("Minimal focal Length must be lower than maximum focal length!");
        }
        COUNTER++;
    }

    public int getMinFocalLength() {
        return minFocalLength;
    }

    public void setMinFocalLength(int minFocalLength) {
        if(minFocalLength < maxFocalLength) {
            this.minFocalLength = minFocalLength;
        }else{
            System.out.println("Minimal focal Length must be lower than maximum focal length!");
        }
    }

    public int getMaxFocalLength() {
        return maxFocalLength;
    }

    public void setMaxFocalLength(int maxFocalLength) {
        if(minFocalLength < maxFocalLength) {
            this.maxFocalLength = maxFocalLength;
        }else{
            System.out.println("Maximum focal Length must be higher than minumum focal length!");
        }
    }

    @Override
    public String toString() {
        return "Lens{" +
                "minFocalLength=" + minFocalLength +
                ", maxFocalLength=" + maxFocalLength +
                '}';
    }
}
