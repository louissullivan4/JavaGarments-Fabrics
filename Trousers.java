/**
 * Class inherits from Garment and creates a subclass called Trousers
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/03/01
 */
public class Trousers extends Garment{
    private static final String DEFAULT_PURPOSE = "Cover the legs";
    /**
     * Construct an instance of this class Trousers with the given parameters as well as
     * the DEFAULT_PURPOSE of Trousers
     *
     * @param name The name of the instance.
     * @param materialunits The number of units of the instance.
     * @param material The material of what the instance is made of.
     */
    public Trousers(final String name, final Double materialunits, final Fabric material ) {
        this( name, DEFAULT_PURPOSE, materialunits, material );
    }
    /**
     * Construct an instance of this class Trousers and inherits the given parameters from the super-
     * class Garments.
     *
     * @param name The name of the instance.
     * @param purpose The purpose of the instance.
     * @param materialunits The number of units of the instance.
     * @param material The material of what the instance is made of.
     */
    public Trousers(final String name, final String purpose, final Double materialunits, final Fabric material ) {
        super(name, purpose, materialunits, material );
    }
}
