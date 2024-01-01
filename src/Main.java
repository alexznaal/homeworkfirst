public class Main {
    public static void main(String[] args) {
        //task1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper - 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task3
        dog =  dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
        //task 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //task 6
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var weightDifference = Math.abs(weightFirstBoxer - weightSecondBoxer);
        System.out.println("Разница между боксерами " + weightDifference);
        //task 7
        weightDifference = weightSecondBoxer - weightFirstBoxer;
        System.out.println(weightDifference);
        weightDifference = weightSecondBoxer % weightFirstBoxer;
        System.out.println(weightDifference);
        //task 8
        var allHours = 640;
        var amountEmployee = allHours / 8;
        System.out.println("Всего сотрудников в компании "+amountEmployee+" человек.");
        var newAmount = amountEmployee + 94;
        var newHours = newAmount * 8;
        System.out.println("Если в компании работает " + newAmount + " человек, то всего " + newHours + " часов работы может быть поделено между сотрудниками");
    }
}