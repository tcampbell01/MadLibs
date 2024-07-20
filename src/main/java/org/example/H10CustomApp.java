///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Mad Libs
// Course:          CS 200, Summer 2024
//
// Author:          Teresa Campbell
// Email:           tjcampbe@wisc.edu
// Lecturer's Name: Prof. Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// I used chatGPT to learn how to use import java.util.concurrent.TimeUnit;
//
///////////////////////////////// REFLECTION ///////////////////////////////////
//
// 1. This app takes in input of nouns, verbs, adjectives, etc to tell a mad
// Libs story

// 2. I always seem to get stuck in infinite loops when I try to submit my
// project on zybooks.  I'm turning this in before I had a chance to figure it
// out-- I've been working on it trying to get zybooks to like my code for 5
//hours
//
//
//
//
// 3. What did you learn from this assignment: How to use junit for testing.
//
// I got a lot better at writing separate methods and tests
//
//
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////
package org.example;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * A class that handles the creation and management of a Mad Libs story.
 *
 * This class provides methods to collect various types of words (nouns, verbs,
 * adjectives, plural nouns) from the user, generates random selections from
 * these words,
 * and tells a Mad Libs story using the collected and randomly selected words.
 */
public class H10CustomApp {

    /**
     * Tells a Mad Libs story using the provided words and a scanner for
     * additional user input.
     *
     * @param randomVerb1       A random verb.
     * @param randomVerb2       A random verb.
     * @param randomVerb3       A random verb.
     * @param randomVerb4       A random verb.
     * @param randomVerb5       A random verb.
     * @param randomNoun1       A random noun.
     * @param randomNoun2       A random noun.
     * @param randomNoun3       A random noun.
     * @param randomNoun4       A random noun.
     * @param randomNoun5       A random noun.
     * @param randomAdjective1  A random adjective.
     * @param randomAdjective2  A random adjective.
     * @param randomAdjective3  A random adjective.
     * @param randomAdjective4  A random adjective.
     * @param randomAdjective5  A random adjective.
     * @param randomPluralNoun1 A random plural noun.
     * @param randomPluralNoun2 A random plural noun.
     * @param randomPluralNoun3 A random plural noun.
     * @param randomPluralNoun4 A random plural noun.
     * @param randomPluralNoun5 A random plural noun.
     * @param scanner           A Scanner object for additional user input.
     * @throws InterruptedException If the thread is interrupted while sleeping.
     */
    //not all inputs are used in this story.  Leaving as is in case I want to
    //add more stories in the future.
    static void tellStory(String randomVerb1, String randomVerb2,
                          String randomVerb3, String randomVerb4, String
                                  randomVerb5,
                          String randomNoun1, String randomNoun2, String
                                  randomNoun3,
                          String randomNoun4, String randomNoun5,
                          String randomAdjective1, String randomAdjective2,
                          String randomAdjective3, String randomAdjective4,
                          String randomAdjective5,
                          String randomPluralNoun1, String randomPluralNoun2,
                          String randomPluralNoun3, String randomPluralNoun4,
                          String randomPluralNoun5, Scanner scanner)
            throws InterruptedException {


        System.out.println("Please give me a verb ending in 'ING'");
        String verbEndingInING;
        try {
            if (scanner.hasNextLine()) {
                verbEndingInING = scanner.nextLine().trim();
            }
            else {
                throw new IllegalStateException("No input provided.");
            }
        } catch (IllegalStateException e) {
            System.out.println("An error occurred: " + e.getMessage());
            verbEndingInING = "running"; // Default value
        }

        // Collect silly word
        System.out.println("Great! Now give me a silly word");
        String sillyWord;
        try {
            if (scanner.hasNextLine()) {
                sillyWord = scanner.nextLine().trim();
            }
            else {
                throw new IllegalStateException("No input provided.");
            }
        } catch (IllegalStateException e) {
            System.out.println("An error occurred: " + e.getMessage());
            sillyWord = "fizz"; // Default value
        }

        // Collect person in the room
        System.out.println("Almost done! Now give me a person in the room.");
        String personInTheRoom1;
        try {
            if (scanner.hasNextLine()) {
                personInTheRoom1 = scanner.nextLine().trim();
            }
            else {
                throw new IllegalStateException("No input provided.");
            }
        } catch (IllegalStateException e) {
            System.out.println("An error occurred: " + e.getMessage());
            personInTheRoom1 = "John"; // Default value
        }

        // Collect another person in the room
        System.out.println("And one more...");
        String personInTheRoom2;
        try {
            if (scanner.hasNextLine()) {
                personInTheRoom2 = scanner.nextLine().trim();
            }
            else {
                throw new IllegalStateException("No input provided.");
            }
        } catch (IllegalStateException e) {
            System.out.println("An error occurred: " + e.getMessage());
            personInTheRoom2 = "Jane"; // Default value
        }

        // Collect another person in the room
        System.out.println("Ok... one more...hee..hee..hee");
        String personInTheRoom3;
        try {
            if (scanner.hasNextLine()) {
                personInTheRoom3 = scanner.nextLine().trim();
            }
            else {
                throw new IllegalStateException("No input provided.");
            }
        } catch (IllegalStateException e) {
            System.out.println("An error occurred: " + e.getMessage());
            personInTheRoom3 = "Alex"; // Default value
        }

        System.out.println("This story is called, 'The Garage Band'");
        System.out.println("By Yours Truly (that's me!)");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Ahem...");
        TimeUnit.SECONDS.sleep(5);

        System.out.println("Dad plays a(n) " + randomAdjective1 + " piano. " +
                "A(n) " +
                randomAdjective2 + " musician, he's equally at home with rock " +
                "'n' " +
                randomVerb1 + " as he is with classical " + randomNoun1 + ".");
        TimeUnit.SECONDS.sleep(10);

        System.out.println("Mom has a remarkable " + verbEndingInING + " " +
                "voice " +
                "and was the lead " +
                randomNoun2 + " in her college choir. She never failed to " +
                "hit " +
                "a(n) " +
                randomAdjective2 + " note.");
        TimeUnit.SECONDS.sleep(10);

        System.out.println("Music flows through our family's " +
                randomPluralNoun1 + " - with the" +
                " exception of Cousin Joel, who doesn't have a(n) " +
                randomAdjective3 +
                " ear for music and can't carry a(n) " + randomNoun3 + ".");
        TimeUnit.SECONDS.sleep(10);

        System.out.println("But believe it or not, he just formed a garage " +
                "band. They are called " +
                "the " + sillyWord + " " + randomPluralNoun2 + ".");
        System.out.println("Fortunately, Joel's only the " +
                randomAdjective4 +
                " manager. Three of our other cousins make up the " +
                randomAdjective5 +
                " band.");
        TimeUnit.SECONDS.sleep(10);

        System.out.println(personInTheRoom1 + " plays guitar, " +
                personInTheRoom2 + " plays bass, and " +
                personInTheRoom3 + " " +
                "plays the " + randomPluralNoun4 + ".");
        System.out.println("It's been only three weeks since they got " +
                "together and they've " +
                "already been booked at the local police " + randomNoun4 + " " +
                "for disturbing the " +
                randomNoun5 + ".");
        TimeUnit.SECONDS.sleep(10);

        System.out.println("The End.");
    }

