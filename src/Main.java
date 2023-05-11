public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то он совершеннолетний!");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то он не достиг совершеннолетия, нужно немного подождать!");
        }

        // Задача 2
        int degrees = 5;
        if (degrees <= 5) {
            System.out.println("На улице " + degrees + " градусов, нужно надеть шапку.");
        }
        if (degrees > 5) {
            System.out.println("На улице " + degrees + " градусов, можно идти без шапки!");
        }

        // Задача 3
        int speed = 61;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можешь ездить спокойно.");
        }
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф!");
        }

        // Задача 4
        int ageOfThePerson = 61;
        if (ageOfThePerson < 2) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + " лет, то ему пора спать.");
        } else if (ageOfThePerson >= 2 && ageOfThePerson <= 6) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + " лет, то ему нужно ходить в детский сад.");
        } else if (ageOfThePerson >=7 && ageOfThePerson <= 18) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + " лет, то ему нужно ходить в школу.");
        } else if (ageOfThePerson >18 && ageOfThePerson <= 24) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + " лет, то ему нужно ходить в университет.");
        } else if (ageOfThePerson > 24 && ageOfThePerson <= 60) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + " лет, то ему нужно ходит на работу.");
        } else if (ageOfThePerson > 60) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + " лет, то ему можно отдохнуть.");
        }

        // Задача 5
        int ageChildren = 3;
        if (ageChildren < 5) {
            System.out.println("Если возраст ребенка " + ageChildren + " лет, то кататься на аттракционнах НЕЛЬЗЯ!.");
        } else if (ageChildren >= 5 && ageChildren <= 14) {
            System.out.println("Если возраст ребенка " + ageChildren + " лет, то кататься на аттракционнах можно в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка " + ageChildren + " лет, то кататься на аттракционнах можно.");
        }

        // Задача 6
        int passengers = 54;
        int seat = 60;
        int trainCarCapacity = 102;
        if (passengers <= seat) {
            System.out.println("В вагоне есть сидячие места.");
        } else if (passengers > seat && passengers <= trainCarCapacity) {
            System.out.println("В вагоне есть стоячие места, сидячие места заняты.");
        } else {
            System.out.println("В вагоне нет свободных мест.");
        }
        // Задача 7
        int one = 105;
        int two = 106;
        int three = 98;
        if (two > one && two > three) {
            System.out.println("Наибольшее значение " + two);
        } else if (three > two && three > one) {
            System.out.println("Наибольшее значение " + three);
        } else {
            System.out.println("Наибольшее значение " + one);
        }

    }
}