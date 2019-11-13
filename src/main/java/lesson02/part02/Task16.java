package lesson02.part02;

import java.util.Scanner;

/**
 * Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зелёный сигнал,
 * затем в течение одной минуты — жёлтый, а потом в течение одной минуты — красный, затем опять зелёный горит три минуты и т. д.
 * Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
 * Определить, сигнал какого цвета горит для пешеходов в этот момент.
 * Результат вывести на экран в следующем виде:
 * "зелёный" - если горит зелёный цвет, "жёлтый" - если горит жёлтый цвет, "красный" - если горит красный цвет.
 * Пример для числа 2.5:
 * зелёный
 * Пример для числа 3:
 * жёлтый
 * Пример для числа 4:
 * красный
 * Пример для числа 5:
 * зелёный
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать вещественное число c клавиатуры.
 * 2.	Программа должна выводить текст на экран.
 * 3.	Если горит зелёный цвет, необходимо вывести текст: "зелёный"
 * 4.	Если горит жёлтый цвет, необходимо вывести текст: "жёлтый"
 * 5.	Если горит красный цвет, необходимо вывести текст: "красный"
 */

public class Task16 {
    public static void main(String[] args) throws Exception {
        double t;
        String color="";
        Scanner in=new Scanner(System.in);
        t=in.nextDouble();
        t=t%5;//полный цикл 5 минут (3з+1ж+1к)
        System.out.println(t);
        if ((t>=0)&(t<3))
            color="зелёный";
        else if ((t>=3)&(t<4))
            color="жёлтый";
            else if ((t>=4)&(t<5))
                color="красный";
        System.out.println(color);
    }
}