/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree

import problem1.node.TreeNode;
import java.util.*;

public class MyBinarySearchTree {

  TreeNode root;

  public TreeNode getRoot(){
     return root;
  }

   public void insert(int data) {
        TreeNode node= new TreeNode(data);
        if(root==null){
            root=node;
        }
        else{
            TreeNode temp=root;
            TreeNode parent=null;
            while(temp!=null){
                parent=temp;
                if(node.getData() <= temp.getData()){
                    temp=temp.getLeft();

                }else{
                    temp=temp.getRight();
                }
            }
            if(node.getData()<=parent.getData()){
                parent.setLeft(node);

            }else{
                parent.setRight(node);
            }
        }
    }


     public void traverseinOrder(TreeNode node){
        if(node!=null){
            traverseinOrder(node.getLeft());
            System.out.print(node.getData()+", ");
            traverseinOrder(node.getRight());
        }
    }

     public void traversepreOrder(TreeNode node){
        if(node!=null){
            traversepreOrder(node.getData()+", ");
            System.out.print(node.getLeft());
            traversepreOrder(node.getRight());
        }
    }

     public void traversepostOrder(TreeNode node){
        if(node!=null){
            traversepostOrder(node.getLeft());
            traversepostOrder(node.getRight());
            System.out.print(node.getData()+", ");
        }
    }

     public void countnodes(TreeNode root) {
        
        if (root == null)
            return;

       
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        int count = 0; 
        while (queue != null) {
            TreeNode temp = queue.poll();
            if (temp == null) {
                break;
            }

            if (temp.getLeft() == null)
                count++;

            
            if (temp.getLeft() != null)
                queue.add(temp.getLeft());

            
            if (temp.getRight() != null)
                queue.add(temp.getRight());
        }
        System.out.println("Nodes without left child - "+count);
    }
         
       

       public void printLeftTree(TreeNode root) {
        if (root == null)
         system.out.println ("empty tree");
        list.add(root);
        list.add(null);

        while (list.size() > 0) {
            TreeNode temp = list.peek();

            if (temp != null) {
                System.out.print(temp.getData() + " ");
                while (list.peek() != null) {
                    if (temp.getLeft() != null){
                        list.add(temp.getLeft());
                       }
                    if (temp.getRight() != null){
                       list.add(temp.getRight());
                      }

                   
                    list.remove();

                    temp = list.peek();
                }
                list.add(null);
            }
            list.remove();
        }
    }


    public void leftView(TreeNode root) {
     static Queue<TreeNode> list = new LinkedList<TreeNode>;  
        printLeftTree(root);
    }

}
