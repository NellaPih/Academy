package fi.Academy;

public class Person {
    private String name;
    private int age;

    public Person(String uusiNimi, int uusiIka) {
        this.name = uusiNimi;
        this.age = uusiIka;

    }

    public void setName(String uusiNimi) {
        this.name = uusiNimi;

    }

    public void setAge(int uusiIka) {
        this.age = uusiIka;
    }

    public String getNimi() {
        return this.name;
    }

    public int getIka() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
