package src;

public class Metoda3{


    public static void main(String[] args) {
        Autobiografia("Fadil","Zeneli",42,1.84,"Vranjevc","Sportist");
        shumaNumave();
        zbritja();

    }

    public static void Autobiografia(String emri, String mbiemri, int mosha, double gjatesia, String venbanimi, String profesioni){
        System.out.println("emri im esht :"+emri);
        System.out.println("mbiemri im esht :"+mbiemri);
        System.out.println("mosha ime esht :"+mosha);
        System.out.println("gjatesia ime esht :"+gjatesia);
        System.out.println("venbanimi im esht :"+venbanimi);
        System.out.println("profesioni im esht :"+profesioni);
    }

    public static void shumaNumave(){
        System.out.println(4+5);
    }

    public static void zbritja(){
        System.out.println(3-4);
    }

    public static void pjestimi(){
        System.out.println(6/4);
    }

}






