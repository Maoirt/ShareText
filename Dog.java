
public class Dog {

    private String name;
    private int age;
    private String breed;

    public Dog() {
        this.name = "Безымянный";
        this.age = 0;
        this.breed = "Неизвестно";
    }
    
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    
    public void bark() {
        System.out.println(name + " говорит: Гав-гав!");
    }
    
    public void eat() {
        System.out.println(name + " кушает.");
    }
    
    public void sleep() {
        System.out.println(name + " спит.");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Возраст не может быть отрицательным!");
        }
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public void displayInfo() {
        System.out.println("Собака: " + name + 
                          ", Возраст: " + age + 
                          ", Порода: " + breed);
    }
    
    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик", 3, "Дворняжка");
        Dog dog2 = new Dog();

        dog1.displayInfo();
        dog1.bark();
        dog1.eat();
        
        System.out.println(); 
        
        dog2.displayInfo();
        dog2.setName("Бобик");
        dog2.setAge(5);
        dog2.setBreed("Овчарка");
        
        System.out.println("После изменения:");
        dog2.displayInfo();
        dog2.sleep();
        
        dog2.setAge(-1);
    }
}