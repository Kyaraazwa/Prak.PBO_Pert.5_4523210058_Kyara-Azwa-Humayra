public class Main {
    public static void main(String[] args){
        Spider Spiderman = new Spider();
        Spiderman.walk();
        Spiderman.eat();

        Cat dobby = new Cat();
        dobby.setName("Dobby");
        dobby.getName();
        dobby.play();
        dobby.eat();
        dobby.walk();

        Dog helly = new Dog();
        helly.setName("Helly");
        helly.getName();
        helly.play();
        helly.eat();
        helly.walk();
    }
    
}