  package Simplilearn.com;
  import java.util.Scanner;
  public class SearchStringEnteredByUser {

  	public static void main(String[] args) {
       String Arr[]= {"abhijit", "viraj","dhiraj"};
       String input; 
       boolean flag=true;
       @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
       System.out.println("Please Enter Name");
       input=sc.nextLine();
       for(int i=0;i<Arr.length;i++) {
      	 if(Arr[i].equals(input)) {
      		 System.out.println("Present in array");
      		 flag=false;
      	 }
      	}
       if (flag) {
      	 System.out.println("Not Present in array");
      	 }
       }
  	}