package ru.job4j.oop.ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Привет" + eng;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        String eng = dummyDic.engToRus("");
        System.out.println("Неизвестное слово. " + eng);
    }
}
