package Lecture5_5;

public class Energy extends NatureElement{ // теперь energy базовый элемент
    @Override
    public Object connect(NatureElement element) {
        if(element instanceof Water){
            return new Steam();
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "Energy";
    }

}
