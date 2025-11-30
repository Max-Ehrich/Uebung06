package p3;

public class P3_main {
    public static void main(String[] args) {

    }
    public static int methode(int[] a){

        if (a.length<2){
            return -1;
        }
        //Beträge bestimmen
        int[] AbsA =new int[a.length];
        for (int i=0;i<AbsA.length;i++){
            AbsA[i]=Math.abs(a[i]);
        }
        //betragsmäßig 2. größtes maximum bestimmen
        int max= AbsA[0];
        int max2= AbsA[0];
        for (int i=1;i<AbsA.length;i++){
            if (AbsA[i]>max){
                max2=max;
                max=AbsA[i];
            }else if (AbsA[i]<max && AbsA[i]>max2){
                max2=AbsA[i];
            }
        }
        // falls alle elemente betragsmäßig gleichgroß sind gibt es kein 2. maximum
        if (max2==max){
            return -1;
        }
        //falls der wert positiv ist
        for (int i=0;i<a.length;i++){
            if (a[i]==max2){
                return max2;
            }
        }
        return -max2;


    }
}


