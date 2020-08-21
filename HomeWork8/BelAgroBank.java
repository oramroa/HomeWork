package HomeWork8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelAgroBank extends SiteLoader {
    /**
     * Метод для запуска загрузки курса валют
     *
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */

    @Override

    public double load(SiteLoader.Currency currencyName) {

        return load("https://belapb.by/ExCardsDaily.php?ondate=8/20/2020", currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     *
     * @param content      то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    // Поиск осуществляем через indexOf по тексту сайта.
    // Получаем индекс вхождения RateBuy / RateSell.
    // Выделяем подстроку из строки через substring.
    // С помощью регулярного выражения получаем курс.
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        System.out.print(currencyName + " ");
        int index = content.indexOf(currencyName.toString());
        index = content.indexOf("RateBuy", index);
//        index = content.indexOf("RateSell", index);
        String string = content.substring(index);

        Pattern pattern = Pattern.compile("[0-9]+\\.[0-9]+");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            return Double.parseDouble(matcher.group());
        }
        return 0;
    }
}
