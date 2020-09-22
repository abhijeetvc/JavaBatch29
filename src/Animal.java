//Inheritance: Object oriented feature.
// Inheritance is also called as is-a relationship.
// Re-usability of code.
//Types of Inheritance: a) Single, b) Multilevel, c) Hierarchical, d) Multiple, e) Hybrid
public class Animal {

    public void eat(){
        System.out.println("Most of the animals eat meat");
    }

    public void roar(){
        System.out.println("Most of the animals roar loudly");
    }
}

class Dog extends Animal{

    public void bark(){
        System.out.println("All dogs bark");
    }

//    public static void main(String[] args) {
//        Dog d=new Dog();
//        d.bark();
//        d.eat();
//        d.roar();
//    }
}

class Puppy extends Dog{

    public void bark(){    //Overriden method
        System.out.println("Puppy barks less");
    }

    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.eat();
        p.bark();
        p.roar();
    }
}