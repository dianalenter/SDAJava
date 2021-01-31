package fundamentals;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;    ///constructor fara parametrii
    }

    public void setName(String name) {
        this.name = name;            //setez (private)
    }

    public String getName() {
        return this.name;            //accesez (private)
    }

    //metoda eguals --am  suprascris metoda eguals

    public boolean equals(Dog dog) {
        return (this.name == dog.getName());
    }
}
