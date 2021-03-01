/**
 * Class for creating the fabric used in each Garment.
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/03/01
 */
public class Fabric {
    private final String name;
    private final Double price;
    private final Boolean natrual;
    private final String source;
    private final Double envirocost;
    /**
     * Construct an instance of class Fabric with the given parameters
     *
     * @param name The name of the instance.
     * @param price The price of the instance.
     * @param natrual Tells us if the instance is natrual or synthetic.
     * @param source The source of the instance.
     * @param envirocost The us what the enviromental tax is.
     */
	public Fabric( final String name, final Double price, final Boolean natrual, final String source, final Double envirocost ) {
        this.name = name;
        this.price = price;
        this.natrual = natrual;
        this.source = source;
        this.envirocost = envirocost;
	}
    /**
     * Get the name of this instance.
     *
     * @return The name of this instance.
     */
    public String getName() {
        return name;
    }
    /**
     * Get the name of this instance.
     *
     * @return The price of the instance.
     */
    public Double getPrice() {
        return price;
    }
    /**
     * Get the name of this instance.
     *
     * @return Returns True if the fabric is natrual, else its synthetic
     */
    public Boolean getNatural() {
        return natrual;
    }
    /**
     * Get the name of this instance.
     *
     * @return what the farbic source is
     */ 
    public String getSource() {
        return source;
    }
    /**
     * Get the name of this instance.
     *
     * @return Returns the cost of eniromental tax of the fabric
     */
    public Double getEnviroCost() {
        return envirocost;
    }

}