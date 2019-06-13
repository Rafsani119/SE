import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,c;
        ArrayList<Shake> Cart = new ArrayList<>();
        ShakeShack shack = new ShakeShack();
        Builder bldr;
        Shake s = null;
        String ch;
        while(true)
        {
            System.out.println("Press 'O' to order a Shake, 'E' To Exit, 'P' to Print Cart");
            ch = sc.nextLine();
            if(ch.equalsIgnoreCase("O"))
            {
                System.out.println("What Shake Do You Want?" +
                        "1. Chocolate  2.Vanilla  3. Zero Shake   4. Strawberry  5. Coffee");
                 c = sc.nextInt();
                if(c == 1)
                {
                    bldr = new ChocolateShakeBuilder();
                    s = shack.ProduceShake(bldr);
                }
                if(c == 2)
                {
                    bldr = new VanillaShakeBuilder();
                    s = shack.ProduceShake(bldr);
                }
                if(c == 3)
                {
                    bldr = new ZeroShakeBuilder();
                    s = shack.ProduceShake(bldr);
                }
                if(c == 4)
                {
                    bldr = new StrawberryShakeBuilder();
                    s = shack.ProduceShake(bldr);
                }
                if (c == 5)
                {
                    bldr = new CoffeShakeBuilder();
                    s = shack.ProduceShake(bldr);
                }

                String str;
                System.out.println("Do You want lactose Free shake? (Extra 60 Taka) \nif Yes press y else press n ");
                str = sc.nextLine();
                str = sc.nextLine();
                if(str.equalsIgnoreCase("y"))
                {
                    s.MakeLactoseFree();
                }
                else if(str.equalsIgnoreCase("n"))
                {
                    System.out.println("Shake will have Milk");
                }
                System.out.println("Do You want Candy (50taka) Or Cookie (40 Taka)");
                System.out.println("1. Candy 2. Cookie 3.Nothing");
                int t = sc.nextInt();
                if(t == 1)
                {
                    s.AddCandy();
                }
                else if(t == 2)
                {
                    s.AddCookie();
                }


                System.out.println("Do you wish to place this order? press 'E' to place order if You want to edit the current order press any button other than 'E'");
                String x = sc.nextLine();
                x = sc.nextLine();
                System.out.println(x);
                if(x.equalsIgnoreCase("E"))
                {
                    Cart.add(s);
                }

                else {
                    int y = 0;
                    while (true) {
                        System.out.println("1. Remove Candy 2.Remove Cookie 3. Use milk " +
                                "4. Add Candy 5.Add Cookie   6.Make Lactose Free" +
                                "7. finish editing and place order");

                        y = sc.nextInt();
                        if (y == 1) {
                           s.RemoveCandy();
                        }
                        else if (y == 2) {
                            s.RemoveCookie();
                        }
                        else if (y == 3) {
                            s.UseMilk();
                        }
                        else if(y==4){
                            s.AddCandy();
                        }
                        else if(y == 5)
                        {
                            s.AddCookie();
                        }
                        else if(y == 6)
                        {
                            s.MakeLactoseFree();
                        }
                        else if (y == 7)
                        {
                            Cart.add(s);
                            System.out.println("Shake added to cart");
                            break;
                        }
                    }
                }




            }

            else if(ch.equalsIgnoreCase("E"))
            {
                double price = 0;
                for( i = 0 ;i<Cart.size(); i++)
                {
                    System.out.println("Item -----" + (i+1) + "-----");
                    Cart.get(i).ShowItems();
                    price = price + Cart.get(i).getOrderPrice();
                }
                System.out.println("--------------------------------------------");
                System.out.println("Total Price = " + price);
                break;
            }
            else if(ch.equalsIgnoreCase("P"))
            {
                double price = 0;
                for( i = 0 ;i<Cart.size(); i++)
                {
                    System.out.println("Item -----" + (i+1) + "-----");
                    Cart.get(i).ShowItems();
                    price = price + Cart.get(i).getOrderPrice();
                }
                System.out.println("--------------------------------------------");
                System.out.println("Total Price = " + price);
            }
        }




    }
}
