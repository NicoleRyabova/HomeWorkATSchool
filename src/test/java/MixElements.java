import Lecture3_10.Alchemy;


public class MixElements {
    public Alchemy alchemy;
    private String element1;
    private String element2;

   // @Given("^Получить два элемента$")
    public void createAlchemy() {
        alchemy = new Alchemy();
    }

    //@When("^Ввести элементы NatureElement и NatureElement$")
    public void putElementsAirAndWater() {
        alchemy.main(new String[]{element1, element2});
    }

    //@io.cucumber.java.en.And("^Произвести смешивание$")
    public void произвестиСмешивание() {
    }

    //@io.cucumber.java.en.Then("^Проверить результат$")
    public void проверитьРезультат() {
    }
}
