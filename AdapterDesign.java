public class AdapterDesign {
    public static void main(String [] aStrings){
        Weightmachine wm = new WeightmachineForBabies(10);

        WeightmachineAdapterImplement wml = new WeightmachineAdapterImplement(wm);
        System.out.println(wml.getweightinkg());
    }
}
