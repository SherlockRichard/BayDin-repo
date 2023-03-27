import javax.swing.*;
import java.awt.*;
public class LineraSearch{
public static int Search(int array[],int number){
for(int i=0;i<array.length;i++){
if(array[i]==number){
 return i;
}
}
return -1;
}
public static void main(String[]args){
  String s; 
  int n=0;
 int searchNumber=0;
s = JOptionPane.showInputDialog("Enter Array Size");
n = Integer.parseInt(s);
System.out.println("Array Size="+ n);
int []arr=new int [n] ;
for(int i=0;i<n;i++){
s = JOptionPane.showInputDialog("Enter number");
arr[i]=Integer.parseInt(s);
System.out.println("arr[" +i+ "]" + "=" + arr[i]);
}
s= JOptionPane.showInputDialog("Enter Search number");
searchNumber=Integer.parseInt(s);
int index=Search(arr,searchNumber);
if(index==-1){
System.out.println("Array not found");
}
else{
System.out.println("Array fount at index"+"["+index+"]");
}
}
}