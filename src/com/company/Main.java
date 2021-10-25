package com.company;
/**
 * Определяем объект krug
 */
public class Main {

    public static void main(String[] args) {
        Circle krug = new Circle(25, "white");
        double dlin;
        double sq;
        String col;
        dlin = krug.dlina();
        sq = krug.square();
        col = krug.colour;
        System.out.println("Длина окружности равна" + " " + dlin);
        System.out.println("Площадь окружности равна" + " " + sq);
        System.out.println("Цвет окружности равен" + " " + col);

    }

}
