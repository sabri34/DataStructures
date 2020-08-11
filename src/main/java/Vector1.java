import java.util.Vector;
public class Vector1 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Sinop");
        v.add("Rize");
        v.add("Zonguldak");
        v.add("Trabzon");
        v.add("Bolu");
        v.add("Artvin");
        v.add(2, "Samsun");
        System.out.println("Vektörün uzunluğu: " + v.size());
        for (int i = 0; i < v.size(); i++) {
            System.out.println("Vektör ögesi " + +i + ":" + v.get(i));
        }
    }
}
