/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;
import problem5.student.Student;

public class MyMain {
  public static void main(Strings[] args){
     MyPriorityQueue myPriorityQueue = new MyPriorityQueue();
        myPriorityQueue.enqueue(new Node(new Student(15, "wdad")));
        myPriorityQueue.enqueue(new Node(new Student(500, "wdad")));
        myPriorityQueue.enqueue(new Node(new Student(50, "wdad")));
        myPriorityQueue.enqueue(new Node(new Student(11, "wdad")));
        myPriorityQueue.enqueue(new Node(new Student(55, "wdad")));
        myPriorityQueue.printQueue();
    }
}
