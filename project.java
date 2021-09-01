import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
 
class Cab
 {  int fare , d; // d= distance travelled by passanger
    
    public Cab() //public becauase we can create class from anywhere, we can call it in another class
    { fare = 30;
    }
    public Cab(int amt) //parametrized constructor
    { fare = amt;
    } 
    void showFare()
    { System.out.print("Total Fare : " + fare );
    }
 }
 class RideCab
 { public static void main(String[] args) 
    {   int cd; //distance of cab from user
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter the distance of cab from user : ");
        cd=sc.nextInt();
        if(cd>5)
         {Cab ob = new Cab(30 + 10*(cd-5));
          System.out.print("\nEnter the distance travelled by passanger : ");
          ob.d=sc.nextInt();
          ob.fare = ob.fare + 10* ob.d;
          //ob.fare += 10* ob.d;
          ob.showFare();
         }
        else
         {
          Cab ob = new Cab();
          System.out.print("Enter the distance travelled : ");
          ob.d=sc.nextInt();
          ob.fare = ob.fare + 10* ob.d;
          //ob.fare += 10* ob.d;
          ob.showFare();
         } 
    }
}
/*
OUTPUT :

PS C:\Users\ASUS\Desktop\Java - LetsUpgrade> javac project.java
PS C:\Users\ASUS\Desktop\Java - LetsUpgrade> java RideCab

Enter the distance of cab from user : 3
Enter the distance travelled : 34
Total Fare : 370

*/
