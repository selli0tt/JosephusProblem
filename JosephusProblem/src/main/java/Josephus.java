
import java.util.*;
import java.util.List;

public class Josephus {

    public static int removeEveryOther(int n){

        if (n == 1)
            return 1;
        if (n % 2 == 0)
            return 2 * removeEveryOther(n / 2) - 1;
        else
            return 2 * removeEveryOther(((n - 1) / 2)) + 1;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("The Josephus Problem:  Where should you stand?");
        System.out.print("Enter the number of people in your party: ");

        String numberOfPeople = scanner.nextLine();
        int people = Integer.parseInt(numberOfPeople);

        List<Integer> amountOfPeople = new ArrayList<>();   //generating a list to hold amount of people

        for (int i = 1; i <= people; i++){  //populating list with people
            amountOfPeople.add(i);
            System.out.print(amountOfPeople.size() + " ");
        }

        System.out.println("\n" + "Stand in position number " + removeEveryOther(amountOfPeople.size()) + ". \nYou're welcome.");
    }

}


////////////////////////////Mathematical way of finding solution

//        int logBaseTwoOfUserInput = (int) (Math.log(people) / Math.log(2));
//
//        if (people == 1) {
//            System.out.println(people);
//        } else {
//            int standHere = 2 * ((int) (people - Math.pow(2, Math.floor(logBaseTwoOfUserInput)))) + 1;
//            System.out.println(standHere);
//        }
//    }
//}