    /**
     * Collects a list of nouns from the user.
     *
     * @param scanner    A Scanner object to read user input.
     * @param nounsArray An ArrayList to store the collected nouns.
     * @return true if the method completed successfully, false otherwise.
     */
    public static boolean collectNouns(Scanner scanner, ArrayList<String>
            nounsArray) {
        try {
            nounsArray.clear();
            for (int i = 0; i < 5; i++) {
                System.out.println("Please enter a one word noun.");
                if (scanner.hasNextLine()) {
                    String noun = scanner.nextLine().trim();
                    nounsArray.add(noun);
                } else {
                    System.out.println("Error: Insufficient input.");
                    // Assign default values
                    for (int j = nounsArray.size(); j < 5; j++) {
                        nounsArray.add("defaultNoun" + (j + 1));
                    }
                    System.out.println("Default values assigned: " +
                            nounsArray);
                    break; // Exit the loop if there is insufficient input
                }
            }
            System.out.println("Thank you! You gave me: " + nounsArray);
            return true; // Indicate that the method completed successfully
        } catch (IllegalStateException e) {
            System.out.println("An error occurred: " + e.getMessage());
            return false; // Indicate that the method did not complete
            // successfully
        }
    }




    /**
     * Collects a list of adjectives from the user.
     *
     * @param scanner         A Scanner object to read user input.
     * @param adjectivesArray An ArrayList to store the collected adjectives.
     * @return true if the method completed successfully, false otherwise.
     */
    public static boolean collectAdjectives(Scanner scanner, ArrayList<String> adjectivesArray) {
        try {
            adjectivesArray.clear();
            for (int i = 0; i < 5; i++) {
                System.out.println("Please enter a one word adjective.");
                if (scanner.hasNextLine()) {
                    String adjective = scanner.nextLine().trim();
                    adjectivesArray.add(adjective);
                } else {
                    System.out.println("Error: Insufficient input.");
                    // Assign default values
                    for (int j = adjectivesArray.size(); j < 5; j++) {
                        adjectivesArray.add("defaultAdjective" + (j + 1));
                    }
                    System.out.println("Default values assigned: " + adjectivesArray);
                    return false; // Indicate that the method did not complete successfully
                }
            }
            System.out.println("Thank you! You gave me: " + adjectivesArray);
            return true; // Indicate that the method completed successfully
        } catch (IllegalStateException e) {
            System.out.println("An error occurred: " + e.getMessage());
            return false; // Indicate that the method did not complete successfully
        }
    }

