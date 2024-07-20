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
// No help
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////
package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A class that contains test cases for the H10CustomApp class methods.
 *
 * This class is used to verify that the methods in the H10CustomApp class
 * function correctly by simulating user input and comparing the results
 * with expected outcomes.
 */
public class TestH10CustomApp {

    /**
     * The main method of the program. This method initializes and runs all the
     * tests for the H10CustomApp class.
     * It prints the test results indicating whether all tests passed or failed.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        boolean allTestsPassed = testH10CustomApp();

        System.out.println("Test Results:");
        System.out.println("All Tests: " + (allTestsPassed ? "Passed" :
                "Failed"));
    }

    /**
     * Runs all the tests for the H10CustomApp class and aggregates their
     * results.
     *
     * @return true if all tests passed, false otherwise.
     */
    public static boolean testH10CustomApp() {
        boolean allTestsPassed = true;

        boolean testCollectNounsResult = testCollectNouns();
        boolean testCollectAdjectivesResult = testCollectAdjectives();
        boolean testCollectVerbsResult = testCollectVerbs();
        boolean testCollectPluralNounsResult = testCollectPluralNouns();
//        boolean testCollectPluralNounsRejectionResult =
        //        testCollectPluralNounsRejection();

        allTestsPassed &= testCollectNounsResult;
        allTestsPassed &= testCollectAdjectivesResult;
        allTestsPassed &= testCollectVerbsResult;
        allTestsPassed &= testCollectPluralNounsResult;
//        allTestsPassed &= testCollectPluralNounsRejectionResult;

        return allTestsPassed;
    }

    /**
     * Tests the collectNouns method by providing predefined input and
     * checking the collected output.
     *
     * @return true if the collected nouns match the expected nouns,
     * false otherwise.
     */
    private static boolean testCollectNouns() {
        System.out.println("Noun collection test");
        String input = "dog\ncat\nfish\nbird\nhorse\n";
        ArrayList<String> expectedNouns =
                new ArrayList<>(Arrays.asList("dog", "cat", "fish", "bird",
                        "horse"));
        return performNounTest(input, expectedNouns);
    }

    /**
     * Performs the noun test by comparing the collected nouns with the
     * expected nouns.
     *
     * @param input         The predefined input string.
     * @param expectedNouns The expected list of nouns.
     * @return true if the collected nouns match the expected nouns,
     * false otherwise.
     */
    private static boolean performNounTest(String input, ArrayList<String>
            expectedNouns) {
        Scanner scanner = new Scanner(input);
        ArrayList<String> nounsArray = new ArrayList<>();
        H10CustomApp.collectNouns(scanner, nounsArray);
        System.out.println("Collected Nouns: " + nounsArray);

        boolean passed = nounsArray.equals(expectedNouns);
        if (passed) {
            System.out.println("Test Passed: Collected nouns match the " +
                    "expected nouns.");
        }
        else {
            System.out.println("Test Failed: Collected nouns do not match " +
                    "the expected nouns.");
        }
        return passed;
    }

    /**
     * Tests the collectAdjectives method by providing predefined input and
     * checking the collected output.
     *
     * @return true if the collected adjectives match the expected adjectives,
     * false otherwise.
     */
    private static boolean testCollectAdjectives() {
        System.out.println("Adjective collection test");
        String input = "happy\nsad\nbright\ndark\nshiny\n";
        ArrayList<String> expectedAdjectives =
                new ArrayList<>(Arrays.asList("happy", "sad", "bright",
                        "dark", "shiny"));
        return performAdjectiveTest(input, expectedAdjectives);
    }

    /**
     * Performs the adjective test by comparing the collected adjectives
     * with the expected adjectives.
     *
     * @param input              The predefined input string.
     * @param expectedAdjectives The expected list of adjectives.
     * @return true if the collected adjectives match the expected
     * adjectives, false otherwise.
     */
    private static boolean performAdjectiveTest(String input,
                                                ArrayList<String>
                                                        expectedAdjectives) {
        Scanner scanner = new Scanner(input);
        ArrayList<String> adjectivesArray = new ArrayList<>();
        H10CustomApp.collectAdjectives(scanner, adjectivesArray);
        System.out.println("Collected Adjectives: " + adjectivesArray);

        boolean passed = adjectivesArray.equals(expectedAdjectives);
        if (passed) {
            System.out.println("Test Passed: Collected adjectives match " +
                    "the expected adjectives.");
        }
        else {
            System.out.println(
                    "Test Failed: Collected adjectives do not match the " +
                            "expected adjectives.");
        }
        return passed;
    }

