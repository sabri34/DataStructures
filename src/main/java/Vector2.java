import  java.util.Vector;
public class Vector2 {
    public static void main (String[] args){
        Vector v =new Vector();
        v.add("Java");
        v.add("Programlama");
        v.add("Dili");
        System.out.println("ilk vektör:" + v);
        v.remove(1);
        System.out.println("ikinci vektör:" + v);
        v.clear();
        System.out.println("son vektör:" + v);

    }
}
