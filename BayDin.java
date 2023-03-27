import javax.swing.*;
import java.awt.*;
public class BayDin{
public static void main(String[]args){
 String s;
 int d,m,y;
 int mmYear; 
 int remainder;
 String Day="";
 
System.out.println("Please Choice mmYear");
s = JOptionPane.showInputDialog("Your Birthday between 1m and 4m or"+" \n 4m and less than 13days  Y-639"+"\nif 4m and gearter than 13days  Y-638");
mmYear = Integer.parseInt(s);

remainder=mmYear%7;
System.out.println("The remainder"+"\t"+remainder);
Day= JOptionPane.showInputDialog("Your Day sign eg: Sun or Mon");

if(remainder==0){
 System.out.println("0 3 6 2 5 1 4");
 
if( Day.equals("Sun")){
 System.out.println("Pu Di");
}
else if(Day.equals("Mon")){
System.out.println("Thei");
}
else if(Day.equals("Tue")){
System.out.println("Ma Ya Na");
}
else if(Day.equals("Wed")){
System.out.println("A Di Pa Di");
}
else if(Day.equals("Thurs")){
System.out.println("Yar Za");
}
else if(Day.equals("Fri")){
System.out.println("A Tun");
}
else if(Day.equals("Sat")){
System.out.println("Bin Ga");
}
else{
System.out.println("Sorry Try Agin");
}

}


else if(remainder==1){
 System.out.println("1 4 0 3 6 2 5");

if( Day.equals("Sun")){
 System.out.println("Bin Ga");
}
else if(Day.equals("Mon")){
System.out.println("Pu Di");
}
else if(Day.equals("Tue")){
System.out.println("Thei");
}
else if(Day.equals("Wed")){
System.out.println("Ma Ya Na");
}
else if(Day.equals("Thurs")){
System.out.println("A Tun");
}
else if(Day.equals("Fri")){
System.out.println("Yar Za");
}
else if(Day.equals("Sat")){
System.out.println("A Tun");
}
else{
System.out.println("Sorry Try Agin");
}
}

else if(remainder==2){
System.out.println("2 5 1 4 0 3 6");
if( Day.equals("Sun")){
 System.out.println("A Tun");
}
else if(Day.equals("Mon")){
System.out.println("Bin Ga");
}
else if(Day.equals("Tue")){
System.out.println("Pu Di");
}
else if(Day.equals("Wed")){
System.out.println("Thei");
}
else if(Day.equals("Thurs")){
System.out.println("Ma Ya Na");
}
else if(Day.equals("Fri")){
System.out.println("A Tun");
}
else if(Day.equals("Sat")){
System.out.println("Yar Za");
}
else{
System.out.println("Sorry Try Agin");
}
}
else if(remainder==3){
 System.out.println("3 6 2 5 1 4 0");
if( Day.equals("Sun")){
 System.out.println("Yar Za");
}
else if(Day.equals("Mon")){
System.out.println("A Tun");
}
else if(Day.equals("Tue")){
System.out.println("Bin Ga");
}
else if(Day.equals("Wed")){
System.out.println("Pu Di");
}
else if(Day.equals("Thurs")){
System.out.println("Thei");
}
else if(Day.equals("Fri")){
System.out.println("Ma Ya Na");
}
else if(Day.equals("Sat")){
System.out.println("A Di Pa Di");
}
else{
System.out.println("Sorry Try Agin");

}
}
else if(remainder==4){
System.out.println("4 0 3 6 2 5 1");
if( Day.equals("Sun")){
 System.out.println("A Di Pa Di");
}
else if(Day.equals("Mon")){
System.out.println("Yar Za");
}
else if(Day.equals("Tue")){
System.out.println("A Tun");
}
else if(Day.equals("Wed")){
System.out.println("Bin Ga");
}
else if(Day.equals("Thurs")){
System.out.println("Pu Di");
}
else if(Day.equals("Fri")){
System.out.println("Thei");
}
else if(Day.equals("Sat")){
System.out.println("Ma Ya Na");
}
else{
System.out.println("Sorry Try Agin");

}
}
else if(remainder==5){
 System.out.println("5 1 4 0 3 6 2 ");
if( Day.equals("Sun")){
 System.out.println("Ma Ya Na");
}
else if(Day.equals("Mon")){
System.out.println("A Di Pa Di");
}
else if(Day.equals("Tue")){
System.out.println("Yar Za");
}
else if(Day.equals("Wed")){
System.out.println("A Tun");
}
else if(Day.equals("Thurs")){
System.out.println("Bin Ga");
}
else if(Day.equals("Fri")){
System.out.println("Pu Di");
}
else if(Day.equals("Sat")){
System.out.println("Thei");
}
else{
System.out.println("Sorry Try Agin");
}
}
else if(remainder==6){
System.out.println("6 2 5 1 4 0 3");
if( Day.equals("Sun")){
 System.out.println("Thei");
}
else if(Day.equals("Mon")){
System.out.println("Ma Ya Na");
}
else if(Day.equals("Tue")){
System.out.println("A Di Pa Di");
}
else if(Day.equals("Wed")){
System.out.println("Yar Za");
}
else if(Day.equals("Thurs")){
System.out.println("A Tun");
}
else if(Day.equals("Fri")){
System.out.println("Bin Ga");
}
else if(Day.equals("Sat")){
System.out.println("Pu Di");
}
else{
System.out.println("Sorry Try Agin");
}
}
else{
System.out.println("Your remainder is wrong");
}

}
}

