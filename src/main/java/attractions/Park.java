package attractions;

import behaviours.IReviewed;
import people.Visitor;

public class Park extends Attraction implements IReviewed {

    public Park(String name, int rating) {
        super(name, rating);
    }


}
