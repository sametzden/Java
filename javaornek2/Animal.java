package javaornek2;

public abstract class Animal {
    protected int age;
    protected String name;
    public Animal (int age, String name){
        this.age = age;
        this.name = name;
    }

    public void getInfo(){
        System.out.println("yaş  " + age + " isim " + name);
    }

    

    abstract public void makeSound();
}
