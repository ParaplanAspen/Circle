package com.company;
/** Класс круг
 * вводим значение переменных радиус и цвет
 * вводим методы расчета длины и площади
 * */
public class Circle {
    double radius;
    String colour; //Цвет оружности
    Circle(double r, String col){
        radius=r;
        colour=col;
    }
    double dlina(){
       return 2*radius*Math.PI;
    }
    double square(){
       return Math.PI*radius*radius;
    }
        }

