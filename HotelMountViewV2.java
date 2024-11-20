import java.util.Scanner;
public class HotelMountViewV2
{
    public static void main(String args[])
    {
        String customerName;
        char membershipCode;
        int noOfRooms;
        char typeOfRooms;
        int noOfDays;
        int traiffPerDay = 0;
        int discountNormal = 0;
        int discountDeluxe = 0;
        int discountSupDeluxe = 0;
        int billAmount = 0;
        int discountAmount = 0;
        int payableAmount = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Customer Name: ");
        customerName = sc.nextLine();
        System.out.println("Membership Code: ");
        membershipCode = sc.next().charAt(0);
        System.out.println("Enter Number of Rooms: ");
        noOfRooms = sc.nextInt();
        System.out.println("Enter Number of Days: ");
        noOfDays = sc.nextInt();
        System.out.println("Enter Type of Rooms ");
        typeOfRooms = sc.next().charAt(0);
        System.out.println();
        System.out.println("***************************************");
        System.out.println("\tHotel Skibidi");
        System.out.println("\tOHIO (OHIO)");
        System.out.println("***************************************");
        
        switch(membershipCode)
        {
            case 'N':
                System.out.println("_______________________________________");
                System.out.println("Dear " + customerName + " , you don't own any membership.");
                discountNormal = 0;
                discountDeluxe = 0;
                discountSupDeluxe = 0;
                break;
                
            case 'G':
                System.out.println("_______________________________________");
                System.out.println("Dear " + customerName + " , you own Gold Membership");
                System.out.println("Gold membership Seasonal Discount rates: ");
                System.out.println("Normal Room @2% * Deluxe Room @5% * Super Deluxe @10% ");
                System.out.println("");
                discountNormal = 2;
                discountDeluxe = 5;
                discountSupDeluxe = 10;
                break;
            
            case 'D':
                System.out.println("_______________________________________");
                System.out.println("Dear " + customerName + " , you own Diamond Membership");
                System.out.println("Diamond membership Seasonal Discount rates: ");
                System.out.println("Normal Room @10% * Deluxe Room @15% * Super Deluxe @20% ");
                System.out.println("");
                discountNormal = 10;
                discountDeluxe = 15;
                discountSupDeluxe = 20;
                break;
                
            case 'P':
                System.out.println("_______________________________________");
                System.out.println("Dear " + customerName + " , you own Platinum Membership");
                System.out.println("Platinum membership Seasonal Discount rates: ");
                System.out.println("Normal Romm @20% * Deluxe Room @25% * Super Deluxe @30% ");
                System.out.println("");
                discountNormal = 20;
                discountDeluxe = 25;
                discountSupDeluxe = 30;
                break;
                
            default:
                System.out.println("Wrong Membership Type");
                System.out.println("Please enter correct membership code N, G, D or P");
                System.exit(0); 
        }
        
        if (typeOfRooms == 'D')
        {
            System.out.println("You have choosen Deluxe Rooms. ");
            traiffPerDay = 2500;
            billAmount = traiffPerDay * noOfRooms * noOfDays;
            discountAmount = billAmount * discountDeluxe / 100;
            payableAmount = billAmount - discountAmount;
        }
        else if (typeOfRooms == 'S')
        {
            System.out.println("You have choosen Super Deluxe Rooms. ");
            traiffPerDay = 4200;
            billAmount = traiffPerDay * noOfRooms * noOfDays;
            discountAmount = billAmount * discountSupDeluxe / 100;
            payableAmount = billAmount - discountAmount;
        }  
        else if (typeOfRooms == 'N')
        {
            System.out.println("You have choosen Normal Rooms. ");
            traiffPerDay = 1500;
            billAmount = traiffPerDay * noOfRooms * noOfDays;
            discountAmount = billAmount * discountNormal / 100;
            payableAmount = billAmount - discountAmount;
        }
        else
        {
            System.out.println("Wrong Room Type");
            System.out.println("Please enter correct room code 'N' or 'D' or 'S'");
            System.exit(0);
        }
        System.out.println("***************************************");
        System.out.println("\tTraiff Details");
        System.out.println("***************************************");
        System.out.println("Traiff Per Day: " + traiffPerDay);
        System.out.println("Number of Rooms: " + noOfRooms);
        System.out.println("Number of Days: " + noOfDays);
        System.out.println("_______________________________________");
        System.out.println("Bill Amount: Rs." + billAmount);
        System.out.println("Seasonal Discount: Rs." + discountAmount);
        System.out.println("Net Payable Amount: Rs." + payableAmount);
        System.out.println("_______________________________________");
    }
}