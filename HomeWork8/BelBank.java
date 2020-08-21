package HomeWork8;

public class BelBank extends SiteLoader {

    /**
     * Метод для запуска загрузки курса валют
     *
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */

    @Override

    public double load(SiteLoader.Currency currencyName) {

        return load("https://belarusbank.by/api/kursExchange", currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     *
     * @param content      то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */

    // Поиск осуществляем через indexOf по тексту сайта.
    // Смотрим строку дальше (после валюты) по символу и проверяем символ на число,
    // на "." или "," (разделитель числа, в данном случае ".") до первого пробела или символа конца строки.
    // Выделяем подстроку из строки через substring с указанием начального и конечного индекса.
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        System.out.print(currencyName + " ");

        int a = content.indexOf(String.valueOf(currencyName));
        a = content.indexOf(".", a);
        return Double.parseDouble(content.substring(a - 1, a + 5));

    }
}
