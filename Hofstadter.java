//package hofstadter;

public class Hofstadter {
    private int firstValue = 1;
    private int secondValue = 1;

    private int desiredPosition;
    private int fatherValue;
    private int motherValue;
    private int currentPosition;

    public Hofstadter() {
        this.firstValue = 1;
        this.secondValue = 1;
        this.currentPosition = 2;
        this.fatherValue = firstValue;
        this.motherValue = secondValue;
    }

    public int findValue(int i) {
        this.desiredPosition = i;
        int[] array = new int[i];
        array[0] = firstValue;
        array[1] = secondValue;
        int fatherStepsBack;
        int motherStepsBack;
        for (int j = currentPosition; j < desiredPosition; j++) {
            fatherStepsBack = array[j - 2];
            motherStepsBack = array[j - 1];
            array[j] = array[j - fatherStepsBack] + array[j - motherStepsBack];
            //System.out.println(array[j]);
        }
        this.desiredPosition = array[i - 1];
        return this.desiredPosition;
    }

    public int getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }

    public void printSequence(int i) {
        this.desiredPosition = i;
        int[] array = new int[i];
        array[0] = firstValue;
        array[1] = secondValue;
        int fatherStepsBack;
        int motherStepsBack;
        System.out.println(array[0] + "\n" + array[1]);
        for (int j = currentPosition; j < desiredPosition; j++) {
            fatherStepsBack = array[j - 2];
            motherStepsBack = array[j - 1];
            array[j] = array[j - fatherStepsBack] + array[j - motherStepsBack];
            System.out.println(array[j]);
        }
    }
}
