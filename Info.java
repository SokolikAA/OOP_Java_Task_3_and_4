public class Info extends Family {


    public Info(Object name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public String toString() {
        return
                "Имя - " + name +
                ", возраст - " + age +
                ", пол - " + getGender();
    }
}
