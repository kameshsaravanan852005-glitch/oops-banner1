/**
 * OOPS Banner Application
 *
 * Prints the word OOPS as a banner using '*' characters.
 *
 * @author kameshsaravanan852005-glitch
 * @version 1.2 (UC3 - String.join refactor)
 */
public class Banner {

    public static void main(String[] args) {

        System.out.println(String.join("", 
                " *****  ", " *****  ", " *****  ", " ***** "
        ));

        System.out.println(String.join("", 
                "*     * ", "*     * ", "*     * ", "*      "
        ));

        System.out.println(String.join("", 
                "*     * ", "*     * ", "*     * ", "*      "
        ));

        System.out.println(String.join("", 
                "*     * ", "*     * ", " *****  ", " ***** "
        ));

        System.out.println(String.join("", 
                "*     * ", "*     * ", "      * ", "      *"
        ));

        System.out.println(String.join("", 
                "*     * ", "*     * ", "      * ", "      *"
        ));

        System.out.println(String.join("", 
                " *****  ", " *****  ", " *****  ", " ***** "
        ));
    }
}
