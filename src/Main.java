public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("задание первое. " + dog + " , " + cat + " , " + paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("задание второе. " + dog + " , " + cat + " , " + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(" задание третье. " + dog + " , " + cat + " , " + paper);
        var friend = 19;
        System.out.println(" задание четвертое. " + friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println("задание пятое. " + frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var b1 = 78.2;
        var b2 = 82.7;
        var b3 = b2 + b1;
        System.out.println("задание шестое. масса двух бойцов " + b3);
        System.out.println(b2 - b1);
        System.out.println("задание седьмое. " + b2 % b1);
        var hours = 640;
        var norm = 8;
        var human = hours / norm;
        System.out.println("Задание восьмое. Всего работников в компании - " + human + " человек.");
        human = human + 94;
        hours = human / norm;
        System.out.println("Если в компании работает " + human + " человек,то всего" + "часов работы может быть поделено между сотрудниками.");
        int j = 1846637584;
        byte l = 120;
        short i = 29657;
        long o = 922337203;
        float p = 3.396f;
        double m = 1.253456;
        System.out.println("значение переменной j с типом int равно " + j);
        System.out.println("значение переменной l с типом byte равно " + l);
        System.out.println("значение переменной i с типом short равно " + i);
        System.out.println("значение переменной o с типом long равно " + o);
        System.out.println("значение переменной p с типом float равно " + p);
        System.out.println("значение переменной m с типом double равно " + m);

        double mM = 27.12;
        long gG = 987_678_965_549L;
        double lL = 2.786;
        short iI = 569;
        short pl = -159;
        short ki = 27897;
        byte ik = 67;
        System.out.println(mM);
        System.out.println(gG);
        System.out.println(lL);
        System.out.println(iI);
        System.out.println(pl);
        System.out.println(ki);
        System.out.println(ik);
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        byte total = (byte) (LP + AS + EA);
        Short sheets = 480;
        short NK = (short) (sheets / total);
        System.out.println("На каждого ученика рассчитано " + NK + " листов бумаги");
        byte manufacturing = 16;
        short min20 = (short) (manufacturing * 10);
        int day = min20 * 72;
        int day3 = day * 3;
        int month = day3 * 10;
        System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        System.out.println("За 3 суток машина произвела " + day3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + month + " штук бутылок");
        byte bK = 120;
        byte bB = 2;
        byte kB = 4;
        byte oK = (byte) (bB + kB);
        byte klass = (byte) (bK / oK);
        byte BB = (byte) (bB * klass);
        byte KB = (byte) (kB * klass);
        System.out.println("В школе, где " + klass + " классов, нужно " + BB + " банок белой краски и " + KB + " банок коричневой краски");
        byte banana = 80;
        byte milk = 105;
        byte iseCream = 100;
        byte egg = 70;
        int breakfastG = banana * 5 + milk * 2 + iseCream * 2 + egg * 4;
        System.out.println("вес завтрака в граммах " + breakfastG);
        float breakfastKG = breakfastG / 1000;
        System.out.println("вес завтрака в килограммах " + breakfastKG);
        short weight = 7;
        weight = (short) (weight * 1000);
        short min = 250;
        short max = 500;
        byte Min = (byte) (weight / min);
        System.out.println("если худеть по 250 грамм в сутки то потребуется " + Min + " суток");
        byte Max = (byte) (weight / max);
        System.out.println("если худеть по 500 грамм в сутки то потребуется " + Max + " суток");
        byte average = ((byte) ((Min + Max) / 2));
        System.out.println("в среднем чтоб похудеть понадобиться " + average + " сутоки");
        float P10 = 1.1F;
        byte year = 12;
        int Masha = 67760;
        int yearMasha = Masha * year;
        float newMasha = Masha * P10;
        float newYearMasha = newMasha * year;
        float rMasha = newYearMasha - yearMasha;
        System.out.println("Маша теперь получает " + newMasha + " рублей.Годовой доход вырос на " + rMasha + " рублей.");
        int Denis = 83690;
        int yearDenis = Denis * year;
        float newDenis = Denis * P10;
        float newYearDenis = newDenis * year;
        float rDenis = newYearDenis - yearDenis;
        System.out.println("Денис теперь получает " + newDenis + " рублей.Годовой доход вырос на " + rDenis + " рублей.");
        int Kristin = 76230;
        int yearKristin = Kristin * year;
        float newKristin = Kristin * P10;
        float newYearKristin = newKristin * year;
        float rKristin = newYearKristin - yearKristin;
        System.out.println("Кристина теперь получает " + newKristin + " рублей.Годовой доход вырос на " + rKristin + " рублей.");
        System.out.println("Задание 1 ");
        byte age = 19;
        if (age >= 18) {
            System.out.println(" вы совершеннолетний ");
        } else {
            System.out.println(" вы недостигли совершеннолетия,нужно немного подождать");
        }
        System.out.println("Задание 2 ");
        byte temperature = 4;
        if (temperature >= 5) {
            System.out.println(" Сегодня тепло,можно идти без шапки ");
        } else {
            System.out.println(" На улице холодно,ужно надеть шапку ");
        }
        System.out.println("Задание 3");
        byte speed = 74;
        if (speed >= 60) {
            System.out.println(" если скорость более 60км/ч,то придется заплатить штраф");
        } else {
            System.out.println(" если скорость не привышает 60км/ч то можно ездить спокойно");
        }
        System.out.println("Задание 4 ");
        byte age1 = 19;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("нужно ходить в детский сад");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("нужно ходить в школу");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("нужно ходить в университет");
        }
        if (age1 >= 24) {
            System.out.println("нужно ходить на работу");
        }
        System.out.println("Задание 5 ");
        byte childAre = 8;
        if (childAre < 5) {
            System.out.println("не может кататься на атракционах");
        }
        if (childAre >= 5 && childAre < 14) {
            System.out.println("может кататься только в сопровождении взрослого. Если взрослого нет тогда кататься нельзя");
        }
        if (childAre >= 14) {
            System.out.println("может кататься без сопровождения взрослого");
        }
        System.out.println("Задание 6 ");
        byte SSK = 99;
        if (SSK < 60) {
            System.out.println("есть сидячие места");
        }
        if (SSK < 102 && SSK > 60) {
            System.out.println("остались только стоячие места");
        } else {
            System.out.println("мест больше нет");
        }
        System.out.println("Задание 7 ");
        int one = 746;
        int two = 469;
        int three = 934;
        if (one >= two && one >= three) {
            System.out.println("максимальное число в переменной one равняется " + one);
        } else if (two >= three) {
            System.out.println("Максимальное число в переменной two равняется " + two);
        } else {
            System.out.println("максимальное число в переменной three равняется " + three);
        }
        System.out.println("задание 1 ");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("задание 2 ");
        int op = 0;
        int clientDeviceYear = 2015;
        if (op == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (op == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (op == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
        System.out.println("задание 3 ");
        int Year = 2021;
        if (Year > 1584 && (Year % 4 == 0 && Year % 100 != 0) || Year % 400 == 0) {
            System.out.println("год является високосным");
        } else {
            System.out.println("год не является високосным");
        }
        System.out.println("задание 4");
        int deliveryDistance = 95;
        int days = 0;
        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
        } else {
            days = -1;
        }
        if (days != -1) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет ");
        }
        System.out.println("зададание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
        }
        System.out.println("задание 1 ");
        for (int cycle1 = 1; cycle1 <= 10; cycle1 = cycle1 + 1) {
            System.out.println(cycle1);
        }
        System.out.println("задание 2 ");
        for (int cycle2 = 10; cycle2 >= 1; cycle2 = cycle2 - 1) {
            System.out.println(cycle2);
        }
        System.out.println("задание 3 ");
        for (int cycle3 = 0; cycle3 <= 17; cycle3 = cycle3 + 2) {
            System.out.println(cycle3);
        }
        System.out.println("задание 4");
        for (int cycle4 = 10; cycle4 >= -10; cycle4 = cycle4 - 1) {
            System.out.println(cycle4);
        }
        System.out.println("задание 5 ");
        for (int leapYear = 1904; leapYear <= 2096; leapYear = leapYear + 4) {
            System.out.println(leapYear + " год является високосным ");
        }
        System.out.println("задание 6 ");
        for (int cycle5 = 7; cycle5 <= 98; cycle5 = cycle5 + 7) {
            System.out.println(cycle5);
        }
        System.out.println("задание 7 ");
        for (int cycle6 = 1; cycle6 <= 512; cycle6 = cycle6 * 2) {
            System.out.println(cycle6);
        }
        System.out.println("задание 8 ");
        int savings1 = 29000;
        int total1 = 0;
        for (int savings = 0; savings < 12; savings++) {
            total1 = total1 + savings1;
            System.out.println("месяц " + savings + " итого " + total1);
        }
        System.out.println("задача 9 ");
        int savings2 = 29000;
        int total2 = 0;
        for (int savings3 = 0; savings3 < 12; savings3++) {
            total2 = total2 + total2 / 100;
            total2 = total2 + savings2;
            System.out.println("Месяц " + savings3 + " сумма накопленийравна " + total2 + " рублей ");
        }
        System.out.println("задание 10 ");
        int namber = 2;
        for (int multiplier = 1; multiplier <=10; multiplier++) {
            System.out.println(namber + "*"+multiplier+"="+namber*multiplier);
        }
        }

}