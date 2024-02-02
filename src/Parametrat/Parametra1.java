package src.Parametrat;

public class Parametra1 {

    public static void main(String[] args) {
//        System.out.println(zbritja(3678,2977));
        int[] a ={1,2,23,1,231,23,12,42,534,534,435,643,5,3};
        System.out.println(shumaNumrave(a));
        System.out.println("shuma e numrave esht :"+shumaeeNumrave());
        System.out.println("shuma e numrave esht :"+shumaeeNumrave(5));

    }

    public static int zbritja(int a, int b){
        return a-b;
    }

    public static int shumaNumrave(int[] array){
    
        // kemi me shumen e numrvate tek array
        int shuma =0 ;
        for (int i = 0; i < array.length; i++) {
            shuma=shuma+array[i];
        }
        return shuma;
    }

    public static int shumaeeNumrave(){
        int shuma=0;
        for (int i = 0; i <= 100; i++) {
            shuma=shuma+i;
        }
        return shuma;
    }

    public static int shumaeeNumrave(int a){
        int shuma=0;
        for (int i = 0; i <= 100; i++) {
            shuma=shuma+i;
        }
        return shuma;
    }
}