    /**
     * Tests the collectVerbs method by providing predefined input and
     * checking the collected output.
     *
     * @return true if the collected verbs match the expected verbs, false otherwise.
     */
    private static boolean testCollectVerbs() {
        System.out.println("Verb collection test");
        String input = "run\njump\nswim\nfly\nsing\n";
        ArrayList<String> expectedVerbs =
                new ArrayList<>(Arrays.asList("run", "jump", "swim", "fly",
                        "sing"));
        return performVerbTest(input, expectedVerbs);
    }

    /**
     * Performs the verb test by comparing the collected verbs with the
     * expected verbs.
     *
     * @param input         The predefined input string.
     * @param expectedVerbs The expected list of verbs.
     * @return true if the collected verbs match the expected verbs,
     * false otherwise.
     */
    private static boolean performVerbTest(String input, ArrayList<String>
            expectedVerbs) {
        Scanner scanner = new Scanner(input);
        ArrayList<String> verbsArray = new ArrayList<>();
        H10CustomApp.collectVerbs(scanner, verbsArray);
        System.out.println("Collected Verbs: " + verbsArray);

        boolean passed = verbsArray.equals(expectedVerbs);
        if (passed) {
            System.out.println("Test Passed: Collected verbs match the " +
                    "expected verbs.");
        }
        else {
            System.out.println("Test Failed: Collected verbs do not match " +
                    "the expected verbs.");
        }
        return passed;
    }

    /**
     * Tests the collectPluralNouns method by providing predefined input
     * and checking the collected output.
     *
     * @return true if the collected plural nouns match the expected
     * plural nouns, false otherwise.
     */
    private static boolean testCollectPluralNouns() {
        System.out.println("Plural Noun collection test");
        String input = "cats\ndogs\nhouses\ntrees\ncars\n";
        ArrayList<String> expectedPluralNouns =
                new ArrayList<>(Arrays.asList("cats", "dogs", "houses",
                        "trees", "cars"));
        return performPluralNounTest(input, expectedPluralNouns);
    }

    /**
     * Tests the collectPluralNouns method by providing predefined input
     * and checking the collected output.
     * This test includes a rejection case.
     *
     * @return true if the collected plural nouns match the expected plural
     * nouns, false otherwise.
     */
//    private static boolean testCollectPluralNounsRejection() {
//        System.out.println("Rejection Test (Plural Nouns)");
//        // Include 'N' for rejection and 'Y' for the confirmation at the end
//        String input =
//                "cats\ndogs\nhouses\ntrees\ncars\nN\nlions\ntigers\nforests
    //                \nbushes\nplanes\nY\n";
//        ArrayList<String> expectedPluralNouns =
//                new ArrayList<>(Arrays.asList("lions", "tigers", "forests",
    //                "bushes", "planes"));
//        return performPluralNounTest(input, expectedPluralNouns);
//    }

    /**
     * Performs the plural noun test by comparing the collected plural nouns
     * with the expected plural nouns.
     *
     * @param input               The predefined input string.
     * @param expectedPluralNouns The expected list of plural nouns.
     * @return true if the collected plural nouns match the expected plural
     * nouns, false otherwise.
     */
    private static boolean performPluralNounTest(String input,
                                                 ArrayList<String>
                                                         expectedPluralNouns) {
        Scanner scanner = new Scanner(input);
        ArrayList<String> pluralNounsArray = new ArrayList<>();
        H10CustomApp.collectPluralNouns(scanner, pluralNounsArray);
        System.out.println("Collected Plural Nouns: " + pluralNounsArray);

        boolean passed = pluralNounsArray.equals(expectedPluralNouns);
        if (passed) {
            System.out.println(
                    "Test Passed: Collected plural nouns match the " +
                            "expected plural nouns.");
        }
        else {
            System.out.println(
                    "Test Failed: Collected plural nouns do not match the " +
                            "expected plural nouns.");
        }
        return passed;
    }
}
