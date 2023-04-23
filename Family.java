public class Family <T> implements Human  {

    T name;
    int age;

    private Gender gender;


    public Family(T name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    @Override
    public T getName() {
        return name;
    }


    @Override
    public void setName(Object name) {
        this.name = (T) name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int value) {
        this.age = value;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = Gender.valueOf(gender);
    }


}
