import java.util.*;
public class Stack2 {
    public static void main(String[] args){
        Stack st = new Stack();
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);
        st.push(55);
        st.push(66);
        st.push(77);
        st.push(88);
        st.push(99);
        st.push(100);
        System.out.println(st);
        if(st.contains(33))
            System.out.println("Aranan öğe bulundu...");
        System.out.println("capacity " + st.capacity());
        System.out.println(st.search(55));
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.add(4,45);
        System.out.println(st.indexOf(22));
        st.add(2,27);
        st.add(7,34);
        st.add(5,72);
        st.add(3,41);
        st.add(9,7);
        st.add(1,40);
        st.add(0,2);
        st.add(3,1);
        System.out.println(st);
    }
}
