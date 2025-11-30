package p2;

public class P2_main {
    public static void main(String[] args) {

        System.out.println(pairwisedifferent(new int[]{5,7,3,2}));

    }
    public static boolean pairwisedifferent(int[] somenumbers) {
        for(int i=1;i<somenumbers.length-1;i++){
            for(int j=i+1;j<somenumbers.length;j++){
                if(somenumbers[i]==somenumbers[j]){
                    return false;
                }
            }
        }
        return true;
    }

}
