
import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMan = true;
        if (!isMan) {
            System.out.println("поздравляю, в женщина");
        } else {
            System.out.println("вы мужчина");
        }
        int age = 18;
        if (age >= 17) {
            System.out.println("Поздравляю, ты стал совершенно летним");
        } else {
            System.out.println("Error: вам нет 18 лет");
        }
        float height = 1.72F;
        if (height < 1.8) {
            System.out.println("Вы низкий человек");
        } else {
            System.out.println("Вы высокий человек");
        }
        char firstLetterName = "Misha".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени совпадает с вашем именем");
        } else if (firstLetterName == 'I') {
            System.out.println("Ваша первая буква не совпадает с вашем именем");
        } else {
            System.out.println("Ошибка");
        }

        System.out.println("\n2. Поиск большего числа");
        int checkedNumber1 = 126;
        int checkedNumber2 = 86;
        if (checkedNumber1 > checkedNumber2) {
            System.out.println("число " + checkedNumber1 + " больше числа " + checkedNumber2);
        } else if (checkedNumber1 < checkedNumber2) {
            System.out.println("число " + checkedNumber1 + " меньше числа " + checkedNumber2);
        } else {
            System.out.println("число " + checkedNumber1 + " такое же, как и число " + checkedNumber2);
        }

        System.out.println("\n3. проверка числа");
        int checkedNumber = 57;
        if (checkedNumber != 0) {
            String parityNumber = "четным";
            if (checkedNumber % 2 != 0) {
                parityNumber = "не четным";
            }
            String positiveOrNegativeNumber = "положительным";
            if (checkedNumber < 0) {
                positiveOrNegativeNumber = "отрицательным";
            }
            System.out.println(checkedNumber + " является " + positiveOrNegativeNumber +
                    " и " + parityNumber);
        } else {
            System.out.println(checkedNumber + " является нулем");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        checkedNumber1 = 123;
        checkedNumber2 = 122;
        int numberAhundred = checkedNumber1 / 100;
        int numberAten = checkedNumber1 % 100 / 10;
        int numberAones = checkedNumber1 % 10;
        int numberBhundred = checkedNumber2 / 100;
        int numberBten = checkedNumber2 % 100 / 10;
        int numberBones = checkedNumber2 % 10;
        if (numberAhundred == numberBhundred || numberAten == numberBten ||
                numberAones == numberBones) {
            System.out.println("Исходные числа " + checkedNumber1 + " и " + checkedNumber2);
            if (numberAhundred == numberBhundred) {
                System.out.println("Одинаковая цифра " + numberAhundred + " в разряде сотня");
            }
            if (numberAten == numberBten) {
                System.out.println("Одинаковая цифра " + numberAten + " в разряде десятка");
            }
            if (numberAones == numberBones) {
                System.out.println("Одинаковая цифра " + numberAones + " в разряде единица");
            }
        } else {
            System.out.println("Совпадений не найдено");
        }

        System.out.println("\n5.Определение символа по его коду");
        char symbol = '\u0031';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + " - маленькая буква");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + " -  большая буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " - цифра");
        } else {
            System.out.println(symbol + " - ни буква и ни цифра");
        }

        System.out.println("\n6. Подсчет начисленных банком %");
        float depositAmount = 321123.59F;
        float interestRate = 10.0F;
        if (depositAmount < 100000) {
            interestRate = 5.0F;
        } else if (depositAmount >= 100000 && depositAmount <= 300000) {
            interestRate = 7.0F;
        }
        float apr = depositAmount * interestRate / 100;
        float yield = apr + depositAmount;
        System.out.println("Сумма вклада " + depositAmount);
        System.out.println("Сумма начисленного процента составит " + apr);
        System.out.println("Итоговая сумма с процентами составит " + yield);

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int historyGrade = 2;
        if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else if (historyPercent > 91) {
            historyGrade = 5;
        }
        int programmingPercent = 92;
        int programmingAssessment = 2;
        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingAssessment = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingAssessment = 4;
        } else if (programmingPercent > 91) {
            programmingAssessment = 5;
        }
        float averageGradeSubjects = (programmingAssessment + historyGrade) / 2f;
        float averagePercentSubjects = (historyPercent + programmingPercent) / 2f;
        System.out.println("оценка по истории " + historyGrade);
        System.out.println("оценка по программированию " + programmingAssessment);
        System.out.println("средний балл оценок по предметам " + averageGradeSubjects);
        System.out.println("средний % по предметам " + averagePercentSubjects + "%");

        System.out.println("\n8.Расчет годовой прибыли");
        float profitGross = 13025.233F;
        float rentPremises = 5123.018F;
        float costProduction = 9001.729F;
        float profitYearly = (profitGross - rentPremises - costProduction) * 12;
        if (profitYearly > 0) {
            System.out.println("годовая прибыль составляет +" + profitYearly + " руб.");
        } else {
            System.out.println("годовая прибыль составляет " + profitYearly + " руб.");
        }

        System.out.println("\n9. *Расчет годовой прибыли");
        var profitGrossBd = new BigDecimal("13025.233");
        var rentPremisesBd = new BigDecimal("5123.018");
        var costProductionBd = new BigDecimal("9001.729");
        var profitYearlyBd = (profitGrossBd.subtract(rentPremisesBd).subtract(costProductionBd)
                .multiply(BigDecimal.valueOf(12)).setScale(2, RoundingMode.HALF_UP));
        System.out.printf("годовая прибыль составляет %+.2f руб", profitYearlyBd);

        System.out.println("\n\n10. *Подсчет начисленных банком %");
        float depositAmountBd = 321123.59F;
        float interestRateBd = 10.0F;
        if (depositAmountBd < 100000) {
            interestRateBd = 5.0F;
        } else if (depositAmountBd >= 100000 && depositAmountBd <= 300000) {
            interestRateBd = 7.0F;
        }
        var interestRateBd2 = new BigDecimal(interestRateBd);
        var depositAmountBd2 = new BigDecimal(depositAmountBd);
        var aprBd = (depositAmountBd2.multiply(interestRateBd2))
                .divide(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);
        var yieldBd = aprBd.add(depositAmountBd2).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Сумма вклада " + depositAmountBd);
        System.out.println("Сумма начисленного процента составит " + aprBd);
        System.out.println("Итоговая сумма с процентами составит " + yieldBd);
    }
}
