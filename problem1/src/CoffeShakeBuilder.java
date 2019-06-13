public class CoffeShakeBuilder implements Builder {
    Shake myShake = new Shake();
    @Override
    public void SetName() {
        myShake.setShakeName("Coffee Shake");
    }

    @Override
    public void AddElements() {
        myShake.elements.add("Coffee");
        myShake.elements.add("Jello");
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
