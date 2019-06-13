public class ZeroShakeBuilder implements Builder {
    Shake myShake = new Shake();
    @Override
    public void SetName() {
        myShake.setShakeName("Zero Shake");
    }

    @Override
    public void AddElements() {
        myShake.elements.add("Sweetener");
        myShake.elements.add("Vannila Flavour with suger free Jello");
        myShake.elements.add("Milk");
    }

    @Override
    public void SetBasePrice() {
        myShake.setBasePrice(240);
    }

    @Override
    public Shake getShake() {
        return myShake;
    }

    @Override
    public void SetOrderPrice() {
        myShake.setOrderPrice(240);
    }
}
