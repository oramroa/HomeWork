package HomeWork8;

public class Test {
    public static void main(String[] args) {
        System.out.println("---НБРБ---");
        printRates(new NBRBLoader());
        System.out.println("---Альфа-Банк---");
        printRates(new AlfaBank());
        System.out.println("---Беларус-Банк---");
        printRates(new BelBank());
        System.out.println("---БелагроБанк---");
        printRates(new BelAgroBank());
        System.out.println("---БПС-Банк---");
        printRates(new BPSBank());
    }

    public static void printRates(SiteLoader loader) {

        System.out.println(loader.load(SiteLoader.Currency.EUR));
        System.out.println(loader.load(SiteLoader.Currency.RUB));
        System.out.println(loader.load(SiteLoader.Currency.USD));
    }
}


