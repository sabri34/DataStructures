import java.util.*;
public class Vector3 {
    public static void main (String[] args){
        Vector vektör = new Vector();
        vektör.add("Ali");
        vektör.add("Veli");
        vektör.add("Mustafa");
        vektör.add("Mehmet");
        vektör.add("Berat");
        vektör.add("Burak");
        vektör.add("Murat");
        vektör.add("Selim");
        vektör.add("Salih");
        vektör.add("Tarık");
        for (int i=0 ; i<vektör.size() ; i++){
            System.out.println("İsimler: " + vektör.get(i));
        }
        System.out.println("vektörün ilk değeri: " + vektör.firstElement());
        System.out.println("vektörün son değeri: " + vektör.lastElement());
        vektör.remove(1);
        System.out.println("İsimler: " + vektör);
        vektör.removeElementAt(2);
        vektör.removeElement("Selim");
        System.out.println("İsimler: " + vektör);
        System.out.println("vektörün boyu: " +  vektör.size());

        Enumeration e = vektör.elements();
        System.out.println("İsimler: " + vektör);
        while(e.hasMoreElements()){
            System.out.println("öğe: " + e.nextElement());
        }
    }
}