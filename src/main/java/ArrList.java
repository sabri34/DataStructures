import java.util.ArrayList;

public class ArrList {

    public static void main(String[] args){
        ArrayList<String> groups = new ArrayList<String>();
        groups.add("Fenerbahçe");
        groups.add("Galatasaray");
        groups.add("Beşiktaş");
        groups.add("Başakşehir");

        groups.remove("Galatasaray");
        groups.remove(1);
        System.out.println(groups.indexOf("Fenerbahçe"));

        /*System.out.println("0. indeks: " + groups.get(0));
        System.out.println("2. indeks: " + groups.get(2));*/

        System.out.println("Arraylist uzunluk :" + groups.size());

        for (int i=0 ; i<groups.size() ; i++){
            System.out.println("Eleman :" + groups.get(i));
        }
    }
}

