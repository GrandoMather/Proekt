import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printmenu();
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Выполняется команда 1");
                stepTracker.addNewNumberStepsPerDay();
            } else if ( command == 2) {
                System.out.println("Выполняется команда 2");
                stepTracker.changeStepGoal();
            }else if ( command == 3) {
                System.out.println("Выполняется команда 3");
                stepTracker.printStatistic();
            }else if ( command == 4) {
                System.out.println("Пока!");
                return;
            }else {
                System.out.println("Такой команды нет");
            }
        }
    }
    static void printmenu(){
        System.out.println("1 - Количество шагов за определенный день.");
        System.out.println("2 - изменить цель по шагам в день. ");
        System.out.println("3 - напечатать статистику за определенный месяц.");
        System.out.println("0 - выйти.");
    }

}

