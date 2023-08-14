class Myclass:
    x = 50


p1 = Myclass
print(p1.x)


class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age


p1 = Person("John", "40")
p2 = Person("James", "57")

print(p1.name)
print(p2.age)


class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def __str__(self):
        return f"{self.name}({self.age})"


p1 = Person("John", 36)
