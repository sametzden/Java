package javaornek2;

public class Dog extends Animal implements Pet{
    
    public Dog(String name , int age){
        super(age, name);
    }


    @Override
    public void makeSound() {
        System.out.println("Köpek havliyor");
    }

    @Override
    public void getInfo() {
        // TODO Auto-generated method stub
        super.getInfo();
        System.out.println("Tür: Köpek");
    }

    @Override
    public void play() {
      System.out.println("köpek top ile oynuyor");
    }
}
