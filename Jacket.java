/**
 * Class inherits from Coats and creates a subclass called Jacket
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/03/01
 */
public class Jacket extends Coats{
    private static final String NAME = "Jacket";
    private static final Double MATERIALUNITS = 2.0;
    private static final Fabric MATERIAL = new Tweed();
    /**
     * Inherits all variables from Coats and sets its own values. Also
     * creates the object Tweed for its material.
     */
    public Jacket( ) {
        super( NAME, MATERIALUNITS, MATERIAL);
    }
}