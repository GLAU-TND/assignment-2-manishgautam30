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
    public int getRollNumber(){
     return rollNumber;
    }
    
    public String getName(){
     return Name;
    }
    
    public int getBackLogCounter(){
     return backLogCounter;
    }
    
    public int getAppearingCounter(){
     return appearingCounter;
    }

    
    public void setRollNumber(int rollNumber){
     this.rollNumber=rollNumber;
    }
    
    public void setName(String name){
     Name=name;
    }

    public void setBackLogCounter(int backLogCounter){
     this.backLogCounter=backLogCounter;
    }
    public void setAppearingCounter(int appearingCounter){
     this.appearingCounter=appearingCounter;
    }
    public String toString(){ 
    return "Student rollnumber- "+rollNumber+",name- "+Name+",backlogs- "+backLogCounter+",appearing- "+appearingCounter;
}
