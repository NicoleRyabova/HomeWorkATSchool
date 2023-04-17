//эти классы содержат метод connect,
//      который на вход получает другой NatureElement
//      В теле метода происходит проверка какого типа передан элемент и в соответствие со схемой
//      печатается формула:
//           +  =
//      И также создается объект результирующего элемента и возвращается.
//      Если по схеме нет нового элемента, то выводится сообщение "Нет нового элемента"
//      и возвращается null.

//      Air + Air = Pressure
//      Air + Earth = Dust
//      Air + Fire = Energy
//      Air + Water = Rain
package Lecture5_5;

public class Air extends NatureElement {
    @Override
    public Object connect(NatureElement element) {
        if (element instanceof Air) { // если элемент - воздух, то т.к это класс воздуха, они вместе получают pressure
            return new Pressure();
        } else if (element instanceof Earth) {
            return new Dust();
        } else if (element instanceof Fire) {
            return new Energy();
        } else if (element instanceof Water) {
            return new Rain();
        }
        throw new UnsupportedOperationException();

    }

    @Override
    public String toString() {
        return "Air";
    }
}
