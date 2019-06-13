public class StrawberryShakeBuilder implements Builder {
    Shake myShake = new Shake();
    @Override
    public void SetName() {
        myShake.setShakeName("Strawberry Shake");
    }

    @Override
    public void AddElements() {
        myShake.elements.add("Strawberry Syrup");
        myShake.elements.add("Strawberry IceCream");
        myShake.elements.add("Milk");
        myShake.elements.add("Sugar");
    }

    @Override
    public void SetBasePrice() {
        myShake.setBasePrice(200);
    }

    @Override
    public Shake getShake() {
        return myShake;
    }

    @Override
    public void SetOrderPrice() {
        myShake.setOrderPrice(200);
    }
}
