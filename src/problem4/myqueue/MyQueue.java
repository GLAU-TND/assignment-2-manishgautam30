/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.node.TreeNode;

public class MyQueue {

    private Node front;
    private Node rear;
    private Node temp;
    private int size;

     public MyQueue(){
     front=null;
     rear=null;
     temp=null;
     size=0;
    }
     
     public Node getFront(){
      return front;
     }
     public void setFront(Node front){
     this.front=front;
     }

      
     public Node getRear(){
      return rear;
     }
     public void setRear(Node rear){
     this.rear=rear;
     }
}
