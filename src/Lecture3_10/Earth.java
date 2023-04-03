// Earth + Earth = Pressure
//      Earth + Air = Dust
//      Earth + Fire = Lava
//      Earth + Water = Mud
package Lecture3_10;

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
        }
        System.out.println("Нет нового элемента!");
        return null;
    }

    @Override
    public String toString() {
        return "Earth";
    }
}
