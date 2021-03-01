/**
 * Synthetics are not natrual and have an enviromental tax
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/03/01
 */
public class Synthetic extends Fabric{
    private static final Boolean DEFAULT_NATRUAL = false;
    private static final String DEFAULT_SOURCE = "no source";
    private static final Double DEFAULT_ENVIROCOST = 2.0; 
    /**
     * Construct an instance of class Synthetic.
     *
     * @param name The name of the instance.
     * @param price The price of the instance.
     * @param source The source of the instance.
     */
    public Synthetic( final String name, final Double price ) {
        this( name, price, DEFAULT_NATRUAL, DEFAULT_SOURCE, DEFAULT_ENVIROCOST);
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
    public Synthetic( final String name, final Double price, final Boolean natrual, final String source, final Double envirocost ) {
        super( name, price, natrual, source, envirocost );

    }

}


