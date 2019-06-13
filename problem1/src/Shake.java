import java.util.ArrayList;

public class Shake {
    ArrayList<String> elements= new ArrayList<>();
    String ShakeName;
    boolean AlmondMilk;
    boolean Candy;
    boolean Cookie;
    private double BasePrice;
    private double OrderPrice;

    public String getShakeName() {
        return ShakeName;
    }

    public void setShakeName(String shakeName) {
        ShakeName = shakeName;
    }

    public boolean isAlmondMilk() {
        return AlmondMilk;
    }

    void MakeLactoseFree() {
        if (!AlmondMilk) {
            AlmondMilk = true;
            setOrderPrice(getOrderPrice() + 60);
            elements.remove("Milk");
            System.out.println("Made Lactose Free");
        }
        else
            System.out.println("Already Lactose Free");
    }

    void UseMilk() {
        if (AlmondMilk) {
            AlmondMilk = false;
            setOrderPrice(getOrderPrice() - 60);
            elements.add("Milk");
            System.out.println("Milk Added");
        }
        else System.out.println("Already Has Milk");;
    }

    public boolean hasCandy() {
        return Candy;
    }

    public void AddCandy() {
        if (!Candy) {
            Candy = true;
            setOrderPrice(getOrderPrice() + 50);
        }
        else System.out.println("Already has Candy");;
    }
    public void RemoveCandy() {
        if (hasCandy()) {
            Candy = false;
            setOrderPrice(getOrderPrice() - 50);
            System.out.println("Candy removed");
        }
        else System.out.println("Does Not have Candy");
    }

    public boolean isCookie() {
        return Cookie;
    }

    public void AddCookie() {
        if (!Cookie) {
            Cookie = true;
            setOrderPrice(getOrderPrice() + 40);
            System.out.println("Cookie Added");
        }
        else
            System.out.println("Already Has Cookie");;
    }

    public void RemoveCookie()
    {
        if(Cookie) {
            Cookie = false;
            setOrderPrice(getOrderPrice() - 40);
            System.out.println("Cookie Removed");
        }
        else System.out.println("Does not Have Cookie");;
    }

    public double getBasePrice() {
        return BasePrice;
    }

    public void setBasePrice(double basePrice) {
        BasePrice = basePrice;
    }

    public double getOrderPrice() {
        return OrderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        OrderPrice = orderPrice;
    }

    public void ShowItems()
    {
        System.out.println(this.ShakeName);
        for(int i=0; i<elements.size(); i++) {
            System.out.println(i+1 +". "+ elements.get(i));
        }
        if(AlmondMilk)
        {
            System.out.println("Almond milk Lactose free(Extra 60 Taka)");
        }
        if (Candy)
        {
            System.out.println("Candy(Extra 50 taka)");
        }
        if(Cookie)
        {
            System.out.println("Cookies(Extra 40 Taka");
        }
        System.out.println("Shake Price =  " + getOrderPrice());;
    }
}
