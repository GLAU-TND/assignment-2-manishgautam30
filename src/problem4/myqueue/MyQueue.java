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

     public Node getTemp(){

      return temp;
     }
     public void setTemp(Node temp){

     this.temp=temp;
     }

          
      public int getSize(MyQueue queue) {

        queue.temp = queue.front;

        while (queue.temp != null) {
            size++;
            queue.temp = queue.temp.getNext();
        }
        queue.temp = queue.front;
        return size;
       }


       public void setSize(int size) {

        this.size = size;
       }

       
      public void enqueue(Node node) {
        if (front == null) {
            front=node;
             rear=node;
             temp=front;

        } 
        else {
           while (temp.getNext() != null) {
           temp = temp.getNext();
          }
            rear = node;
            temp.setNext(node);
            temp = front;
          }
        }

      
    public void display(MyQueue queue) {
        while (queue.temp != null) {
            System.out.print(queue.temp.getNode().getData() + ",");
            queue.temp = queue.temp.getNext();
        }

        System.out.println(" ");
        queue.temp = queue.front;
     }
     

     public void preOrder(TreeNode node) {
        if (node != null) {
        enqueue(new Node(node));
        preOrder(node.getLeft());
        preOrder(node.getRight());
        }
      }
}
