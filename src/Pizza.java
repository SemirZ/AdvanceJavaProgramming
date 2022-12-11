public class Pizza extends Product {


    public Pizza(String name, double prize){
          super(name,prize);

    }




    @Override
    public double countPrice() {
        return this.price + this.price * 0.1;
    }
}
