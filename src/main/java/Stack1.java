import com.sun.deploy.security.SelectableSecurityManager;
import sun.security.mscapi.CPublicKey;
import java.util.Stack;
public class Stack1 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("İstanbul");
        stack.push("Ankara");
        stack.push("İzmir");
        stack.push("Bursa");
        stack.push("Antalya");
        System.out.println(stack);
        System.out.println("stack boş mu? " + stack.empty());
        System.out.println(stack.contains("Adana"));
        System.out.println(stack.search("İstanbul"));
        System.out.println(stack.search("Ankara"));
        System.out.println("Stack'ta Diyarbakır var mı? :" + stack.search("Diyarbakır"));
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.contains("Antalya"));
        System.out.println(stack);
    }
}