package javaornek2;

public class Owner {

    Pet pet;
    String name;

    public Owner(Pet pet , String name){
        this.pet = pet;
        this.name = name;
    }
    
    public void interactWithPet(){
        pet.play();
    }

    public void introduce(){
        System.out.println("Sahib : " + name);
        Animal animal = (Animal) pet;
        animal.getInfo();
    }
}
