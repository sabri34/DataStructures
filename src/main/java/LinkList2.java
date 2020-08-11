import java.util.LinkedList;
public class LinkList2 {
    public static void main (String [] args){
        LinkedList list2 = new LinkedList();
        list2.addFirst("Londra");
        list2.addFirst("Moskova");
        list2.addFirst("Ankara");
        list2.addFirst("Paris");
        list2.addFirst("Viyana");
        System.out.println("list:" + list2);

        list2.removeLast();
        System.out.println("list:" + list2);
        list2.remove(1);
        System.out.println("list:" + list2);
        list2.removeFirst();
        System.out.println("list:" + list2);

        list2.addFirst("Madrid");
        System.out.println("list:" + list2);
        list2.add(0,"Tokyo");
        System.out.println("list:" + list2);

        System.out.println("ilk öğe:" + list2.getFirst());
        System.out.println("son öğe:" + list2.getLast());

        LinkedList list3 = new LinkedList();
        list3 = list2;
        System.out.println("list3:" + list2.clone());

        System.out.println("var mı? " + list2.contains("Kahire"));
        System.out.println("var mı? " + list3.contains("Tokyo"));

        list3.clear();
        System.out.println("listenin son hali :" + list3);
    }
}