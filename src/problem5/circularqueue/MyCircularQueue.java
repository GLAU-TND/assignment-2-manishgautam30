/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;
import problem5.node.Node;
import problem5.student.Student

//to implement circular queue
public class MyCircularQueue {
    Node front;
    Node rear;
    int count;

    public MyCircularQueue(){
        front = null;
        rear = null;
        count = 0;
    }



      public void enqueue(int rollNumber,int backLogCounter,int appearingCounter){
        Student student = new Student(rollNumber,backLogCounter,appearingCounter);
        Node node = new Node();
        node.setStudent(student);

        if(front==null){
            front = node;
        }
        else{
            rear.setNext(node);
        }

        rear = node;
        rear.setNext(front);
        count++;
    }
