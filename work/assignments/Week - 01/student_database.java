
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author 17-12S18006 Meikristina
 * @author  17-12S18002 Wiranda Siahaan
 */

public class student_database {
   
    /*class-level attributes *
    
   /* program entry point */
    public static void main(String[]_argc){
        System.out.println("Hello, world!");
        // declaring and manipulating primitive variables
int gear = 1;
boolean result = true;
char capitalC = 'C';
byte b = 100;


gear++;
result = !result;
capitalC += 4;
System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);
// 26 in hexadecimal and binary
int hexVal = 0x1a;
int binVal = 0b11010;
System.out.println(hexVal + ", " + binVal);

  // intantiating and manipulating objects
String name = "Wiro Sableng";
Short gearObject = 1;
Boolean resultObj = true;
System.out.println(name + ", " + gearObject + ", " + resultObj);
name = name.toUpperCase();
gearObject++;
resultObj = (result == false) || !resultObj;
System.out.println(name + ", " + gearObject + ", " + resultObj);
  
// array, collections, and loop
int[][] numbers = new int[10][10];
for (int i = 0; i < numbers.length; ++i) {
 for (int j = 0; j < numbers[i].length; ++j) {
 numbers[i][j] = i + j;
 }
}
for (int i = 0; i < numbers.length; ++i) {
 for (int j = 0; j < numbers[i].length; ++j) {
 System.out.print(numbers[i][j] + " ");
 }
System.out.println();
}


    }
    
    
}
