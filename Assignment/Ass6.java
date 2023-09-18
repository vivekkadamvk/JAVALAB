// Assignment  6 == Concept of Multithreading
import java.lang.*;
class College extends Thread{
    char Sanjivani[];
    public void run(){
       for(int i=0;i<5;i++){
            System.out.println("Sanjivani");
        } 
    }
}
class Computer extends Thread{
    char Computer[];
    public void run(){
        for(int i=0;i<5;i++){
        System.out.println("Computer");
    
        }
    }
}
class SyBtech extends Thread{
    int SYBtech[];
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("SYBtech");
        }
    }
}
public class Ass6 {
    public static void main(String args[]){
        College t1=new College();
        Computer t2=new Computer();
        SyBtech t3=new SyBtech();
        t1.start();
        t2.start();
        t3.start();
    }
}