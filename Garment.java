/**
 * Class for calculating enviromental tax and total price of each Garment
 * @author Louis Sullivan (119363083)
 * @version 0.00
 * @Date 2021/02/24
 */
public class Garment {
    private final String name;
    private final String purpose;
    private final Double materialunits;
    private final Fabric material;
    private Double totalcost;
    private Double envirotax;
    private Double baseprice;
    /**
     * Construct an instance of this class Garment with the given parameters
     *
     * @param name The name of the instance.
     * @param purpose The purpose of the instance.
     * @param materialunits The number of units of the instance.
     * @param material The material of what the instance is made of.
     */
    public Garment(final String name, final String purpose, final Double materialunits, final Fabric material) {
        this.name = name;
        this.purpose = purpose;
        this.materialunits = materialunits;
        this.material = material;
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
     * Get the material of this instance.
     *
     * @return The material of this instance.
     */
    public Fabric getMaterial() {
        return material;
    }
    /**
     * Get the purpose of this instance.
     */
    public void printPurpose() {
        System.out.println(purpose);  
    }
    /**
     * Make the instance of the class printItemisedBill which calculates values of our bill and prints out the results.
     */
    public void printItemisedBill( ) {

        envirotax = materialunits * material.getEnviroCost();
        baseprice = materialunits * material.getPrice();

        if ( material.getNatural() == true ) {
            totalcost = (material.getPrice() * materialunits);
        } else{
            totalcost = ((material.getPrice() + material.getEnviroCost()) * materialunits);
        }

        System.out.println( "-----------------------");  
        System.out.println( name + ". " + purpose);        
        System.out.println( "Itemised bill for " + name );
        System.out.println( "Made of " + materialunits + " units of " +  material.getName() + " made of " + material.getSource() );
        System.out.println( " environment tax: " + materialunits + " * " + material.getEnviroCost() + " = " + envirotax );
        System.out.println( " base price: " + materialunits + " * " + material.getPrice() + " = " + baseprice);
        System.out.println( " grand total: " + materialunits + " * " + (material.getPrice() + envirotax) + " = " + totalcost);
        System.out.println( "-----------------------");  
    }
}
