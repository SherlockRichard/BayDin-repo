import javax.swing.*;
import java.awt.*;
public class Star{
public static void main(String[]args){
  String s;
  int row=0;
s = JOptionPane.showInputDialog("How many rows?");
row =Integer.parseInt(s);

for(int i=1;i<=row;i++){ 

 for(int j=1;j<=i;j++){ 
System.out.print("* "); 

}
System.out.println("");
}
}
}

 

