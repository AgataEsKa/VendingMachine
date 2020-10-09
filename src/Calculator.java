public class Calculator {

    public void coins (double price) {

        int remainingAmount = (int) (price * 100);

        int liczba5Zlotowek = remainingAmount/500;

        remainingAmount=remainingAmount%500;

        int liczba2Zlotowek = remainingAmount/200;

        remainingAmount=remainingAmount%200;

        int liczbaZlotowek = remainingAmount/100;

        remainingAmount = remainingAmount%100;

        int liczbaPięćdziesięcioGroszówek = remainingAmount/50;

        remainingAmount = remainingAmount%50;

        int liczbaDwudziestogroszówek = remainingAmount/20;

        remainingAmount = remainingAmount%20;

        int liczbaDziesięciogroszówek = remainingAmount / 10;

        System.out.println(liczba5Zlotowek + " x pięć złotych | " + liczba2Zlotowek + " x dwa złote | "
                + (liczbaZlotowek) + " x złotówka | " + liczbaPięćdziesięcioGroszówek + " x pięćdziesiąt groszy | "
                + liczbaDwudziestogroszówek + " x dwadzieścia groszy | " + liczbaDziesięciogroszówek + " x dziesięć groszy | ");

    }


}
