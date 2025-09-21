package OopsFundamentals.classesAndObject.java;
class Car
{
    private String Brand;
    private String model;
    private double speed;

    public Car(String brand,String model)
    {
        this.Brand = brand;
        this.model = model;
        this.speed = 0.0;

    }
    public void accelerate(double accSpeed)
    {
        speed += accSpeed;
    }
    public void display()
    {
        System.out.println("The car of brand "+Brand+" and model "+ model+ " is running at speed : "+speed+" KM/H");
    }
}

class ClassesAndObjects
{
    public static void main(String[] args) 
    {
        Car corolla = new Car("Toyota", "CORROLA");
        Car mustang = new Car("Ford", "Mustang");

        corolla.accelerate(250);
        mustang.accelerate(300);

        corolla.display();
        mustang.display();

    }
}