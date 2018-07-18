package mauryasameer.trees_java;

public class TopThreeElement {
        public static int F,S,T=Integer.MIN_VALUE;
        public static void top(BinaryNode<Integer> node){
        if(node == null){
            return;
        }
        if(node.data>F){

            T=S;
            S=F;
            F=node.data;
        }
        else if(node.data>S){

            T=S;
            S=node.data;
        }
        else if(node.data>T){

            T=node.data;
        }
        top(node.left);
        top(node.right);
            System.out.printf("%d %d %d%n", F, S, T);


    }



}
