/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;
//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue();
        obj.isEmpty();
        obj.enqueue(1,"happy",2,5);
        obj.enqueue(2,"raja",2,6);
        obj.enqueue(3,"lala",1,5);
        obj.enqueue(4,"hero",2,7);
        obj.display();
        obj.size();
        obj.dequeue();
        obj.display();
        obj.size();
        obj.isEmpty();

    }
}
