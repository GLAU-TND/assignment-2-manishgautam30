/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties

public class Student {

  private int rollNumber;
  private String Name;
  private int backLogCounter;
  private int appearingCounter;
  
  
    public Student(int rollNumber,String name,int backLogCounter,int appearingCounter){
    this.rollNumber=rollNumber;
    Name=name;
    this.backLogCounter=backLogCounter;
    this.appearingCounter=appearingCounter;
    }
    public int getrollNumber(){
     return rollNumber;
    }
    
    public String getName(){
     return Name;
    }
    
    public int getbackLogCounter(){
     return backLogCounter;
    }
    
    public int getappearingCounter(){
     return appearingCounter;
    }

    
    public void setrollNumber(int rollNumber){
     this.rollNumber=rollNumber;
    }
    
    public void setName(String name){
     Name=name;
    }

    public void setbackLogCounter(int backLogCounter){
     this.backLogCounter=backLogCounter;
    }
    public void setappearingCounter(int appearingCounter){
     this.appearingCounter=appearingCounter;
    }
}
