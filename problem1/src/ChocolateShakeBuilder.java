public class ChocolateShakeBuilder implements Builder {
    Shake myShake = new Shake();
    @Override
    public void SetName() {
        myShake.setShakeName("Chocolate Shake");
    }

    @Override
    public void AddElements() {
        myShake.elements.add("Chocolate Syrup");
        myShake.elements.add("Chocolate IceCream");
        myShake.elements.add("Milk");
        myShake.elements.add("Sugar");
    }

    @Override
    public void SetBasePrice() {
        myShake.setBasePrice(230);
    }

    @Override
    public Shake getShake() {
        return myShake;
    }

    @Override
    public void SetOrderPrice() {
        myShake.setOrderPrice(230);
    }
}
