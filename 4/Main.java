package hw_aisd;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Tree root =
                new Tree(29,
                        new Tree(16,
                                new Tree(13,null, new Tree(15)),new Tree(18)),
                        new Tree(44,
                                new Tree(40,new Tree(37),null),
                                new Tree(49, new Tree(47), new Tree(61))));

        soutWide(root);
    }
    static class Tree{
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        }
    }

    public static void soutWide(Tree root){
        Queue<Tree> tQ = new LinkedList<>();
        tQ.add(root);

        while(!tQ.isEmpty()){
            Tree node = tQ.remove();

            System.out.println(node.value);

            if (node.left != null){
                tQ.add(node.left);
            }

            if (node.right != null){
                tQ.add(node.right);
            }
        }
    }
}
