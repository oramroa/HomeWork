package HomeWork7;

import java.util.Random;

public class RandomString {


    public static String random(int stringLength) {
        String sentence = " ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz" +
                "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

        Random rnd = new Random();

        StringBuilder sb = new StringBuilder(stringLength);
        for (int i = 0; i < stringLength; i++)
            sb.append(sentence.charAt(rnd.nextInt(sentence.length())));
        return sb.toString();
    }

    public static int generateRage(int min, int max) {
        Random rnd2 = new Random();
        return rnd2.nextInt((max - min) + 1) + min;
    }

}