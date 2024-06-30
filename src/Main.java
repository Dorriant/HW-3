public class Main {
    public static void main(String[] args) {
        // Задача 1
// Объявление переменных
byte a = 5;
int b = 45000;
short c = 400;
long d = 300000000L;
float e = 65.99f;
double f = 3.14159265358979;

// Вывод переменных в консоль
System.out.println("Значение переменной a c типом byte равно " + a);
System.out.println("Значение переменной b с типом int равно " + b);
System.out.println("Значение переменной с типом short равно " + c);
System.out.println("Значение переменной d типом short равно " + d);
System.out.println("Значение переменной e типом short равно " + e);
System.out.println("Значение переменной f типом short равно " + f);

    // Задача 2
// Инициализация переменных
byte box = 67;
int x = 27897;
short l = 569;
long v = 987678965549L;
float n = 27.12f;
double m = 2.786;

    // Задача 3
// Объявление переменных
byte ludmilaStudents =  23;
byte annaStudents =  27;
byte ekaterinaStudents =  30;
short paper = 480;

// Общее количество учеников
int allStudents =  ludmilaStudents+annaStudents+ekaterinaStudents;

// Количество листов бумагив на одного ученика
int paperPerStudent = paper/allStudents;
System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги.");

    // Задача 4
// Производительность машины
byte bottlesPerTwoMinutes = 16;

// Производительность машины в минуту
int bottlesPerOneMinute =  bottlesPerTwoMinutes/2;

// Количество бутылок за 20 минут работы машины
int bottlesPer20Minutes = bottlesPerOneMinute * 20;

// Количество бутылок в сутки
short minutesInOneDay = 24 * 60;
int bottlesPerDay = bottlesPerOneMinute * minutesInOneDay;

// Количество бутылок за 3 дня
int bottlesPer3Day = (bottlesPerOneMinute * minutesInOneDay) * 3;

// Количество бутылок за месяц
byte daysPerMonth = 30;
int bottlesPerMonth = bottlesPerDay * daysPerMonth;

// Вывод результатов в консоль
System.out.println("За 20 минут машина произвела " +bottlesPer20Minutes+ " штук бутылок.");
System.out.println("За сутки машина произвела " +bottlesPerDay+ " штук бутылок.");
System.out.println("За 3 дня машина произвела "+ bottlesPer3Day + " штук бутылок.");
System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок.");
       // Задача 5
// Банок краски на один класс
byte whiteColorPerOneRooms = 2;
byte brownColorPerOneRooms = 4;
int allColorPerOneRooms = whiteColorPerOneRooms + brownColorPerOneRooms;

// Классов в школе
byte totalCansColor = 120;
int roomsInSchool = totalCansColor/allColorPerOneRooms;

// Количество банок белой краски
int totalCansWhiteColor = roomsInSchool * whiteColorPerOneRooms;

// Количество банок коричневой краски
int totalCansBrownColor = roomsInSchool * brownColorPerOneRooms;

// Вывод результатов в консоль
System.out.println("В школе где "+ roomsInSchool + " классов, нужно " + totalCansWhiteColor + " банок белой краски и " + totalCansBrownColor + " банок коричневой краски.");
    //  Задача 6
// Объявление переменных
byte OneBananaWeight = 80;
byte OneMilkWeight = 105;
byte OneIceCreamWeight = 100;
byte OneEggWeight = 70;

// Общий вес рецепта
int FiveBananasWeight = OneBananaWeight * 5;
int TwoMilkWeight = OneMilkWeight * 2;
int TwoIceCreamsWeight = OneIceCreamWeight * 2;
int FourEggsWeight = OneEggWeight * 4;
int totalWeight = FiveBananasWeight + TwoMilkWeight + TwoIceCreamsWeight + FourEggsWeight;
// Перевод из грамм в килограмы
float totalWeight2 = totalWeight / 1000f;

// Вывод результатов в консоль
System.out.println("Обший вес спортзавтрака в граммах равен " + totalWeight + " грамм.");
System.out.println("Общий вес спортзавтрака в килограммах равне " + totalWeight2 + " кг.");

    // Задача 7
// Объявление переменных
byte extraWeight = 7;
short FirstExtraWeightPerDay = 250;
short SecondExtraWeightPerDay = 500;

// Если терять каждый день по 250 грамм
int ExtraWeightInGrams = extraWeight * 1000;
int daysToLooseFirstExtraWeight = ExtraWeightInGrams / FirstExtraWeightPerDay;

// Если терять каждый день по 500 грамм
int daysToLooseSecondExtraWeight = ExtraWeightInGrams / SecondExtraWeightPerDay;

// Среднее количество дней для похудения
double averageDaysToLooseExtraWeight = (daysToLooseSecondExtraWeight + daysToLooseFirstExtraWeight) / 2.0;

// Вывод результатов в консоль
System.out.println(daysToLooseFirstExtraWeight + " дней уйдет на похудение, если терять каждый день по 250 грамм.");
System.out.println(daysToLooseSecondExtraWeight + " дней уйдет на похудение, если терять каждый день по 500 грамм.");
System.out.println("В среднем уходит " + averageDaysToLooseExtraWeight + " дней, чтобы добиться результата похудения.");

   // Задача 8
// Объявление переменных
int mashaSalaryPerMonth = 67760;
int denisSalaryPerMonth = 83690;
int kristinaSalaryPerMonth = 76230;

// Годовой доход
byte monthsInYear = 12;
int mashaSalaryPerYear = mashaSalaryPerMonth * monthsInYear;
int denisSalaryPerYear = denisSalaryPerMonth * monthsInYear;
int kristinaSalaryPerYear = kristinaSalaryPerMonth * monthsInYear;

// Зарплата с добавкой 10% от текущей
double mashaSalaryPerMonthWithTenPercent = mashaSalaryPerMonth * 1.1;
double denisSalaryPerMonthWithTenPercent = denisSalaryPerMonth * 1.1;
double kristinaSalaryPerMonthWithTenPercent = kristinaSalaryPerMonth * 1.1;

// Годовой доход c повышение в 10% к текущей зарплате
double mashaSalaryPerYearWithTenPercent = mashaSalaryPerMonthWithTenPercent * monthsInYear;
double denisSalaryPerYearWithTenPercent = denisSalaryPerMonthWithTenPercent * monthsInYear;
double kristinaSalaryPerYearWithTenPercent = kristinaSalaryPerMonthWithTenPercent * monthsInYear;

// Разница в годовом доходе
double differenceMasha = mashaSalaryPerYearWithTenPercent - mashaSalaryPerYear;
double differenceDenis = denisSalaryPerYearWithTenPercent - denisSalaryPerYear;
double differenceKristina = kristinaSalaryPerYearWithTenPercent - kristinaSalaryPerYear;

// Вывод результатов в консоль
System.out.println("Маша теперь получает " + mashaSalaryPerMonthWithTenPercent + " рублей. Годовой доход вырос на " + differenceMasha + " рублей.");
System.out.println("Денис теперь получает " + denisSalaryPerMonthWithTenPercent + " рублей. Годовой доход вырос на " + differenceDenis + " рублей.");
System.out.println("Кристина теперь получает " + kristinaSalaryPerMonthWithTenPercent + " рублей. Годовой доход вырос на " + differenceKristina + " рублей.");
    }
}