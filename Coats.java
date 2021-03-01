/**
 * Class inherits from Garment and creates a subclass called Coats
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/03/01
 */
public class Coats extends Garment {
    private static final String DEFAULT_PURPOSE = "Provide extra protection against the elements.";
    /**
     * Construct an instance of this class Coats with the given parameters as well as
     * the DEFAULT_PURPOSE of Coats
     *
     * @param name The name of the instance.
     * @param materialunits The number of units of the instance.
     * @param material The material of what the instance is made of.
     */
    public Coats(final String name, final Double materialunits, final Fabric material ) {
        this( name, DEFAULT_PURPOSE, materialunits, material );
    }
    /**
     * Construct an instance of this class Coats and inherits the given parameters from the super-
     * class Garments.
     *
     * @param name The name of the instance.
     * @param purpose The purpose of the instance.
     * @param materialunits The number of units of the instance.
     * @param material The material of what the instance is made of.
     */
    public Coats(final String name, final String purpose, final Double materialunits, final Fabric material ) {
        super(name, purpose, materialunits, material );
    }
}

