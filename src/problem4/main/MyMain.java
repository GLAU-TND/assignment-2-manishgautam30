/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
// executable class

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

public class MyMain {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree bst = new MyBinarySearchTree();
        MyQueue que = new MyQueue();
        TreeNode root = new TreeNode(10);

        bst.insert(root, 50);
        bst.insert(root, 205);
        bst.insert(root, 150);
        bst.insert(root, 190);
        bst.insert(root, 97);
        bst.insert(root, 62);
        bst.insert(root, 300);
        bst.insert(root, 135);
        bst.insert(root, 90);
        bst.insert(root, 45);
        bst.insert(root, 62);

        que.preOrder(root);
        que.display(que);

        System.out.print("Enter to find preorder Successor : ");
        que.printsuccessor(sc.nextInt());

    }

}
