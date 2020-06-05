package org.epamLOGGER.Cost;

public class Cost {
    private int type;
    private double area;

    public Cost(int type, double area) {
        this.type = type;
        this.area = area;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    static int totalCost(int type)
    {
        int retCost=0;
        switch(type)
        {
            case 1:retCost=45000;
                break;
            case 2:retCost=89300;
                break;
            case 3:retCost=5930;
                break;
            case 4:retCost=348740;
                break;
            default:retCost=0;
                break;
        }
        return retCost;
    }
    public double calculateTotalCost() {
        int costPerFt = Cost.totalCost(this.type);
        return costPerFt*this.area;
    }
}