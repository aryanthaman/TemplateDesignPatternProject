
abstract public class InstrumentKind {

    public int stockingNumber;
    public int costPrice;
    public int sellingPrice;

    //constructor
    InstrumentKind(int i, int j, int k){
        stockingNumber = i;
        costPrice = j;
        sellingPrice = k;
    }

    //abstract methods
    abstract public void addStockingNumber();
    abstract public void addCostPrice();
    abstract public void addSellingPrice();

    //template method
    final public void updateInstrument(){
        addStockingNumber();
        addCostPrice();
        addSellingPrice();
        System.out.println();
    }

}

class Guitar extends InstrumentKind{

    //constructor
    Guitar(int i, int j, int k){
        super(i, j, k);
    }

    @Override
    public void addStockingNumber() {
        System.out.println("Stocking Number for this guitar is: " + stockingNumber);
    }

    @Override
    public void addCostPrice() {
        System.out.println("Cost price of Guitar: $" + costPrice);
    }

    @Override
    public void addSellingPrice() {
        System.out.println("Selling price of Guitar: $" + sellingPrice);
    }

}

class Drums extends InstrumentKind{

    Drums(int i, int j, int k){
        super(i, j, k);
    }

    @Override
    public void addStockingNumber() {
        System.out.println("Stocking Number for this Drum is: " + stockingNumber);
    }

    @Override
    public void addCostPrice() {
        System.out.println("Cost price of Drums: $" + costPrice);
    }

    @Override
    public void addSellingPrice() {
        System.out.println("Selling price of Drums: $" + sellingPrice);
    }

}

class Bass extends InstrumentKind{

    Bass(int i, int j, int k){
        super(i, j, k);
    }

    @Override
    public void addStockingNumber() {
        System.out.println("Stocking Number for this Bass is: " + stockingNumber);
    }

    @Override
    public void addCostPrice() {
        System.out.println("Cost price of Bass: $" + costPrice);
    }

    @Override
    public void addSellingPrice() {
        System.out.println("Selling price of Bass: $"+ sellingPrice);
    }

}