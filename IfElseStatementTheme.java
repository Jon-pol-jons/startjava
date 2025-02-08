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
            System.out.println("Первам буква именир совпадает с вашем именем");
        } else if (firstLetterName == 'I') {
            System.out.println("Ваша первая буква не совпадает с вашем именем");
        } else {
            System.out.println("Ошибка");
        }

        System.out.println("\n2. Поиск большего числа");
        int checkedNumber1 = 126;
        int checkedNumber2 = 86;
        if (checkedNumber1 > checkedNumber2) {
            System.out.println("число " + checkedNumber1 + " больше чем числа " + checkedNumber2);
        } else if (checkedNumber1 < checkedNumber2) {
            System.out.println("число " + checkedNumber1 + " меньше чем числа " + checkedNumber2);
        } else {
            System.out.println("число " + checkedNumber1 + " такое же, как и числа " + checkedNumber2);
        }

        System.out.println("\n3. проверка числа");
        checkedNumber1 = -56;
        if (checkedNumber1 != 0) {
            checkedNumber2 = checkedNumber1 % 2;
            String parityNumber = "";
            String positiveOrNegativeNumber = "";
            if (checkedNumber2 == 0) {
                parityNumber = "четным";
            } else if (checkedNumber2 != 0) {
                parityNumber = "не четным";
            }
            if (checkedNumber1 > 0) {
                positiveOrNegativeNumber = "положительное";
            } else {
                positiveOrNegativeNumber = "отрицательное ";
            }
            System.out.println(checkedNumber1 + " является " + positiveOrNegativeNumber +
                    " и " + parityNumber);
        } else {
            System.out.println(checkedNumber1 + " является нулем");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int number1Hundreds = 123;
        int number2Ones = 122;
        int numberAhundredCount = number1Hundreds / 100;
        int numberAtenCount = number1Hundreds % 100 / 10;
        int numberAunits = number1Hundreds % 10;
        int numberBhundredCount = number2Ones / 100;
        int numberBtenCount = number2Ones % 100 / 10;
        int numberBunits = number2Ones % 10;
        if (numberAhundredCount == numberBhundredCount || numberAtenCount == numberBtenCount ||
                numberAunits == numberBunits) {
            System.out.println("Исходные числа " + number1Hundreds + " и " + number2Ones);
            if (numberAhundredCount == numberBhundredCount) {
                System.out.println("Одинаковая цифра " + numberAhundredCount + " в разряде сотня");
            }
            if (numberAtenCount == numberBtenCount) {
                System.out.println("Одинаковая цифра " + numberAtenCount + " в разряде десятка");
            }
            if (numberAunits == numberBunits) {
                System.out.println("Одинаковая цифра " + numberAunits + " в разряде еденица");
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
        } else if (depositAmount > 100000 && depositAmount < 300000) {
            interestRate = 7.0F;
        }
        float apr = depositAmount * interestRate / 100;
        float yield = apr + depositAmount;
        System.out.println("Сумма вклада " + depositAmount);
        System.out.println("Сумма начисленного процента составит " + apr);
        System.out.println("Итоговая сумма с процентами составит " + yield);

        System.out.println("\n7. Определение оценки по предметам");
        int percentHistorySubject = 59;
        int percentProgrammingSubject = 92;
        int historyAssessment = 2;
        if (percentHistorySubject > 60 && percentHistorySubject <= 73) {
            historyAssessment = 3;
        } else if (percentHistorySubject > 73 && percentHistorySubject <= 91) {
            historyAssessment = 4;
        } else if (percentHistorySubject > 91) {
            historyAssessment = 5;
        }
        int programmingAssessment = 2;
        if (percentProgrammingSubject > 60 && percentProgrammingSubject <= 73) {
            programmingAssessment = 3;
        } else if (percentProgrammingSubject > 73 && percentProgrammingSubject <= 91) {
            programmingAssessment = 4;
        } else if (percentProgrammingSubject > 91) {
            programmingAssessment = 5;
        }
        float averageGradeSubjects = (programmingAssessment + historyAssessment) / 2f;
        float averagePercentSubjects = (percentHistorySubject + percentProgrammingSubject) / 2f;
        System.out.println("оценка по истории " + historyAssessment);
        System.out.println("оценка по программированию " + programmingAssessment);
        System.out.println("средний балл оценок по предметам " + averageGradeSubjects);
        System.out.println("средний % по предметам " + averagePercentSubjects + "%");

        System.out.println("\n8.Расчет годовой прибыли");
        float profitGross = 13025.233F;
        float rentPremises = 5123.018F;
        float costProduction = 9001.729F;
        float profitYearly = (profitGross - rentPremises - costProduction) * 12F;
        if (profitYearly > 0) {
            char plus = '+';
            System.out.println("годовая прибыль составляет " + plus + profitYearly + " руб.");
        } else {
            System.out.println("годовая прибыль составляет " + profitYearly + " руб.");
        }

        System.out.println("\n9. *Расчет годовой прибыли");
        var profitGrossBd = new BigDecimal(13025.233);
        var rentPremisesBd = new BigDecimal(5123.018);
        var costProductionBd = new BigDecimal(9001.729);
        var profitYearlyBd = (profitGrossBd.subtract(rentPremisesBd).subtract(costProductionBd)
                .multiply(BigDecimal.valueOf(12)).setScale(2, RoundingMode.HALF_UP));
        double newVariableBd = profitYearlyBd.floatValue();
        if (newVariableBd > 0) {
            char plus = '+';
            System.out.println("годовая прибыль составляет " + plus + profitYearlyBd + " руб.");
        } else {
            System.out.println("годовая прибыль составляет " + profitYearlyBd + " руб.");
        }

        System.out.println("\n10. *Подсчет начисленных банком %");
        float depositAmountBd = 321123.59F;
        float interestRateBd = 10.0F;
        if (depositAmountBd < 100000) {
            interestRateBd = 5.0F;
        } else if (depositAmountBd > 100000 && depositAmountBd < 300000) {
            interestRateBd = 7.0F;
        }
        var bufferInterestRateBd = new BigDecimal(interestRateBd);
        var bufferdepositAmountBd = new BigDecimal(depositAmountBd);
        var aprBd = (bufferdepositAmountBd.multiply(bufferInterestRateBd))
                .divide(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);
        var yieldBd = aprBd.add(bufferdepositAmountBd).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Сумма вклада " + depositAmountBd);
        System.out.println("Сумма начисленного процента составит " + aprBd);
        System.out.println("Итоговая сумма с процентами составит " + yieldBd);

        System.out.println("\n11. *Определение оценки по предметам");
        var percentHistorySubjectBd = new BigDecimal(59);
        var percentProgrammingSubjectBd = new BigDecimal(92);
        var averagePercentSubjectsBd = (percentHistorySubjectBd.add(percentProgrammingSubjectBd))
                .divide(BigDecimal.valueOf(2)).setScale(2, RoundingMode.HALF_UP);
        System.out.println("оценка по истории " + percentHistorySubjectBd);
        System.out.println("оценка по программированию " + percentProgrammingSubjectBd);
        System.out.println("средний % по предметам " + averagePercentSubjectsBd);
        var historiBufferBd = percentHistorySubjectBd.intValue();
        int historyAssessmentBd = 2;
        if (historiBufferBd > 60) {
            historyAssessmentBd = 3;
        }
        if (historiBufferBd > 73) {
            historyAssessmentBd = 4;
        }
        if (historiBufferBd > 91) {
            historyAssessmentBd = 5;
        }
        var programmingBuffer = percentProgrammingSubjectBd.intValue();
        int programmingAssessmentBd = 2;
        if (programmingBuffer > 60) {
            programmingAssessmentBd = 3;
        }
        if (programmingBuffer > 73) {
            programmingAssessmentBd = 4;
        }
        if (programmingBuffer > 91) {
            programmingAssessmentBd = 5;
        }
        var historiGradeScoreBd = new BigDecimal(historyAssessmentBd);
        var programmingGradeScoreBd = new BigDecimal(programmingAssessmentBd);
        var averageGradeSubjectsBd = (historiGradeScoreBd.add(programmingGradeScoreBd))
                .divide(BigDecimal.valueOf(2)).setScale(2, RoundingMode.HALF_UP);
        System.out.println("средний бал оценок по предметам " + averageGradeSubjectsBd);
    }
}
