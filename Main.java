import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main( final String[] args ) {
        final List<Garment> items = new ArrayList<Garment>( );
        final Jeans jeans1 = new Jeans( );
        final WinterCoat winter1 = new WinterCoat( );
        final RainCoat rain1 = new RainCoat( );
        final Tshirt tshirt1 = new Tshirt( );
        final Jacket jacket1 = new Jacket( );


        items.add(jeans1);
        items.add(winter1);
        items.add(rain1);
        items.add(tshirt1);
        items.add(jacket1);



        for (Garment item : items) {
            item.printPurpose( );
        }

        System.out.println( );

        for (Garment item : items) {
            item.printItemisedBill( );
        }
    }
}
