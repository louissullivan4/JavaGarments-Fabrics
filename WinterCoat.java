/**
 * Class inherits from Coats and creates a subclass called Winter Coat
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/03/01
 */
public class WinterCoat extends Coats{
    private static final String NAME = "Winter Coat";
    private static final Double MATERIALUNITS = 2.5;
    private static final Fabric MATERIAL = new Polyester();
    /**
     * Inherits all variables from Coats and sets its own values. Also
     * creates the object Polyester for its material.
     */
    public WinterCoat( ) {
        super( NAME, MATERIALUNITS, MATERIAL );
    }
}

