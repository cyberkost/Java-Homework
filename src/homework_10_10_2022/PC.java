package homework_10_10_2022;

public class PC {
    private int processor;
    private int memory;
    private int powerSupply;
    private boolean backLight;
    private VideoCard videoCard;
    public PC (int processor, int memory, int powerSupply, boolean backLight){
        this.processor = processor;
        this.memory = memory;
        this.powerSupply = powerSupply;
        this.backLight = backLight;
        this.videoCard = new VideoCard();
    }
    public int getProcessor(){
        return processor;
    }
    public int getMemory(){
        return memory;
    }
    public int getPowerSupply(){
        return powerSupply;
    }
    public boolean setBackLight() {
        return backLight;
    }
    @Override
    public String toString() {
        return "PC{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", powerSupply=" + powerSupply +
                ", backLight=" + backLight +
                ", videoCard=" + videoCard +
                '}';
    }
}
class Main1 {
    public static void main(String[] args) {
        PC newPC = new PC(10, 16, 5, false);
        System.out.println(newPC);
    }
}