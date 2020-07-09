package HomeWork1;

import static HomeWork1.StatSleep.sleepIn;

public class bvvd {
    public static void main(String[] args) {
        if (sleepIn(false,  true)){
            System.out.println("Спим дальше");
         }else {
            System.out.println("Пора идти на работу");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday || vacation){
            return true;
        }else
            return false;
    }

    }
