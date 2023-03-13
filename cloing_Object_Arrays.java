public class cloing_Object_Arrays {
    private String name;
    private int number;

    public cloing_Object_Arrays(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "copy_array_from_another_array_object{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
