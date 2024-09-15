public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1 ");
        int f = 10000;
        System.out.println("Значение переменной f c типом "  + "int равно " + f);
        byte d = 125;
        System.out.println("Значение переменной d c типом " + "byte равно " + d);
        short h = 2250;
        System.out.println("Значение переменной h c типом " + "short равно " + h);
        long j = 350L;
        System.out.println("Значение переменной j c типом " + "long равно " + j);
        float r = 90.3f;
        System.out.println("Значение переменной r c типом " + "float равно " + r);
        double s = 30.265552166;
        System.out.println("Значение переменной r c типом " + "double равно " + s);

        System.out.println("Задание 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short k = 569;
        short e = -159;
        short l = 27897;
        byte g = 67;

        System.out.println("Задание 3");
        byte student1 = 23;
        byte student2 = 27;
        byte student3 = 30;
        short listCount = 480;
        int totalStudent = student1+student2+student3;
        System.out.println("Общее количество учеников в классе " + totalStudent);
        int oneStudent  = listCount/totalStudent;
        System.out.println("На каждого ученика рассчитано " + oneStudent + " листов бумаги");

        System.out.println("Задание 4");
        byte machineCapacityIn2Min = 16;
        int machineCapacityIn1Min = machineCapacityIn2Min/2;
        int machineCapasityIn20Min = machineCapacityIn1Min*20;
        System.out.println("За 20 минут машина произвела " + machineCapasityIn20Min + " штук бутылок ");
        int machineCapasityIn24Hour = (machineCapacityIn1Min*60)*24;
        System.out.println("За сутки машина произвела " + machineCapasityIn24Hour + " штук бутылок ");
        int machineCapacityIn3Day = machineCapasityIn24Hour*3;
        System.out.println("За 3 дня машина произвела " + machineCapacityIn3Day + " штук бутылок ");
        int machineCapacityIn1month = machineCapasityIn24Hour*30;
        System.out.println("За 1 месяц машина произвела " + machineCapacityIn1month + " штук бутылок");

        System.out.println("Задание 5");
        int totalCansOfPaintInSchool  = 120;
        byte whiteCansOfPaint1Classes = 2;
        byte brownCansOfPaint1Classes = 4;
        byte totalCansOfPaintIn1Classes = (byte) (whiteCansOfPaint1Classes + brownCansOfPaint1Classes);
        int  totalClasses = totalCansOfPaintInSchool/totalCansOfPaintIn1Classes;
        int totalWhiteCansOfPaintsInSchool = totalClasses*2;
        int totalBrawnCansOfPaintsInSchool = totalClasses*4;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCansOfPaintsInSchool + " банок белой краски и " + totalBrawnCansOfPaintsInSchool + " банок коричневой краски");

        System.out.println("Задание 6");
        byte weight1bananaGram = 80;
        byte weight100MlMilkGram = 105;
        byte weight1IceCreamGram = 100;
        byte weight1EggGram = 70;
        int totalBanana = weight1bananaGram * 5;
        int totalMilk = weight100MlMilkGram * 2;
        int totalIceCream = weight1IceCreamGram * 2;
        int totalEgg = weight1EggGram * 4;
        int weightBreakfastGram = (totalBanana + totalMilk + totalIceCream + totalEgg);
        int weightBreakfastKilogram = (weightBreakfastGram/1000);
        System.out.println(weightBreakfastGram + " грамм");
        System.out.println(weightBreakfastKilogram + " килограмм");

        System.out.println("Задание 7");
        int totalWeightDownKg = 7;
        int totalWeightDownGram = totalWeightDownKg * 1000;
        short weightDown1DayGram1 = 250;
        short weightDown1DayGram2 = 500;
        int numberOfDays1 = totalWeightDownGram/weightDown1DayGram1;
        int numberOfDays2 = totalWeightDownGram/weightDown1DayGram2;
        System.out.println(numberOfDays1);
        System.out.println(numberOfDays2);
        int averageNumberOfDays = (numberOfDays1 + numberOfDays2)/2;
        System.out.println(averageNumberOfDays);

        System.out.println("Задание 8");
        int payMonthMasha = 67760;
        int payMonthDenis = 83690;
        int payMonthKristina = 76230;
        int payYearMasha = payMonthMasha * 12;
        int payYearDenis = payMonthDenis * 12;
        int payYearKristina = payMonthKristina  * 12;
        double payMonthMashaBoost = payMonthMasha + (payMonthMasha * 0.1);
        double payMonthDenisBoost = payMonthDenis + (payMonthDenis * 0.1);
        double payMonthKristinaBoost = payMonthKristina + (payMonthKristina * 0.1);
        double payYearMashaBoost = payMonthMashaBoost * 12;
        double payYearDenisBoost = payMonthDenisBoost * 12;
        double payYearKristinaBoost = payMonthKristinaBoost * 12;
        double totalGainPayMasha = payYearMashaBoost - payYearMasha;
        double totalGainPayDenis = payYearDenisBoost - payYearDenis;
        double totalGainPayKristina = payYearKristinaBoost - payYearKristina;
        System.out.println( "Маша теперь получает " + payMonthMashaBoost + " рублей. Годовой доход вырос на " + totalGainPayMasha + " рублей.");
        System.out.println( "Денис теперь получает " + payMonthDenisBoost + " рублей. Годовой доход вырос на " + totalGainPayDenis + " рублей.");
        System.out.println( "Кристина теперь получает " + payMonthKristinaBoost + " рубля. Годовой доход вырос на " + totalGainPayKristina + " рублей.");

    }
}