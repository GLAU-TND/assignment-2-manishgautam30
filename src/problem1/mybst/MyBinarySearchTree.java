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
}
