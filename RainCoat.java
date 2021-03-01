/**
 * Class inherits from Coats and creates a subclass called Rain Coat.
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/03/01
 */
public class RainCoat extends Coats{
    private static final String NAME = "Rain Coat";
    private static final Double MATERIALUNITS = 2.5;
    private static final Fabric MATERIAL = new Acrylic( );
    /**
     * Inherits all variables from Coats and sets its own values. Also
     * creates the object Acrylic for its material.
     */
    public RainCoat( ) {
        super( NAME, MATERIALUNITS, MATERIAL);
    }
}