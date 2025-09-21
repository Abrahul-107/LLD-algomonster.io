class Car:
    def __init__(self, brand, model):
        self.brand = brand
        self.model = model
        self.speed = 0.0

    def accelerate(self, acc_speed):
        self.speed += acc_speed

    def display(self):
        print(f"The car of brand {self.brand} and model {self.model} is running at speed : {self.speed} KM/H")


class ClassesAndObjects:
    @staticmethod
    def main():
        corolla = Car("Toyota", "COROLLA")
        mustang = Car("Ford", "Mustang")

        corolla.accelerate(250)
        mustang.accelerate(300)

        corolla.display()
        mustang.display()


if __name__ == "__main__":
    ClassesAndObjects.main()
