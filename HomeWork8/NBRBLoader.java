package HomeWork8;

public class NBRBLoader extends SiteLoader {

    /**
     * Метод для запуска загрузки курса валют
     *
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */

    @Override

    public double load(SiteLoader.Currency currencyName) {

        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
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
    // Данный метод подходит и для БеларусБанка.
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        System.out.print(currencyName + " ");

        int index = content.indexOf(String.valueOf(currencyName));
        index = content.indexOf(".", index);
        return Double.parseDouble(content.substring(index - 1, index + 5));
    }
}


