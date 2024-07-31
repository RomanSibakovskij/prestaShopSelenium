package lt.techin.example;

import org.openqa.selenium.WebDriver;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TestDataGenerator extends BasePage {

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    private static final Random RANDOM = new SecureRandom();

    public TestDataGenerator(WebDriver driver) {
        super(driver);
    }

    private static String firstName;
    private static String lastName;
    private static String emailAddress;
    private static String invalidEmailAddress;
    private static String password;

    // Generate random string methods
    private static String generateRandomString(String characters, int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    private static String shuffleString(String string) {
        List<String> letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters);
        return String.join("", letters);
    }


    //generator methods
    private static String generateRandomNumberString(int length) {
        return generateRandomString(DIGITS, length);
    }

    private static String generateRandomSpecialString(int length) {
        return generateRandomString(SPECIAL, length);
    }

    // Randomizer methods
    public static String generateRandomFirstname(int length) {
        return generateRandomString(UPPER + LOWER, length);
    }
    public static String generateRandomLastname(int length) {
        return generateRandomString(UPPER + LOWER, length);
    }

    public static String generateRandomProjectName(int length) {
        return generateRandomString(UPPER + LOWER, length);
    }

    public static String generateRandomProjectDescription(int length) {
        return generateRandomString(UPPER + LOWER, length);
    }

    public static String generateRandomTaskName(int length) {
        return generateRandomString(UPPER + LOWER, length);
    }

    public static String generateRandomTaskDescription(int length) {
        return generateRandomString(UPPER + LOWER, length);
    }

    public static String generateRandomEmailAddress(int length) {
        String emailAddress = generateRandomString(UPPER + LOWER, length);
        return emailAddress + "@example.com";
    }

    public static String generateRandomInvalidEmailAddress(int length) {
        String invalidEmailAddress = generateRandomString(UPPER + LOWER, length);
        return invalidEmailAddress + "@com";
    }

    public static String generateRandomPassword() {
        String numbers = "0123456789";
//        String special = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        // fixed password part
        String stokerPart = "Stoker";

        // random numeric sequence
        StringBuilder numericPart = new StringBuilder();
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append('_'); // Static underscore

        // shuffle the numeric part
        String shuffledNumericPart = shuffleString(numericPart.toString());

        //"Stoker" + shuffled numeric part
        StringBuilder password = new StringBuilder();
        password.append(stokerPart);
        password.append(shuffledNumericPart);

        return password.toString();
    }

    public static String generateRandomInvalidPassword() {
        String numbers = "0123456789";
//        String special = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        // fixed password part
        String stokerPart = "Stoker";

        // random numeric sequence
        StringBuilder numericPart = new StringBuilder();
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
//        numericPart.append('_'); // Static underscore

        // shuffle the numeric part
        String shuffledNumericPart = shuffleString(numericPart.toString());

        //"Stoker" + shuffled numeric part
        StringBuilder password = new StringBuilder();
        password.append(stokerPart);
        password.append(shuffledNumericPart);

        return password.toString();
    }
    //birthdate generator
    public static String generateRandomBirthdate(int minAge, int maxAge, String dateFormat) {
        Random random = new Random();
        int randomYear = LocalDate.now().getYear() - (minAge + random.nextInt(maxAge - minAge + 1));
        int randomDayOfYear = 1 + random.nextInt(365);
        LocalDate randomDate = LocalDate.ofYearDay(randomYear, randomDayOfYear);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        return randomDate.format(formatter);
    }

    //getters for names / email / password

    public static String getFirstName(){
        return firstName;
    }
    public static String getLastName(){
        return lastName;
    }
    public static String getEmailAddress() {
        return emailAddress;
    }
    public static String getPassword() {
        return password;
    }

    //getters for invalid emails / passwords

    public static String getInvalidEmailAddress() {
        return invalidEmailAddress;
    }
}
