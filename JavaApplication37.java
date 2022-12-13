
package javaapplication37;

import java.util.Arrays;
import java.util.Scanner;
public class JavaApplication37 {

  
    
    public static void main(String[] args) {
        System.out.println("Q:1");
    int min;
    Scanner b = new Scanner(System.in);
    
    
     System.out.print("Enter the Size of Array: ");
     
       int a=b.nextInt();
     int [] arr = new int [a] ;  
         System.out.println("Enter " +a+ " Numbers: ");
        
        
        for (int i = 0; i < arr.length; i++)   
            arr[i]=b.nextInt();
         min = arr[0]; 
        
        for (int i = 1; i < a; i++) {
            
        
           if(min > arr[i])  
               min = arr[i];  
        }  
        System.out.println("Smallest element present in given array: " + min);  
        
        
        System.out.println("Q:2");
        int k=b.nextInt();
        int n=0-k;
        System.out.println("the opposit number of " +k+" is : "+n);
       
        System.out.println("Q:3_a ");
        System.out.println("enter the number X ");
        int x=b.nextInt();
        
         System.out.println("enter the array size ");
           int t=b.nextInt();
          
     int [] ar = new int [t] ;  
         System.out.println("Enter " +t+ " Numbers: ");
        
        Boolean flag =false;
        for (int i = 0; i < ar.length; i++)   
            ar[i]=b.nextInt();
        
        
        for (int i = 1; i < t; i++) {
            if (x==ar[i])
                flag=true;
            
        }
      
        System.out.println( "the array contains the number x ?  "+flag );
        
        
        System.out.println("Q:3_b");
        System.out.println("enter the size ");
        
        int s = b.nextInt();
 
        String sArr[] = new String[s] ;
        System.out.println("enter the elements");
 
        for (int i = 0; i < s; i++) {
            sArr[i]=b.next();
          
            
        }
     
        
         System.out.println("Array String : " +Arrays.toString(sArr));
         
         
        System.out.println("Q:4");
        System.out.println("enter he number");
   String u=b.next();
     StringBuilder result = new StringBuilder();
        for (int i = 0; i < u.length(); i++) {
        char ch = u.charAt(i);
        if (ch < '5') {
            result.append('0');
        } else {
            result.append('1');
        }
    }
  
        System.out.println("the result is : "+result);
    
        System.out.println("Q:6");
        
        int arrr[]={1,2,3,4,5,6,8};
       dur(arrr);
       
        System.out.println("Q:7");
        
        System.out.println(Many(6.7));
        
         System.out.println("Q:8");
         System.out.println(conn("basharr"));
         
          System.out.println("Q:9");
          
 System.out.println(Call(5.4,8.9));    
 
  System.out.println("Q:11");
  
        System.out.println(Ssum(12));
        
         System.out.println("Q:12");
         
         System.out.println(Trr("ahmad","mohamad"));
         
          System.out.println("Q:13");
          
          int trr[]={11,22,33,44,55,66};
          System.out.println(not(trr));
          
           System.out.println("Q:14");
           
           duble(16,13);
           
           
            System.out.println("Q:15");
            
             System.out.println(Fact(5,6));
             
              System.out.println("Q:16");
              
              System.out.println(yea(17));
    }
           public static void dur(int ar[]){
        int a[]=new int[ar.length];
            for (int i = 0; i < ar.length ; i++) {
                a[i]=2*ar[i];
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+",");
            }
        }
        public static int Many(double a){
        int ax=(int)a/2;
        return ax;
        }
        public static int conn(String a){
            int num=Integer.parseInt(a);
            return num;
        }
        public static String Call(double a,double b){
        double tim=a/(b*2);
        if (tim<18.5)return "Underweight";
        else if (tim<25)return "Normal";
        else if (tim<30)return "Overweight";
        else return "Obese";
        }
        public static int Ssum(int a){
        int x=a*(a+1)/2;
        return x;
        }
        public static String Trr(String a,String b){
        if (a=="red")return "yellow";
       else if (a=="green")return "yellow";
       else if(a=="yellow"&&b=="green")return "red";
       else return "green";
        }
        public static int not(int a[]){
        int x=a[0];
            for (int i = 1; i < a.length; i++) {
                if (x+1!=a[i])return a[i];
                else x++;
            }
            return -1;
        }
     public static void duble(int x,int y){
        int a[]=new int[x];
         for (int i = 0; i <a.length ; i++) {
             a[i]=x*(i+1);
         }
         for (int i = 0; i <a.length ; i++) {
             System.out.print(a[i]+",");
         }
     }
     public static boolean Fact(int x,int y){
        return y%x==0;
     }
     public static int yea(int x){
        if (x%100==0)return x/100;
        return (x/100)+1;
     
        
        }
}