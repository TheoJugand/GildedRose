public abstract class MyItem extends Item {
    private int minimalValue;
    private int maximalValue;

    public MyItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    protected void updateQuality()
    {

    }
    protected void udpdateSellIn()
    {

    }

    public  int getMaximalValue(){ return maximalValue; }

    public void setMaximalValue(int value)
    {
        this.maximalValue = value;
    }

    public void setMinimalValue(int min)
    {
        this.minimalValue = min;
    }

    public int getMinimalValue()
    {
        return minimalValue;
    }
}
