/**
 * OOPS Banner Application
 *
 * Prints the word OOPS as a banner using '*' characters.
 *
 * UC4: Store banner lines in a String array and print using a loop.
 *
 * @author kameshsaravanan852005-glitch
 * @version 1.3 (UC4 - Array & Loop refactor)
 */
public class Banner {

    public static void main(String[] args) {

        String[] bannerLines = new String[] {
            String.join("", " *****  ", " *****  ", " *****  ", " ***** "),
            String.join("", "*     * ", "*     * ", "*     * ", "*      "),
            String.join("", "*     * ", "*     * ", "*     * ", "*      "),
            String.join("", "*     * ", "*     * ", " *****  ", " ***** "),
            String.join("", "*     * ", "*     * ", " *      ", "      *"),
            String.join("", "*     * ", "*     * ", " *      ", "      *"),
            String.join("", " *****  ", " *****  ", " *    ",    "   ***** ")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}