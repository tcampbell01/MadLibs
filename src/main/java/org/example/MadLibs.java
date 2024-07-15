package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MadLibs {

    private static void tellStory(String randomVerb1, String randomVerb2, String randomVerb3,
                                  String randomVerb4, String randomVerb5, String randomNoun1,
                                  String randomNoun2, String randomNoun3, String randomNoun4,
                                  String randomNoun5, String randomAdjective1,
                                  String randomAdjective2, String randomAdjective3,
                                  String randomAdjective4, String randomAdjective5,
                                  String randomPluralNoun1, String randomPluralNoun2,
                                  String randomPluralNoun3, String randomPluralNoun4,
                                  String randomPluralNoun5, Scanner scanner) {

        System.out.println("Before I tell you a story, I need to ask you a couple more questions:");
        System.out.println();
        System.out.println("Please give me a verb ending in 'ING'");

        String verbEndingInING = null;
        if (scanner.hasNext()) {
            verbEndingInING = scanner.next();
        }
        System.out.println("Great! Now give me a silly word");

        String sillyWord = null;
        if (scanner.hasNext()) {
            sillyWord = scanner.next();
        }

        System.out.println();
        System.out.println("Almost done! Now give me a person in the room.");

        String personInTheRoom1 = null;
        if (scanner.hasNext()) {
            personInTheRoom1 = scanner.next();
        }
        System.out.println("And one more...");

        String personInTheRoom2 = null;
        if (scanner.hasNext()) {
            personInTheRoom2 = scanner.next();
        }
        System.out.println("Ok... one more...hee..hee..hee");

        String personInTheRoom3 = null;
        if (scanner.hasNext()) {
            personInTheRoom3 = scanner.next();
        }

        System.out.println();
        System.out.println("Ok! I think we are ready for the story! Here goes!... Ahem. This " +
                "story is " +
                "called, 'The Garage Band'");
        System.out.println("By Yours Truly (that's me!)");
        System.out.println();
        System.out.println(
                "Dad plays a(n) " + randomAdjective1 + " piano. A(n) " + randomAdjective2 +
                        " musician, he's equally at home with rock 'n' " + randomVerb1 +
                        " as he is with classical " + randomNoun1 + ".");
        System.out.println("Mom has a remarkable " + verbEndingInING + " voice and was the lead " +
                randomNoun2 + " in her college choir.  She never failed to hit a(n) " +
                randomAdjective2 + " note.");
        System.out.println("Music flows through our family's " + randomPluralNoun1 + " - with the" +
                " exception of Cousin Joel, who doesn't have a(n) " + randomAdjective3 + " ear " +
                "for music and can't carry a(n) " + randomNoun3 + ".");
        System.out.println("But believe it or not, he just formed a garage band. They are called " +
                "the " + sillyWord + " " + randomPluralNoun2 + ".");
        System.out.println("Fortunately, Joel's only the " + randomAdjective4 + " manager. Three " +
                "of our other cousins make up the " + randomAdjective5 + " band.");
        System.out.println(personInTheRoom1 + " plays guitar, " + personInTheRoom2 + " plays " +
                "bass, and " + personInTheRoom3 + " plays the " + randomPluralNoun4 + ".");
        System.out.println("It's been only three weeks since they got together and they've " +
                "already been booked at the local police " + randomNoun4 + " for disturbing the " + randomNoun5 + ".");
        System.out.println("The End.");
    }

    public static void collectNouns(Scanner scanner, ArrayList<String> nounsArray) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter a noun.");
            if (scanner.hasNext()) {
                String noun = scanner.next();
                nounsArray.add(noun);
            }
        }
        System.out.println("Thank you! You gave me: " + nounsArray);
    }

    public static void collectAdjectives(Scanner scanner, ArrayList<String> adjectivesArray) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter an adjective.");
            if (scanner.hasNext()) {
                String adjective = scanner.next();
                adjectivesArray.add(adjective);
            }
        }
        System.out.println("Thank you! You gave me: " + adjectivesArray);
    }

    public static void collectVerbs(Scanner scanner, ArrayList<String> verbsArray) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter a verb.");
            if (scanner.hasNext()) {
                String verb = scanner.next();
                verbsArray.add(verb);
            }
        }
        System.out.println("Thank you! You gave me: " + verbsArray);
    }

    public static void collectPluralNouns(Scanner scanner, ArrayList<String> pluralNounsArray) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter a plural noun.");
            if (scanner.hasNext()) {
                String pluralNoun = scanner.next();
                pluralNounsArray.add(pluralNoun);
            }
        }
        System.out.println("Thank you! You gave me: " + pluralNounsArray);
    }

    public static String[] generateRandomElements(ArrayList<String> array) {
        int numElements = 5;
        String[] randomElements = new String[numElements]; // Array to store the random elements

        // Check if the list is not empty and has enough elements
        if (array == null || array.size() < numElements) {
            System.out.println("The array does not have enough elements.");
            return randomElements;
        }

        Random random = new Random();
        for (int i = 0; i < numElements; i++) {
            int randomIndex = random.nextInt(array.size());
            randomElements[i] = array.get(randomIndex); // Save the random element to the array
            array.remove(randomIndex); // Remove the selected element to avoid duplicates
        }

        return randomElements;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nounsArray = new ArrayList<>();
        ArrayList<String> verbsArray = new ArrayList<>();
        ArrayList<String> adjectivesArray = new ArrayList<>();
        ArrayList<String> pluralNounsArray = new ArrayList<>();

        collectNouns(scanner, nounsArray);
        collectVerbs(scanner, verbsArray);
        collectAdjectives(scanner, adjectivesArray);
        collectPluralNouns(scanner, pluralNounsArray);

        String[] randomNouns = generateRandomElements(nounsArray);
        String[] randomVerbs = generateRandomElements(verbsArray);
        String[] randomAdjectives = generateRandomElements(adjectivesArray);
        String[] randomPluralNouns = generateRandomElements(pluralNounsArray);

        tellStory(randomVerbs[0], randomVerbs[1], randomVerbs[2], randomVerbs[3], randomVerbs[4],
                randomNouns[0], randomNouns[1], randomNouns[2], randomNouns[3], randomNouns[4],
                randomAdjectives[0], randomAdjectives[1], randomAdjectives[2], randomAdjectives[3],
                randomAdjectives[4], randomPluralNouns[0], randomPluralNouns[1], randomPluralNouns[2],
                randomPluralNouns[3], randomPluralNouns[4], scanner);
    }
}
