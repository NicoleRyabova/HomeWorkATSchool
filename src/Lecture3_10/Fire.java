//   Fire + Fire не производит новый элемент
//      Fire + Air = Energy
//      Fire + Earth = Lava
//      Fire + Water = Steam
package Lecture3_10;

public class Fire extends NatureElement {
    @Override
    public Object connect(NatureElement element) {
        if (element instanceof Fire) {
            System.out.println("Нет нового элемента!");
            return null;
        } else if (element instanceof Air) {
            return new Energy();
        } else if (element instanceof Earth) {
            return new Lava();
        } else if (element instanceof Water) {
            return new Steam();
        }
        System.out.println("Нет нового элемента!");
        return null;
    }

    @Override
    public String toString() {
        return "Fire";
    }
}
