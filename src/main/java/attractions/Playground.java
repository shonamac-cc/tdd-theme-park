package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }



//    public void isAllowedTo(Visitor visitor) {
//        if(visitor.getAge() <= 15 ) {
//            return true;
//        }
    }
//}
