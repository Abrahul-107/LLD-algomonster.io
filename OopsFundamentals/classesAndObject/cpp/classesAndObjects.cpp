#include <iostream>
#include <string>
using namespace std;

class Car 
{
private:
    string brand;
    string model;
    double speed;

public:
    // Constructor
    Car(string b, string m) 
    {
        brand = b;
        model = m;
        speed = 0.0;
    }

    // Accelerate method
    void accelerate(double accSpeed) 
    {
        speed += accSpeed;
    }

    // Display method
    void display() const 
    {
        cout << "The car of brand " << brand
             << " and model " << model
             << " is running at speed : "
             << speed << " KM/H" << endl;
    }
};

int main() 
{
    Car corolla("Toyota", "COROLLA");
    Car mustang("Ford", "Mustang");

    corolla.accelerate(250);
    mustang.accelerate(300);

    corolla.display();
    mustang.display();

    return 0;
}
