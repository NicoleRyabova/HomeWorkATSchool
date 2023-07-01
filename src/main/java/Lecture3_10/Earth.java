// Earth + Earth = Pressure
//      Earth + Air = Dust
//      Earth + Fire = Lava
//      Earth + Water = Mud
package Lecture3_10;

import java.util.NoSuchElementException;

public class Earth extends NatureElement {
    @Override
    public Object connect(NatureElement element) {
        if (element instanceof Earth) {
            return new Pressure();
        } else if (element instanceof Air) {
            return new Dust();
        } else if (element instanceof Fire) {
            return new Lava();
        } else if (element instanceof Water) {
            return new Mud();
        }else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public String toString() {
        return "Earth";
    }
}
