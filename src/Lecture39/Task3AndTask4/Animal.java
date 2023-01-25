package Lecture39.Task3AndTask4;
/*Создать класс животное, сделать его родителем класса Cat.
Создать статический метод “testStaticMethod” который выводит «Это статическое животное».
Вывести в методе main этот метод тремя способами.*/

public class Animal {
    static String spaceObject = "Earth";

   public static void testStaticMethod(){
       System.out.println("This static animal");
    }

}
