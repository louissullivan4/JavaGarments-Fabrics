/**
 * Class inherits from Shirts and creates a subclass called T-shirt
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/03/01
 */
public class Tshirt extends Shirts {
    private static final String NAME = "T-shirt";
    private static final Double MATERIALUNITS = 1.5;
    private static final Fabric MATERIAL = new Cotton( );
    /**
     * Inherits all variables from Shirts and sets its own values. Also
     * creates the object cotton for its material.
     */
    public Tshirt( ) {
        super( NAME, MATERIALUNITS, MATERIAL);
    }
}

