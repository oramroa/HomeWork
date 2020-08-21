package HomeWork8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BPSBank extends SiteLoader {
    /**
     * Метод для запуска загрузки курса валют
     *
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */

    @Override

    public double load(SiteLoader.Currency currencyName) {

        return load("https://www.bps-sberbank.by/rates/rates.json", currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     *
     * @param content      то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    // Поиск осуществляем через lastIndexOf по тексту сайта.
    // Смотрим строку дальше (после валюты) по символу и проверяем символ на число,
    // на "." или "," (разделитель числа, в данном случае ",").
    // Выделяем подстроку из строки через substring.
    // С помощью регулярного выражения получаем курс.
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        System.out.print(currencyName + " ");
        int index = content.lastIndexOf(currencyName.toString());
        index = content.lastIndexOf(",", index);
        String string = content.substring(index);

        Pattern pattern = Pattern.compile("[0-9]+.[0-9]+");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            return Double.parseDouble(matcher.group());
        }
        return 0;
    }
}

