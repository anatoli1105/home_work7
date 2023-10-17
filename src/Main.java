
public class Main {
    public static void main(String[] args) {
        String string="=========================";
       // Задача 1
       // С помощью цикла for выведите в консоль все числа от 1 до 10.
        int lenghtRound=10;
        for(int i =1;i<=lenghtRound;i++){
            System.out.print(i+",");
        }
        System.out.println("\n"+string);

        {
            /*С помощью цикла for выведите в консоль все числа от 10 до 1.*/
            for (int i = 0; i < lenghtRound; lenghtRound--) {
                System.out.print(lenghtRound + ",");
            }
        }

        System.out.println("\n"+string);
        {
            /*Выведите в консоль все четные числа от 0 до 17.*/
            lenghtRound =17;
            for (int i = 0; i < lenghtRound; i += 2) {
                System.out.print(i + ",");
            }
        }
        System.out.println("\n"+string);
        {
            /*Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.*/
            lenghtRound=-10;
            for(int i= 10;i>=lenghtRound;i--){
                System.out.print(i+",");
            }
        }
        System.out.println("\n"+string);
        /*Задача 5
        Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        В консоль результат должен выводиться в формате: «… год является високосным».*/
        int finishYear=2096;
        int startYeaar=1904;
        for(int i = startYeaar;i<finishYear;i+=4){
            System.out.println(i+"\t-год является високосным");
        }
        System.out.println("\n"+string);
        /*Напишите программу, которая выводит в консоль последовательность чисел:
         7 14 21 28 35 42 49 56 63 70 77 84 91 98*/
        int finishNumber=98;
        int step=7;
        for(int i = 0;i<=finishNumber;i+=step){
            System.out.print(i+",");
        }
        System.out.println("\n"+string);
        /*Задача 7
        Напишите программу, которая выводит в консоль последовательность чисел:
        1 2 4 8 16 32 64 128 256 512*/
        int stopRound=512;
        for(int i = 1;i<=stopRound;i*=2){
            System.out.print(i+",");
        }
        System.out.println("\n"+string);
        {
        /*Посчитайте с помощью цикла for сумму годовых накоплений,
        если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        Выведите сумму накоплений за каждый месяц в консоль в формате:
        «Месяц …, сумма накоплений равна … рублей».*/
            int accumulationMonth = 29_000;
            int countMonth = 12;
            for (int i = 1; i <= countMonth; i++) {
                switch (i) {
                    case 1:
                        System.out.println("за январь сумма накоплений равна " + accumulationMonth + "рублей");
                        break;
                    case 2:
                        System.out.println("за  февраль сумма накоплений равна " + accumulationMonth + "рублей");
                        break;
                    case 3:
                        System.out.println("за март сумма накоплений равна " + accumulationMonth + "рублей");
                        break;
                    case 4:
                        System.out.println("за апрель сумма накоплений равна " + accumulationMonth + "рублей");
                        break;
                    case 5:
                        System.out.println("за май сумма накоплений равна " + accumulationMonth + "рублей");
                        break;
                    case 6:
                        System.out.println("за июнь сумма накоплений равна " + accumulationMonth + "рублей");
                        break;
                    case 7:
                        System.out.println("за июль сумма накоплений равна " + accumulationMonth + "рублей");
                        break;
                    case 8:
                        System.out.println("за август сумма накоплений равна " + accumulationMonth + "рублей");
                        break;
                    case 9:
                        System.out.println("за сентябрь сумма накоплений равна " + accumulationMonth + "рублей");
                        break;
                    case 10:
                        System.out.println("за октябрь сумма накоплений равна " + accumulationMonth + "рублей");
                        break;
                    case 11:
                        System.out.println("за ноябрь сумма накоплений равна " + accumulationMonth + "рублей");
                        break;
                    case 12:
                        System.out.println("за декабрь сумма накоплений равна " + accumulationMonth + "рублей");
                        break;
                }
                accumulationMonth += accumulationMonth;
            }
        }
        System.out.println("\n"+string);
        /*Задача 9
        Перепишите решение задачи выше при условии,
        что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых. Выведите сумму накоплений
        за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».*/
        var accumulationMonth = 29_000;
        var bankInterestMonth=accumulationMonth* 0.01;
        int countMonth = 12;
        for (int i = 1; i <= countMonth; i++) {
            accumulationMonth += bankInterestMonth;
            switch (i) {
                case 1:
                    System.out.println("за январь сумма накоплений равна " + accumulationMonth + "рублей");
                    break;
                case 2:
                    System.out.println("за  февраль сумма накоплений равна " + accumulationMonth + "рублей");
                    break;
                case 3:
                    System.out.println("за март сумма накоплений равна " + accumulationMonth + "рублей");
                    break;
                case 4:
                    System.out.println("за апрель сумма накоплений равна " + accumulationMonth + "рублей");
                    break;
                case 5:
                    System.out.println("за май сумма накоплений равна " + accumulationMonth + "рублей");
                    break;
                case 6:
                    System.out.println("за июнь сумма накоплений равна " + accumulationMonth + "рублей");
                    break;
                case 7:
                    System.out.println("за июль сумма накоплений равна " + accumulationMonth + "рублей");
                    break;
                case 8:
                    System.out.println("за август сумма накоплений равна " + accumulationMonth + "рублей");
                    break;
                case 9:
                    System.out.println("за сентябрь сумма накоплений равна " + accumulationMonth + "рублей");
                    break;
                case 10:
                    System.out.println("за октябрь сумма накоплений равна " + accumulationMonth + "рублей");
                    break;
                case 11:
                    System.out.println("за ноябрь сумма накоплений равна " + accumulationMonth + "рублей");
                    break;
                case 12:
                    System.out.println("за декабрь сумма накоплений равна " + accumulationMonth + "рублей");
                    break;
            }

        }
        System.out.println("\n"+string);
        /*Задача 10
        Напишите программу, которая выводит в консоль таблицу умножения на 2:

        2*1=2 2*2=4 2*3=6 2*4=8 2*5=10 2*6=12 2*7=14 2*8=16 2*9=18 2*10=20*/
        int valueA=2;
        //int result;
        int lenght=10;
        for (int i = 1;i<=lenght;i++){
            int result=i*valueA;
            System.out.println(valueA+"*"+i+"="+result);
        }



    }
}