//  Water + Water = Sea
//      Water + Fire = Steam
//      Water + Earth = Mud
//      Water + Air = Rain
package Lecture3_10;

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
        }
        System.out.println("Нет нового элемента!");
        return null;
    }

    @Override
    public String toString() {
        return "Water";
    }
}
