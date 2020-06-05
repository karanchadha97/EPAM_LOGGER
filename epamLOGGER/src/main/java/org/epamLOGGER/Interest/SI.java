package org.epamLOGGER.Interest;


public class SI extends Interest{
    public SI(int p, int r, int t) {
        super(p, r, t);
    }
    public double calcSI()
    {
        double retVal=p*r*t;
        return (retVal/100.0);
    }
}