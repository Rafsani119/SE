public class VanillaShakeBuilder implements Builder {
    Shake myShake = new Shake();
    @Override
    public void SetName() {
        myShake.setShakeName("Vanilla Shake");
    }

    @Override
    public void AddElements() {
        myShake.elements.add("Vanilla Flavouring");
        myShake.elements.add("Jello");
        myShake.elements.add("Milk");
        myShake.elements.add("Sugar");
    }

    @Override
    public void SetBasePrice() {
        myShake.setBasePrice(190);
    }

    @Override
    public Shake getShake() {
        return myShake;
    }

    @Override
    public void SetOrderPrice() {
        myShake.setOrderPrice(190);
    }
}
