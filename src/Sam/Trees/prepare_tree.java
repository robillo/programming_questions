package Sam.Trees;
import java.util.*;
public class prepare_tree {
    public static binary_node prepare(){
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        if(data!=-1){
            binary_node node = new binary_node(data);
            node.left=prepare();
            node.right=prepare();
            return node;
        }
        return null;
    }
}
