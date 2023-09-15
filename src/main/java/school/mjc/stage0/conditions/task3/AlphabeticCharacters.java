package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {

        char lowerCaseChar = Character.toLowerCase(character);

        if ((lowerCaseChar >= 'a' && lowerCaseChar <= 'z')) {

            if (lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' ||
                    lowerCaseChar == 'o' || lowerCaseChar == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }

    public static void main(String[] args) {
        new AlphabeticCharacters().vowelDeterminer('ú');
    }

}

