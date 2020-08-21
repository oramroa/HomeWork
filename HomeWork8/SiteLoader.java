package HomeWork8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class SiteLoader {
    public enum Currency {

        USD("145", "840"),
        EUR("292", "978"),
        RUB("298", "643");

        private String id;
        private String sellCode;

        Currency(String id, String sellCode) {
            this.id = id;
            this.sellCode = sellCode;

        }

        public String getId() {
            return this.id;
        }

        public String getSellCode() {
            return this.sellCode;
        }

    }

    /**
     * Метод для запуска загрузки курса валют
     *
     * @param urlToSite    урл по которому надо постучаться
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    protected final double load(String urlToSite, SiteLoader.Currency currencyName) {

        StringBuilder content;
        boolean error;
        int retryCount = 0;

        do {
            content = new StringBuilder();
            error = false;

            try {
                // create a url object
                var con = (HttpURLConnection) new URL(urlToSite).openConnection();
                con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0");
                con.setConnectTimeout(50000); //set timeout to 50 seconds
                con.setReadTimeout(50000); //set timeout to 50 seconds

                try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                }
            } catch (Exception e) {
                error = true;
                retryCount++;

                System.err.println("При соединении что-то пошло не так. " + e.getMessage());
            }

        } while (error && retryCount < 5);
        if (error) {

            throw new RuntimeException("Не получилось загрузить курсы валют");
        }
//        System.out.print(content.toString());
        return handle(content.toString(), currencyName);
    }

    public abstract double load(SiteLoader.Currency currencyName);

    /**
     * Метод который будет дёрнут после успешной загрузки сайта
     *
     * @param content      содержимое сайта
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    protected abstract double handle(String content, SiteLoader.Currency currencyName);
}


