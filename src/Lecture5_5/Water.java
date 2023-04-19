//  Water + Water = Sea
//      Water + Fire = Steam
//      Water + Earth = Mud
//      Water + Air = Rain
package Lecture5_5;

public class Water extends NatureElement {
    @Override
    public Object connect(NatureElement element) {
        if (element instanceof Water) {
            return new Sea();
        } else if (element instanceof Fire) {
            return new Steam();
        } else if (element instanceof Earth) {
            return new Mud();
        } else if (element instanceof Air) {
            return new Rain();
        }else if(element instanceof Energy){
            return new Steam();
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "Water";
    }
}
