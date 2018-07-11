package Sam.Trees;

public class print_tree {
   static void print(prepare_tree node){
        if(node==null){
            return;
        }
        System.out.println(node.data);
        print(node.left);
        print(node.right);
    }

}
