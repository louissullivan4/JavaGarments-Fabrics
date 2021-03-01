/**
 * Subclass of Natrual material called Cotton
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/03/01
 */
public class Cotton extends Natrual {
    private static final String NAME = "Cotton";
    private static final Double PRICE = 2.0;
    private static final String SOURCE = "Gossypium";
    /**
     * Inherits all variables from Natruals and sets its own values.
     */
    public Cotton( ) {
        super( NAME, PRICE, SOURCE);
    }
}