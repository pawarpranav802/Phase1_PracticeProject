package Simplilearn.com;

import java.io.*; 
import java.util.*; 
class DemoClass1 
{ 
    public void send(String msg) 
    { 
      System.out.println("Sending\t"  + msg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
        System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + msg + "Sent"); 
    } 
} 
   class DemoClass extends Thread 
{ 
    String msg; 
     Thread t; 
     DemoClass1  sender; 
     DemoClass(String m,  DemoClass1 snd) 
    { 
        msg = m; 
        sender = snd; 
    } 

    public void run() 
    {  
        synchronized(sender) 
        { 
         sender.send(msg); 
        } 
    } 
  } 
 public class SynchDemo
{ 
    public static void main(String args[]) 
    { 
        DemoClass1 snd = new DemoClass1(); 
            DemoClass S1 = 
            new DemoClass( " Hi " , snd ); 
            DemoClass S2 = 
            new DemoClass( " Bye " , snd ); 
            S1.start(); 
            S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
           catch(Exception e) 
        { 
           System.out.println("Interrupted"); 
        } 
    } 
}