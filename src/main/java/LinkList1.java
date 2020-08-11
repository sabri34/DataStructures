import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.synth.SynthToolTipUI;
import java.awt.peer.SystemTrayPeer;
import java.util.LinkedList;
public class LinkList1 {
    public static void main (String [] args){
        LinkedList list1 = new LinkedList();
        list1.add("Portakal");
        list1.add("Limon");
        list1.add("Mandalina");
        list1.add("Turunç");
        list1.add("Bergamot");
        System.out.println("list =" + list1);

        list1.add(3,"Greyfurt");
        System.out.println("list = " + list1);
        System.out.println("ilk öğe: " + list1.getFirst());
        System.out.println("son öğe: " + list1.getLast());
        System.out.println("öğe sayısı: " + list1.size());

        System.out.println("silinen :" + list1.removeFirst());
        System.out.println("silinen :" + list1.removeLast());
        System.out.println("list :" + list1);
        System.out.println("öğe sayısı :" + list1.size());
        list1.add(2,"Muz");
        System.out.println("list :" + list1);

        list1.clear();
        System.out.println("list:" + list1);
    }
}