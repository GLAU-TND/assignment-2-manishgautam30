/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class

import problem1.mybst.MyBinarySearchTree
import problem1.node.TreeNode;

public class MyMain {
  public static void main(String[] args) {
        MyBinarySearchTree bst=new MyBinarySearchTree();
        bst.insert(100);
        bst.insert(50);
        bst.insert(150);
        bst.insert(20);
        bst.insert(250);
        bst.insert(60);
        bst.insert(210);
        bst.insert(180);
        bst.insert(360);

        bst.traversepreOrder(bst.getRoot());
        System.out.println();
        
        bst.traversepostOrder(bst.getRoot());
    }
}

/* 
a.TRUE :  The element is 100 that comes first in preorder transversal and last in postorder transversal.
b.FALSE : The element in middle in preorder is 150 and in postorder is 210, hence is not same.
*/
