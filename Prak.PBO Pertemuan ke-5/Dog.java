
class Dog extends Animal implements Pet {
   private String name;

   public void setName(String name) {
    System.out.println("Dog's name is : " + name);
   }

   public String getName() {
      return this.name;
   }

   public void play() {
      System.out.println("main boneka");
   }

   public void eat() {
      System.out.println("Makan proplan");
   }

   public void walk() {
      System.out.println("Jalan sore bersama majikan");
   }
}