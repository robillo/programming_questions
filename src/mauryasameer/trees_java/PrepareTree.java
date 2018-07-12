package mauryasameer.trees_java;
import java.util.*;
public class PrepareTree {
    public static BinaryNode<Integer> prepare(){
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        if(data!=-1){
            BinaryNode<Integer> node = new BinaryNode<>(data);
            node.left=prepare();
            node.right=prepare();
            return node;
        }
        return null;
    }
}
