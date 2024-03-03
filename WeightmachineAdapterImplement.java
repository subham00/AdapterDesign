public class WeightmachineAdapterImplement implements WrightmachineAdapter{
    Weightmachine wm;
    public WeightmachineAdapterImplement(Weightmachine wm){
        this.wm = wm;
    }
    public int getweightinkg(){
        return wm.getweightinpound() * 12; // convert to kg
    }
}
