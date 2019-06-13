public class ShakeShack {
    Builder builder;
    Shake ProduceShake(Builder mybuilder)
    {
        builder = mybuilder;
        builder.AddElements();
        builder.SetBasePrice();
        builder.SetName();
        builder.SetOrderPrice();
        return builder.getShake();
    }
}
