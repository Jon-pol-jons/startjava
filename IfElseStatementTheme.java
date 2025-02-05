import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 18;
        float height = 1.72F;
        boolean men = true;
        if (!men) {
            System.out.println("поздравляю, в женщина");
        } else {
            System.out.println("вы мужчина");
        }
        if (age >= 17) {
            System.out.println("Поздравляю, ты стал совершенно летним");
        } else {
            System.out.println("Error: вам нет 18 лет");
        }
        if (height < 1.8) {
            System.out.println("Вы низкий человек");
        } else {
            System.out.println("Вы высокий человек");
        }
        char firstLatterName = "Misha".charAt(0);
        if (firstLatterName == 'M') {
            System.out.println("Первам буква именир совпадает с вашем именем");
        } else if (firstLatterName == 'I') {
            System.out.println("Ваша первая буква не совпадает с вашем именем");
        } else {
            System.out.println("Ошибка");
        }

        System.out.println("\n 2. Поиск большего числа");
        int randomNumber1 = 126;
        int randomNumber2 = 86;
        if (randomNumber1 > randomNumber2) {
            System.out.println("число " + randomNumber1 + " больше чем число " + randomNumber2);
        } else if (randomNumber1 < randomNumber2) {
            System.out.println("число " + randomNumber1 + " меньше чем число " + randomNumber2);
        } else if (randomNumber1 == randomNumber2) {
            System.out.println("число " + randomNumber1 + " такое же, как и число " + randomNumber2);
        }

        System.out.println("\n3. проверка числа");
        int numberInteger = 56;
        if (numberInteger != 0) {
            System.out.println(numberInteger + " не является нулем");
            int buf = numberInteger % 2;
            switch (buf) {
                case 0:
                    if (numberInteger < 0) {
                        System.out.println(numberInteger + " является отрицательным и четным числом");
                    } else if (numberInteger > 0) {
                        System.out.println(numberInteger + " является полежительным и четным числом");
                    }
                    break;
                case 1:
                    if (numberInteger < 0) {
                        System.out.println(numberInteger + " является отрицательным и не четным числом");
                    } else if (numberInteger > 0) {
                        System.out.println(numberInteger + " является полежительным и не четным числом");
                    }
                    break;
            }
            if (numberInteger < 0) {
                System.out.println(numberInteger + " является отрицательным числом");
            } else if (numberInteger > 0) {
                System.out.println(numberInteger + " является полежительным числом");
            }
        } else {
            System.out.println(numberInteger + " является нулем");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int numberA = 123;
        int numberB = 122;
        int numberAhundredCount = numberA / 100;
        int numberAtenCount = numberA % 100 / 10;
        int numberAunits = numberA % 10;
        int numberBhundredCount = numberB / 100;
        int numberBtenCount = numberB % 100 / 10;
        int numberBunits = numberB % 10;
        if (numberAhundredCount == numberBhundredCount || numberAtenCount == numberBtenCount ||
                numberAunits == numberBunits) {
            System.out.println("Исходные числа " + numberA + " и " + numberB);
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
            System.out.println(symbol + " - буква маленькая");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + " - буква большая");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " - цифра");
        } else {
            System.out.println(symbol + " - ни буква и ни цифра");
        }

        System.out.println("\n6. Подсчет начисленных банком %");
        float depositAmount = 321123.59F;
        float interestRate = 0.0F;
        if (depositAmount < 100000) {
            interestRate = 5.0F;
        }
        if (depositAmount > 100000 && depositAmount < 300000) {
            interestRate = 7.0F;
        }
        if (depositAmount > 300000) {
            interestRate = 10.0F;
        }
        float percentNumber = depositAmount * interestRate / 100;
        float sumFinal = percentNumber + depositAmount;
        System.out.println("Сумма вклада " + depositAmount);
        System.out.println("Сумма начисленного процента составит " + percentNumber);
        System.out.println("Итоговая сумма с процентами составит " + sumFinal);

        System.out.println("\n7. Определение оценки по предметам");
        int historySubject = 59;
        int historyAssessment = 0;
        if (historySubject <= 60) {
            historyAssessment = 2;
        }
        if (historySubject > 60) {
            historyAssessment = 3;
        }
        if (historySubject > 73) {
            historyAssessment = 4;
        }
        if (historySubject > 91) {
            historyAssessment = 5;
        }
        int programmingSubject = 92;
        int programmingAssessment = 0;
        if (programmingSubject <= 60) {
            programmingAssessment = 2;
        }
        if (programmingSubject > 60) {
            programmingAssessment = 3;
        }
        if (programmingSubject > 73) {
            programmingAssessment = 4;
        }
        if (programmingSubject > 91) {
            programmingAssessment = 5;
        }
        float averageScoreSubjects = (programmingAssessment + historyAssessment) / 2f;
        float averagePercentSubjects = (historySubject + programmingSubject) / 2f;
        System.out.println("Оценка по истории " + historyAssessment);
        System.out.println("Оценка по программированию " + programmingAssessment);
        System.out.println("Cредний бал оценок по предметам " + averageScoreSubjects);
        System.out.println("средний % по предметам " + averagePercentSubjects + "%");

        System.out.println("\n8.Расчет годовой прибыли");
        float profitGross = 13025.233F;
        float rentPremises = 5123.018F;
        float costProduction = 9001.729F;
        float profitYearly = (profitGross - rentPremises - costProduction) * 12F;
        if (profitYearly > 0) {
            System.out.println("годовая прибыль составляет " + "+" + profitYearly + " руб.");
        } else {
            System.out.println("годовая прибыль составляет " + profitYearly + " руб.");
        }

        System.out.println("\n9. *Расчет годовой прибыли");
        var profitGrossBd = new BigDecimal(13025.233);
        var rentPremisesBd = new BigDecimal(5123.018);
        var costProductionBd = new BigDecimal(9001.729);
        var oneYear = new BigDecimal(12);
        var profitYearlyBd = profitGrossBd.subtract(rentPremisesBd).subtract(costProductionBd);
        profitYearlyBd = profitYearlyBd.multiply(oneYear).setScale(2, RoundingMode.HALF_UP);
        double newVariableBd = profitYearlyBd.floatValue();
        if (newVariableBd > 0) {
            System.out.println("годовая прибыль составляет " + "+" + profitYearlyBd + " руб.");
        } else {
            System.out.println("годовая прибыль составляет " + profitYearlyBd + " руб.");
        }

        System.out.println("\n10. *Подсчет начисленных банком %");
        float depositAmountBd = 321123.59F;
        float interestRateBd = 0.0F;
        if (depositAmountBd < 100000) {
            interestRateBd = 5.0F;
        }
        if (depositAmountBd > 100000 && depositAmountBd < 300000) {
            interestRateBd = 7.0F;
        }
        if (depositAmountBd > 300000) {
            interestRateBd = 10.0F;
        }
        var variableBufferInterestRateBd = new BigDecimal(interestRateBd);
        var variableBufferdepositAmountBd = new BigDecimal(depositAmountBd);
        var percentNumberBd = variableBufferdepositAmountBd.multiply(variableBufferInterestRateBd);
        percentNumberBd = percentNumberBd.divide(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);
        var sumFinalBd = percentNumberBd.add(variableBufferdepositAmountBd).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Сумма вклада " + depositAmountBd);
        System.out.println("Сумма начисленного процента составит " + percentNumberBd);
        System.out.println("Итоговая сумма с процентами составит " + sumFinalBd);

        System.out.println("\n11. *Определение оценки по предметам");
        var historySubjectBd = new BigDecimal(59);
        var programmingSubjectBd = new BigDecimal(92);
        var averagePercentSubjectsBd = historySubjectBd.add(programmingSubjectBd);
        averagePercentSubjectsBd = averagePercentSubjectsBd.divide(BigDecimal.valueOf(2))
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println("оценка по истории " + historySubjectBd);
        System.out.println("оценка по программированию " + programmingSubjectBd);
        System.out.println("средний % по предметам " + averagePercentSubjectsBd);
        var historiBufferVariableBd = historySubjectBd.intValue();
        int historyAssessmentBd = 0;
        if (historiBufferVariableBd <= 60) {
            historyAssessmentBd = 2;
        }
        if (historiBufferVariableBd > 60) {
            historyAssessmentBd = 3;
        }
        if (historiBufferVariableBd > 73) {
            historyAssessmentBd = 4;
        }
        if (historiBufferVariableBd > 91) {
            historyAssessmentBd = 5;
        }
        var programmingBufferVariable = programmingSubjectBd.intValue();
        int programmingAssessmentBd = 0;
        if (programmingBufferVariable <= 60) {
            programmingAssessmentBd = 2;
        }
        if (programmingBufferVariable > 60) {
            programmingAssessmentBd = 3;
        }
        if (programmingBufferVariable > 73) {
            programmingAssessmentBd = 4;
        }
        if (programmingBufferVariable > 91) {
            programmingAssessmentBd = 5;
        }
        var historiAverageScoreBd = new BigDecimal(historyAssessmentBd);
        var programmingAverageScoreBd = new BigDecimal(programmingAssessmentBd);
        var sumAverageScoreBd = historiAverageScoreBd.add(programmingAverageScoreBd);
        sumAverageScoreBd = sumAverageScoreBd.divide(BigDecimal.valueOf(2)).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Cредний бал оценок по предметам " + sumAverageScoreBd);
    }
}
