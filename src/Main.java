//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

            //Задание 1
            int sand = 19283;
            byte book = 12;
            short tree = 31028;
            long star = 74839388L;
            float water = 32.3f;
            double juice = 21.2;
            System.out.println ("Значение переменной int с целочисленным типом равна" +sand);
            System.out.println ("Значение переменной byte с целочисленным типом равна" +book);
            System.out.println ("Значение переменной short с целочисленным типом равна" +tree);
            System.out.println ("Значение переменной long с целочисленным типом равна" +star);
            System.out.println ("Значение переменной float с типом плавующей точки равна" +water);
            System.out.println ("Значение переменной double с топом плавующей точки равна" +juice);

            // Задание 2
            byte a = 67;
            short b = -159;
            int c = 27897;
            long cheese = 987678965549L;
            float r = 27.12f;
            double sun = 2.786;
            var p = 569;

            //Задание 3
            var lydmila = 23;
            var anna = 27;
            var katy = 30;
            var sheet = 480;
            var result = lydmila + anna + katy;
            var result1 = sheet / result;
            System.out.println ("На каждого ученика рассчитано"  + result1 +  "листов бумаги");

            // Задание 4
           var botles = 16;
           var minutes = 2;
           var productivity = botles / minutes;
           var minuteMinute = productivity * 20;
           var hour = productivity * 24 * 60;
           // 24 часа и 60 минут
            var day = hour * 3;
            var month = hour * 30;
            // 30 дне в месяце
            System.out.println ("За 20 минут машина произвела" + minuteMinute + "штук бутылок");
            System.out.println ("За сутки машина произвела" + hour + "штук бутылок");
            System.out.println ("За 3 дня машина произвела" + day + "штук бутылок");
            System.out.println ("За месяц машина произвела" + month + "штук бутылок");

            // Задание 5
            var white = 2;
            var brown = 4;
            var paint = 120;
            var whiteBrown = white + brown;
            // общее количество краски на класс
            var office = paint / whiteBrown;
            // количество классов
            var totalWhite = office * white;
            var totalBrown = office * brown;
            System.out.println ("В школе, где" + office + "классов, нужно" + totalWhite + "банок белой краски и" + totalBrown + "банок коричневой краски");

            // Задание 6
            var banana = 5 * 80;
            var milk = (200 / 100) * 105;
            var plombir = 2 * 100;
            var egg = 4 * 70;
            var breakfast = banana + milk + plombir + egg;
            var breakfastBreakfast = breakfast / 1000;
            System.out.println ("Количество грамм завтрака:" + breakfast );
            System.out.println ("Количество килограм завтрака:" + breakfastBreakfast );

            // Задание 7
            // 7 кг переведу в 7000 гр
            var weight = 7 * 1000;
            var min = 250;
            var max = 500;
            var dayMim = weight / min;
            var dayMax = weight / max;
            var average = (min + max) / 2;
            var dayAverage = weight / average;
            System.out.println ("При похудении по 250 гр потребуеться" + dayMim + "дней.");
            System.out.println ("При похудении по 500 гр потребуеться" + dayMax + "дней.");
            System.out.println ("При похудении в среднем потребуеться" + dayAverage + "дней.");

            //Задание 8
            // Mari - Маша
            // Denis - Денис
            // Kris - Кристина
            // месяц берем 30 дней
            var mari = 67760;
            var denis = 83690;
            var kris = 76230;
            var percent = 10;
            var yearMari = mari * 12;
            var yearDenis = denis * 12;
            var yearKris = kris * 12;
            var ageMari = mari / 100 * 10;
            var monthMari = mari + ageMari;
            var ageDenis = denis / 100 * 10;
            var monthDenis = denis + ageDenis;
            var ageKris = kris / 100 * 10;
            var monthKris = ageKris + kris;
            var yearMariMari = monthMari * 12;
            var yearDenisDenis = monthDenis * 12;
            var yearKrisKris = monthKris * 12;
            var differenceMari = yearMariMari - yearMari;
            var differenceDenis = yearDenisDenis - yearDenis;
            var differenceKris = yearKrisKris - yearKris;
            System.out.println ("Маша теперь получает" + monthMari + "рублей. Годовой доход вырос на" + ageMari);
            System.out.println ("Денис теперь получает" + monthDenis + "рублей. Годовой доход вырос на" + ageDenis);
            System.out.println ("Кристина теперь получает" + monthKris + "рублей. Годовой доход вырос на" + ageKris);
            System.out.println ("Разница между годовым доходом сейчас и после повышения: Мари" + differenceMari + "Денис" + differenceDenis + "Кристина" + differenceKris);
        }
    }
}