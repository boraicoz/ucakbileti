import java.util.Scanner;
public class TicketPrice {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int age,distance,choose;
        double kmprice=0.10,amount,discount,discountprice;
        System.out.print("Distance of Travel:");
        distance=in.nextInt();
        System.out.print("Age:");
        age=in.nextInt();
        System.out.print("1-)One Way 2-)Round-Trip:");
        choose=in.nextInt();
        amount=distance*kmprice;
        if(distance>0&&age>0&&(choose==1||choose==2))
        {
            if(age<12)
            discount=0.5;
            else if(age>=12&&age<=24)
            discount=0.1;
            else if (age>65)
            discount=0.3;
            else
            discount=0;
            amount-=amount*discount;

            if(choose==2)
            {
              discount=0.2;
              amount-=amount*discount;
              amount*=2;
            }
            System.out.println("Total Amount:"+amount+"TL");


        }
        else
            System.out.println("You entered incorrect data!");
    }
}
