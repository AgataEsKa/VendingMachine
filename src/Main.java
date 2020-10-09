import java.util.List;

public class Main {

    static List<Product> productList;

    public static void main(String[] args) {

        List<Integer> whatIwantBuy;
        double price;
        double change;
        Helpers helpers = new Helpers();
        Calculator calculator = new Calculator();

        productList=helpers.createStorage();
        helpers.displayMenu(productList);
        whatIwantBuy = helpers.run();
        price = helpers.makeBill(whatIwantBuy);
        change=helpers.pay(price);
        calculator.coins(change);
        helpers.deliverProd(whatIwantBuy);

    }
}
