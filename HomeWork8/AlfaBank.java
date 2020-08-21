package HomeWork8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlfaBank extends SiteLoader {
    /**
     * Метод для запуска загрузки курса валют
     *
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */

    @Override

    public double load(SiteLoader.Currency currencyName) {

        return load("https://developerhub.alfabank.by:8273/partner/1.0.0/public/rates", currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     *
     * @param content      то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */

    //
    @Override
    protected double handle(String content, Currency currencyName) {
        System.out.print(currencyName + " ");

        Pattern pattern = Pattern.compile(currencyName.getSellCode() + ",\"buyRate\":[0-9]+\\.[0-9]+,\"buyIso\":\"BYN\""); // в строке ищем подстроку ( валюту с присвоенным ей (SellCode) и с соответствующующим регулярным выражением )
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            String str = matcher.group();
            Pattern pattern1 = Pattern.compile("[0-9]+\\.[0-9]+"); // из полученной подстроки извлекаем соответствующие данные
            Matcher matcher1 = pattern1.matcher(str);
            while (matcher1.find()) {
                return Double.parseDouble(matcher1.group());
            }
        }
        return 0;
    }
}

