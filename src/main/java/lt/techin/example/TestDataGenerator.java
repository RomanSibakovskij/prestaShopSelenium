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
    private static String address;
    private static String city;
    private static int postalCode;
    private static String password;

    //invalid inputs

    private String longFirstName;
    private String longLastName;
    private String longPassword;
    private String shortPassword;
    private static String invalidEmailAddress;

    // Street types commonly used in addresses
    private static final String[] STREET_TYPES = {"St.", "Ave.", "Blvd.", "Rd.", "Ln.", "Dr.", "Ct.", "Pl."};

    // Street types commonly used in French
    private static final String[] FRENCH_STREET_TYPES = {"Rue", "Avenue", "Boulevard", "Chemin", "Place", "Allée"};

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


    public static String generateRandomEmailAddress(int length) {
        String emailAddress = generateRandomString(UPPER + LOWER, length);
        return emailAddress + "@example.com";
    }
    // generate a random address with a given length for the street name
    public static String generateRandomAddress(int length) {
        int streetNumber = RANDOM.nextInt(9999) + 1; // street number between 1 and 9999
        String streetName = generateRandomString("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", length);
        String streetType = STREET_TYPES[RANDOM.nextInt(STREET_TYPES.length)];
        return streetNumber + " " + streetName + " " + streetType;
    }

    // Method to generate a random address with a given length for the street name
    public static String generateRandomFrenchAddress(int length) {
        int frenchStreetNumber = RANDOM.nextInt(9999) + 1; // Random street number between 1 and 9999
        String frenchStreetName = generateRandomString("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", length);
        String frenchStreetType = FRENCH_STREET_TYPES[RANDOM.nextInt(FRENCH_STREET_TYPES.length)];
        return frenchStreetNumber + " " + frenchStreetName + " " + frenchStreetType;
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
    //birthdate generator
    public static String generateRandomBirthdate(int minAge, int maxAge, String dateFormat) {
        Random random = new Random();
        int randomYear = LocalDate.now().getYear() - (minAge + random.nextInt(maxAge - minAge + 1));
        int randomDayOfYear = 1 + random.nextInt(365);
        LocalDate randomDate = LocalDate.ofYearDay(randomYear, randomDayOfYear);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        return randomDate.format(formatter);
    }

    //invalid data generation

    public static String generateRandomInvalidEmailAddress(int length) {
        String invalidEmailAddress = generateRandomString(UPPER + LOWER, length);
        return invalidEmailAddress + "@com";
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

    // array of Illinois state cities
    private static final String[] ILLINOIS_CITIES = {
            "Chicago", "Aurora", "Naperville", "Joliet", "Rockford", "Springfield",
            "Elgin", "Peoria", "Champaign", "Waukegan", "Cicero", "Bloomington",
            "Arlington Heights", "Evanston", "Decatur", "Schaumburg", "Bolingbrook",
            "Palatine", "Skokie", "Des Plaines", "Orland Park", "Tinley Park",
            "Oak Lawn", "Berwyn", "Mount Prospect", "Normal", "Wheaton", "Hoffman Estates",
            "Oak Park", "Downers Grove", "Elmhurst", "Glenview", "DeKalb", "Lombard",
            "Moline", "Buffalo Grove", "Bartlett", "Urbana", "Crystal Lake", "Quincy",
            "Streamwood", "Carol Stream", "Romeoville", "Plainfield", "Hanover Park",
            "Carpentersville", "Wheeling", "Park Ridge", "Addison", "Calumet City"
    };

    // List of cities in the Lyons area
    private static final List<String> LYON_CITIES = Arrays.asList(
            "Lyon", "Villeurbanne", "Vénissieux", "Saint-Priest", "Caluire-et-Cuire",
            "Bron", "Oullins", "Vaulx-en-Velin", "Meyzieu", "Ecully", "Rillieux-la-Pape",
            "Décines-Charpieu", "La Mulatière", "Tassin-la-Demi-Lune", "L'Arbresle", "Givors"
    );

    // cities rnd instances
    private static final Random rndIllinoisCities = new Random();
    private static final Random rndLyonsAreaCities = new Random();

    // Method to get a random city from the array
    public static String getRandomCity() {
        int index = rndIllinoisCities.nextInt(ILLINOIS_CITIES.length);
        return ILLINOIS_CITIES[index];
    }

    // Method to get a random city from the Lyons area
    public static String getRandomFrenchCity() {
        int index = rndLyonsAreaCities.nextInt(LYON_CITIES.size());
        return LYON_CITIES.get(index);
    }

    // Method to get a random postal code for the Lyons area
    public static int getLyonsRandomPostalCode() {
        return 69000 + RANDOM.nextInt(1000);
    }


    // generate random postal code for Illinois
    public static int getRandomPostalCode() {
        return 60000 + RANDOM.nextInt(30000);
    }

    public static void main(String[] args) {
        // Example usage
        for (int i = 0; i < 10; i++) {
            System.out.println(getRandomCity());
        }
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
    public static String getAddress(){return address;}
    public static String getCity(){return city;}
    public static int getPostalCode(){return postalCode;}
    public static String getPassword() {
        return password;
    }

    //getters for invalid / emails / passwords

    public static String getInvalidEmailAddress() {
        return invalidEmailAddress;
    }

}
