package ASD;
public class Game {
    public static void main(String[] args) {
        int [] weights={3,4,5,8,88};
        int maxWeight=13;
        long count=2L<<weights.length;
        long maxState=0;
        for (long i = 0; i < count; i++) {
            int weight=stateWeight(i,weights);
            if (weight<=maxWeight){
                maxState=i;
            }
        }
        long pover=1;
        for (int i = 0; i < weights.length; i++) {
            if ((pover & maxState)>0){
                System.out.println(weights[i]);
            }
            pover<<=1;
        }

    }
    public static int stateWeight(long state, int [] weights){
        long pover=1;
        int current=0;
        for (int i = 0; i < weights.length; i++) {
            if ((pover & state)!=0){
                current+=weights[i];
            }
            pover<<=1;
        }
        return current;
    }
}
