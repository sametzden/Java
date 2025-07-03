package javaornek2;

public class Cat extends Animal implements Pet {
 
    public Cat(String name , int age){
        super(age, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Kedi miyavliyor");
 
 
    }


    @Override
    public void getInfo() {
        // TODO Auto-generated method stub
        super.getInfo();
        System.out.println("Tür:Kedi");
    }

    @Override
    public void play() {
        System.out.println("kedi yumakla oynuyor");
    }
}
