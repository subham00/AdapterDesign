// Adaptee
public class WeightmachineForBabies implements Weightmachine{
    int weight;
    public WeightmachineForBabies(int weight){
        this.weight = weight;
    }
    public int getweightinpound(){ // specific request
        return weight;
    }
}
