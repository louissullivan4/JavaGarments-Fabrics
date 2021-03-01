/**
 * Subclass of Natrual material called Tweed
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/03/01
 */
public class Tweed extends Natrual {
    private static final String NAME = "Tweed";
    private static final Double PRICE = 3.0;
    private static final String SOURCE = "wool";
    /**
     * Inherits all variables from Natruals and sets its own values.
     */
    public Tweed( ) {
        super( NAME, PRICE, SOURCE);
    }
}
