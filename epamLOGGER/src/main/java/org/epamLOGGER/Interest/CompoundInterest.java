package org.epamLOGGER.Interest;

public class CompoundInterest extends Interest{
    public CompoundInterest(int p, int r, int t) {
        super(p, r, t);
    }
    public double calculate(){
        return p*Math.pow((1+r/100.0),t);
    }
}