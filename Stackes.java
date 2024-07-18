import java.util.Iterator;
import java.util.Stack;

public class Stackes
{
    public static void main(String args[])
    {
        Stack<String> stack= new Stack<>();
        stack.push("Ravi");
        stack.push("Vijay");
        stack.push("Raju");
        stack.push("Ajay");
        stack.pop();
        Iterator<String> itr= stack.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
