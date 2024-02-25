import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int i = scanner.nextInt();
            if (i == 1) {
                System.out.println("Выполняется команда 1");
            } else if ( i == 2) {
                System.out.println("Выполняется команда 2");
            }else if ( i == 3) {
                System.out.println("Выполняется команда 3");
            }else if ( i == 4) {
                System.out.println("Пока!");
                scanner.close();
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

