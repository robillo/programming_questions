package robillo.mauryasameer.trees_java;

 public class PrintTree {
   static void print(BinaryNode<Integer> node){
        if(node==null){
            return;
        }
        System.out.println(node.data);
        print(node.left);
        print(node.right);
    }

}
