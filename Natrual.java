/**
 * Natruals are natrual and have no enviromental tax
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/03/01
 */
public class Natrual extends Fabric {
    private static final Boolean DEFAULT_NATRUAL = true;
    private static final Double DEFAULT_ENVIROCOST = 0.0; 
    /**
     * Construct an instance of class Natrual.
     *
     * @param name The name of the instance.
     * @param price The price of the instance.
     * @param source The source of the instance.
     */
    public Natrual( final String name, final Double price, final String source ) {
        this( name, price, DEFAULT_NATRUAL, source, DEFAULT_ENVIROCOST);
    }
    /**
     * Construct an instance of class Natrual
     *
     * @param name The name of the instance.
     * @param price The price of the instance.
     * @param natrual Tells us if the instance is natrual or synthetic.
     * @param source The source of the instance.
     * @param envirocost The us what the enviromental tax is.
     */
    public Natrual( final String name, final Double price, final Boolean natrual, final String source, final Double envirocost ) {
        super( name, price, natrual, source, envirocost );

    }
}
