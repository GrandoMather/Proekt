import java.util.Scanner;
public class StepTracker {
    Scanner scanner;
    MonthData[] monthData = new MonthData[12];
    int goalbyStepsPerDay = 10000;

    StepTracker(Scanner scan) {
        scanner = scan;
        for (int i = 0; i < monthData.length; i++) {
            monthData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int monthNumber = scanner.nextInt();
        if (monthNumber <= 0 || monthNumber > 12) {
            System.out.println("Номер месяца веден некорректно.");
            return;
        }
        System.out.println("Введите день от 1 до 30 (включительно)");
        int dayNumber = scanner.nextInt();
        if (dayNumber <= 0 || dayNumber >= 31) {
            return;
        }
        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();
        if (steps <= 0) {
            return;
        }
        MonthData month = monthData[monthNumber - 1];
        month.days[dayNumber - 1] += steps;

    }

    void changeStepGoal(int newGoal) {
        if (newGoal > 0) {
            goalbyStepsPerDay = newGoal;
            System.out.println("Ваша цель сейчас :" + newGoal);
            return;
        } else {
            System.out.println("Шаги не должны быть равны или меньше нуля.");
            return;
        }
    }

    void printStatistic() {
        System.out.println("Введите число месяца");
        int monthNumber = scanner.nextInt();
        if (monthNumber <= 0 || monthNumber > 12) {
            System.out.println("Введен не корректный номер месяца.");
            return;
        }
        MonthData month = monthData[monthNumber - 1];
        int sumSteps = month.sumStepsFromMonth();
        System.out.println("Общее количество шагов за месяц:" + sumSteps);
        System.out.println("Количество пройденных шагов по дням:");
        addNewNumberStepsPerDay();
        System.out.println("Количество пройденных шагов за месяц: ");
        addNewNumberStepsPerDay();
        int maxSteps = month.maxSteps();
        System.out.println("Максимальное пройденное количество шагов за месяц:" + maxSteps);
        int  avgSteps = sumSteps / 2;
        System.out.println("Среднее пройденное количество шагов за месяц:" + avgSteps);
        Converter converter = new Converter();
        int distanshion = converter.convertToKm(sumSteps);
        System.out.println("Пройденное количество шагов в киллометрах:"  + distanshion);
        int kilocallories = converter.converterStepsTokilocallories(sumSteps);
        System.out.println("Количество сожжённых килокалорий за месяц:" + kilocallories);
        int bestSeries = month.bestSeries(goalbyStepsPerDay);
        System.out.println("Лучшая серия:" + bestSeries);
    }
}
