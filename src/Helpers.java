import java.util.*;

public class Helpers {
    public List<Product> createStorage() {
        List<Product> storage = new ArrayList<Product>();
        storage.add(new SoftDrink(1, "Coca-Cola", 3.0, 10, 1.0));
        storage.add(new Soda(2,"Woda", 2.5, 10));
        storage.add(new Chips(3, "Laysy paprykowe", 1.8, 10));
        storage.add(new ChocolateBar(4, "Sneakers", 2.7, 10));
        return storage;
    }

    public void displayMenu(List<Product> productList){
        System.out.println("Lista produktów: " + productList.get(0).id + ". " + productList.get(0).name + " | "
                + productList.get(1).id + ". "+ productList.get(1).name + " | "
                + productList.get(2).id + ". "+ productList.get(2).name + " | "
                + productList.get(3).id + ". "+ productList.get(3).name);
    }

    public List<Integer> run (){
        List <String> choosenName = new ArrayList<String>();
        List<Integer> choosenId = new ArrayList<Integer>();
        String takNie;
        HashMap<Integer, String> Map = new HashMap<Integer, String>();
        Map.put(1, createStorage().get(0).name);
        Map.put(2, createStorage().get(1).name);
        Map.put(3, createStorage().get(2).name);
        Map.put(4, createStorage().get(3).name);
        System.out.println("Wybierz nr produktu: ");

        do {

            Scanner scanner = new Scanner(System.in);
            int idProd = scanner.nextInt();
            choosenName.add(Map.get(idProd));
            choosenId.add(idProd);
            System.out.println("Czy chcesz zamknąć zamówienie ?");
            Scanner scanner1 = new Scanner(System.in);
            takNie = scanner1.nextLine();
            if (takNie.equalsIgnoreCase("nie")){
                System.out.println("Wybierz kolejny produkt: ");

            }

        } while(!takNie.equalsIgnoreCase("tak"));

        System.out.println("Twoje zamówienie to: " + choosenName);
        return choosenId;

    }

    public double makeBill (List<Integer> whatIwantBuy){
        HashMap<Integer, Double> Map1 = new HashMap<Integer, Double>();
        double sumPrice=0;
        List <Product> allProds = createStorage();
        System.out.println(whatIwantBuy);
        Map1.put(1, createStorage().get(0).price);
        Map1.put(2, createStorage().get(1).price);
        System.out.println("Rachunek: ");
        for (Integer idProd : whatIwantBuy) {

            for (Product productDetail : allProds) {

                if (productDetail.id == idProd) {
                    System.out.println("Produkt : " + productDetail.name + " | " + " Cena : " + productDetail.price);
                    sumPrice = sumPrice + productDetail.price;
                }

            }
        }
        System.out.println("Suma : " + sumPrice);
        return sumPrice;
    }

    public double pay (double requiredAmount){
        Scanner scan = new Scanner(System.in);

        double givenAmount = 0;

        do {
            System.out.println("wrzuć monety (0.10 | 0.20 | 0.50 | 1 | 2 | 5) : ");
            givenAmount = givenAmount + (scan.nextDouble());
            System.out.println("Wrzuciłeś: " + givenAmount);
            if (givenAmount<requiredAmount){
                System.out.println("Do zapłaty pozostało: " + (requiredAmount-givenAmount));
                System.out.println("Wymagana suma to: " + requiredAmount);
            }


        } while (givenAmount<requiredAmount);

        double change = givenAmount-requiredAmount;

        if(givenAmount==requiredAmount){
            System.out.println("Dziękujemy ");
        }
        else
            System.out.println("Reszta dla Ciebie to  : " + change);

        return change;

    }

    public void deliverProd (List<Integer> whatIwantBuy){
        List <Product> allProds = createStorage();
        System.out.println("Odbierz produkty: ");
        for (Integer idProd : whatIwantBuy){
            for (Product productDetail : allProds){
                if (productDetail.id == idProd){
                    System.out.println(productDetail.name);
                }
            }
        }
    }

}