    /**
     * Collects a list of verbs from the user.
     *
     * @param scanner    A Scanner object to read user input.
     * @param verbsArray An ArrayList to store the collected verbs.
     * @return true if the method completed successfully, false otherwise.
     */
    public static boolean collectVerbs(Scanner scanner, ArrayList<String>
            verbsArray) {
        try {
            verbsArray.clear();
            for (int i = 0; i < 5; i++) {
                System.out.println("Please enter a one word verb.");
                if (scanner.hasNextLine()) {
                    String verb = scanner.nextLine().trim();
                    verbsArray.add(verb);
                } else {
                    System.out.println("Error: Insufficient input.");
                    // Assign default values
                    for (int j = verbsArray.size(); j < 5; j++) {
                        verbsArray.add("defaultVerb" + (j + 1));
                    }
                    System.out.println("Default values assigned: " +
                            verbsArray);
                    return false; // Indicate that the method did not c
                    // omplete successfully
                }
            }
            System.out.println("Thank you! You gave me: " + verbsArray);
            return true; // Indicate that the method completed successfully
        } catch (IllegalStateException e) {
            System.out.println("An error occurred: " + e.getMessage());
            return false; // Indicate that the method did not complete
            // successfully
        }
    }

    /**
     * Collects a list of plural nouns from the user.
     *
     * @param scanner         A Scanner object to read user input.
     * @param pluralNounsArray An ArrayList to store the collected plural nouns.
     * @return true if the method completed successfully, false otherwise.
     */
    public static boolean collectPluralNouns(Scanner scanner,
                                             ArrayList<String>
                                                     pluralNounsArray) {
        try {
            pluralNounsArray.clear();
            for (int i = 0; i < 5; i++) {
                System.out.println("Please enter a one word plural noun.");
                if (scanner.hasNextLine()) {
                    String pluralNoun = scanner.nextLine().trim();
                    pluralNounsArray.add(pluralNoun);
                } else {
                    System.out.println("Error: Insufficient input.");
                    // Assign default values
                    for (int j = pluralNounsArray.size(); j < 5; j++) {
                        pluralNounsArray.add("defaultPluralNoun" + (j + 1));
                    }
                    System.out.println("Default values assigned: " +
                            pluralNounsArray);
                    return false; // Indicate that the method did not
                    // complete successfully
                }
            }
            System.out.println("Thank you! You gave me: " + pluralNounsArray);
            return true; // Indicate that the method completed successfully
        } catch (IllegalStateException e) {
            System.out.println("An error occurred: " + e.getMessage());
            return false; // Indicate that the method did not complete
            // successfully
        }
    }

    /**
     * Selects a specified number of random items from an ArrayList and
     * returns them as an array.
     *
     * @param array The ArrayList from which to select random items.
     * @return An array containing randomly selected items from the list.
     */
    public static String[] generateRandomElements(ArrayList<String> array) {
        int numElements = 5;
        String[] randomElements = new String[numElements];

        // Check if the list has enough elements
        if (array == null || array.size() < numElements) {
            System.out.println("The list does not have enough elements. " +
                    "Please start over.");
            return randomElements;
        }

        ArrayList<String> tempList = new ArrayList<>(array); // Copy of the list
        Random random = new Random();
        for (int i = 0; i < numElements; i++) {
            int randomIndex = random.nextInt(tempList.size());
            randomElements[i] = tempList.get(randomIndex);
            tempList.remove(randomIndex); // Remove the selected element
            // to avoid duplicates
        }

        return randomElements;
    }

    /**
     * The main method of the program, where the story generation process
     * begins.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect words from the user
        ArrayList<String> nounsArray = new ArrayList<>();
        ArrayList<String> adjectivesArray = new ArrayList<>();
        ArrayList<String> verbsArray = new ArrayList<>();
        ArrayList<String> pluralNounsArray = new ArrayList<>();

        boolean nounsCollected = collectNouns(scanner, nounsArray);
        boolean adjectivesCollected = collectAdjectives(scanner, adjectivesArray);
        boolean verbsCollected = collectVerbs(scanner, verbsArray);
        boolean pluralNounsCollected = collectPluralNouns(scanner, pluralNounsArray);

        // Generate random elements
        String[] randomNouns = generateRandomElements(nounsArray);
        String[] randomAdjectives = generateRandomElements(adjectivesArray);
        String[] randomVerbs = generateRandomElements(verbsArray);
        String[] randomPluralNouns = generateRandomElements(pluralNounsArray);

        // Tell the story
        try {
            tellStory(randomVerbs[0], randomVerbs[1], randomVerbs[2],
                    randomVerbs[3], randomVerbs[4],
                    randomNouns[0], randomNouns[1], randomNouns[2],
                    randomNouns[3], randomNouns[4],
                    randomAdjectives[0], randomAdjectives[1],
                    randomAdjectives[2], randomAdjectives[3],
                    randomAdjectives[4],
                    randomPluralNouns[0], randomPluralNouns[1],
                    randomPluralNouns[2], randomPluralNouns[3],
                    randomPluralNouns[4], scanner);
        } catch (InterruptedException e) {
            System.out.println("The story telling process was interrupted.");
        }
    }
}
