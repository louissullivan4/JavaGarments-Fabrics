/**
 * Class inherits from Trousers and creates a subclass called Jeans
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/03/01
 */
public class Jeans extends Trousers{
    private static final String NAME = "Jeans";
    private static final Double MATERIALUNITS = 2.0;
    private static final Fabric MATERIAL = new Cotton( );
    /**
     * Inherits all variables from Trousers and sets its own values. Also
     * creates the object cotton for its material.
     */
    public Jeans( ) {
        super( NAME, MATERIALUNITS, MATERIAL);
    }
}
