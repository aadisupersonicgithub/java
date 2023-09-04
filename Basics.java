// Online Java Compiler
// Use this editor to write, compile and run your Java code online
  class Person {
        String name;
        int age;
    
        public void introduce() {
            System.out.println("My name is " + name + " and I am " + age + " years old.");
        }
    }
    
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int age = 25;
        double price = 19.99;
        boolean isJavaFun = true;
        String greeting = "Hello, Java!";
        System.out.println("price, isJavaFun, greeting : " +  price + isJavaFun + greeting);

        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is not greater than 5");
        }
        System.out.println(" add 3, 4 = " + add(3, 4));
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(" add 3, 4 = " + numbers);
        
        Person person1 = new Person();
        person1.name = "Alice";
        person1.age = 30;
        person1.introduce();
    }
    public static int add(int a, int b) {
        return a + b;
    }
   

}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
  class Person {
        String name;
        int age;
    
        public void introduce() {
            System.out.println("My name is " + name + " and I am " + age + " years old.");
        }
    }
    
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int age = 25;
        double price = 19.99;
        boolean isJavaFun = true;
        String greeting = "Hello, Java!";
        System.out.println("price, isJavaFun, greeting : " +  price + isJavaFun + greeting);

        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is not greater than 5");
        }
        System.out.println(" add 3, 4 = " + add(3, 4));
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(" add 3, 4 = " + numbers);
        
        Person person1 = new Person();
        person1.name = "Alice";
        person1.age = 30;
        person1.introduce();
    }
    public static int add(int a, int b) {
        return a + b;
    }
   

}
/*
1. + in System.out.println
2. array name dont print entire array , but its address
3. int, double, boolean, String ...works for data types, exact speellings.
4. multiiple classes in single file ok
5. mainly in class create variables and methods and use that class by creating its object
6. main method is executing by default 
*/


