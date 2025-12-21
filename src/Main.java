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
            short b = 569;
            int c = 27897;
            long cheese = 987678965549L;
            float r = 27.12f;
            double sun = 2.786;

            //Задание 3
            var lydmila = 23;
            var anna = 27;
            var katy = 30;
            var sheet = 480;
            lydmila = anna+ katy + lydmila;
            sheet = sheet / lydmila;
            System.out.println ("На каждого ученика рассчитано"  + sheet +  "листов бумаги");

            // Задание 4
            // сутки - 24 часа - 1440 минут
            // 3 дня - 4320 минут
            // месяц - 30 дней - 43200 минут
            // я всё перевела в минуты, чтобы была одна еденица измерения
            var bottle = 16;
            var minute = 2;
            var minuteMinute = 20;
            var hour = 1440;
            var day = 4320;
            var month = 43200;

            bottle = bottle / minute;
            bottle = minuteMinute * bottle;
            System.out.println ("За 20 минут машина произвела" + bottle + "штук бутылок");
            bottle = bottle / minuteMinute;
            bottle = bottle * hour;
            System.out.println ("За сутки машина произвела" + bottle + "штук бутылок");
            bottle = bottle / hour;
            bottle = bottle * day;
            System.out.println ("За 3 дня машина произвела" + bottle + "штук бутылок");
            bottle = bottle / day;
            bottle = bottle * month;
            System.out.println ("За 1 месяц машина произвела" + bottle + "штук бутылок");

            // Задание 5
            var white = 2;
            var brown = 4;
            var paint = 120;
            white = white + brown;
            paint = paint / white;
            var office = 20;
            // 20 взято из решения сверху, то есть мы всё кол-во краски, поделили на расход краски в 1 кабинете (из условия), получили ответ
            white = white - brown;
            office = office * white;
            var officeWhite = 40;
            // 40 взято из решения сверху, то есть мы нашли кол-во белой краски умножив кол-во кабинетов на расход в одном классе
            office = officeWhite / white;
            office = office * brown;
            var officeBrown = 80;
            // 80 взято из решения сверху, то есть мы нашли кол-во коричневой краски умножив кол-во кабинетов на расход в одном классе
            office = officeBrown / brown;
            System.out.println ("В школе, где" + office + "классов, нужно" + officeWhite + "банок белой краски и" + officeBrown + "банок коричневой краски");
            // надеюсь правильно, если нет, то я пока даже не знаю как написать подругому(((

            // Задание 6
            // всё переведено сразу в граммы
            var banana = 400;
            var milk = 210;
            var plombir = 200;
            var egg = 280;
            banana = banana + milk + plombir + egg;
            System.out.println ("Количество грамм завтрака:" + banana );
            banana = banana / 1000;
            System.out.println ("Количество грамм завтрака:" + banana );
            // я не поняла как перевести граммы в килограммы, могу посчитать в уме, но как ту написать не знаю(((
            // нужна помощь

            // Задание 7
            // 7 кг переведу в 7000 гр
            var weight = 7;
            weight = weight * 1000;
            var w = 250;
            var k = 500;
            weight = weight / w;
            System.out.println ("За" + weight + "дней похедеет, если будет терять по 250гр");
            weight = weight * w;
            weight = weight / k;
            System.out.println ("За" + weight + "дней похедеет, если будет терять по 500гр");

            //Задание 8
            // Mari - Маша
            // Denis - Денис
            // Kris - Кристина
            // месяц берем 30 дней
            var mari = 67760;
            var denis = 83690;
            var kris = 76230;
            mari = mari * 12;
            denis = denis * 12;
            kris = kris * 12;
            System.out.println ("Годова зарплата без повышения, Маша:" + mari + ",Денис:" + denis  + ",Кристина:" + kris);
            mari = mari / 12;
            denis = denis / 12;
            kris = kris / 12;
            mari = mari / 100 * 10 + 67760;
            denis = denis / 100 * 10 + 83690;
            kris = kris / 100 * 10 + 76230;
            System.out.println ("Зп за месяц с увеличением на 10%, Маша:" + mari + ",Денис:" + denis  + ",Кристина:" + kris);
            mari = mari * 12;
            denis = denis * 12;
            kris = kris * 12;
            System.out.println ("Годовая зарплата с повышением на 10%, Маша:" + mari + ",Денис:" + denis  + ",Кристина:" + kris);
            // честно, так же не поняла как совместить всё вместе, годовой доход новый и старый, чтобы оно всё вместе работало, может я что-то упускаю...
            // если можно, то хотелось бы получить объяснений, потому что я сломала голову
            // вообще не уверенна что всё правильно сделала, пожалуйста напишите мне ошибки и каким материалом можно воспользоваться, чтобы изучить вопрос поподробней
            // заранее спасибо)
        }
    }
}