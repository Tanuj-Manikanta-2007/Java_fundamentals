package Trees.Binary_Tree;
import java.util.*;
public class binary_search_tree {
    public static void main(String[] args){
        bst tree = new bst();

        // Must update the root using the return value of insertion
        tree.root = tree.insertion(tree.root, 50);
        tree.insertion(tree.root, 30);
        tree.insertion(tree.root, 20);
        tree.insertion(tree.root, 40);
        tree.insertion(tree.root, 70);
        tree.insertion(tree.root, 60);
        tree.insertion(tree.root, 80);

        System.out.println("Inorder traversal:");
        tree.inorder(tree.root);
        System.out.println("\n\nPreorder traversal:");
        tree.preorder(tree.root);
        System.out.println("\n\nPostorder traversal:");
        tree.postorder(tree.root);
        System.out.println("\n\nLevelorder traversal:");
        tree.levelorder();
        System.out.println("\n LevelOrder ziz zag traversal ");
        tree.ziz_zag_level_order();

    }
}
class bst_Node{
    int data;
    bst_Node left;
    bst_Node right;
    bst_Node(int data){
        this.data = data;
        left = right = null;
    }
}
class bst{
    bst_Node root;
    bst(){
        root = null;
    }
    bst_Node insertion(bst_Node node,int data){
        if(node == null){

            return new bst_Node(data);
        }
        if(node.data > data){
            node.left = insertion(node.left,data);
        }
        else{
            node.right = insertion(node.right,data);
        }
        return node;
    }
    void inorder(bst_Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    void preorder(bst_Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);

        preorder(node.right);
    }
    void postorder(bst_Node node){
        if(node == null){
            return;
        }

        postorder(node.left);

        postorder(node.right);
        System.out.print(node.data + " ");
    }
    void levelorder(){
        if(root == null) {
            return;
        }
        Queue<bst_Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            bst_Node curr = q.remove();
            System.out.print(curr.data + "  ");
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
    }
    void ziz_zag_level_order() {
        if (root == null) return;
        Deque<bst_Node> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        while (!q.isEmpty()) {
            int levelsize = q.size();
            for (int i = 0; i < levelsize; i++) {
                if (flag) {

                    bst_Node curr = q.pollFirst();//q.poll()
                    System.out.print(curr.data + "   ");
                    if (curr.left != null) {
                        q.addLast(curr.left);// q.add()
                    }
                    if (curr.right != null) {
                        q.addLast(curr.right);
                    }

                } else {

                    bst_Node curr = q.pollLast();
                    System.out.print(curr.data + "   ");
                    if (curr.left != null) q.addFirst(curr.left);
                    if (curr.right != null) q.addFirst(curr.right);
                }

            }
            flag = !flag;
        }
    }
}
