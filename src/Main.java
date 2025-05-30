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
        friend=friend+2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println("задание пятое. " + frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
        var b1 = 78.2;
        var b2 = 82.7;
        var b3 = b2+b1;
        System.out.println("задание шестое. масса двух бойцов " + b3);
        System.out.println(b2-b1);
        System.out.println("задание седьмое. " + b2 % b1);
        var hours = 640;
        var norm = 8;
        var human = hours / norm;
        System.out.println("Задание восьмое. Всего работников в компании - " + human + " человек.");
        human = human + 94;
        hours = human / norm;
        System.out.println("Если в компании работает "+human+" человек,то всего"+"часов работы может быть поделено между сотрудниками.");
    }
}