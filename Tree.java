import java.util.ArrayList;


public class Tree {
    public static void main(String[] args) {
        ArrayList<Info> familyMember = new ArrayList<>();
        familyMember.add(new Info("Елена", 45, Gender.женский));
        familyMember.add(new Info("Алексей", 44, Gender.мужской));
        familyMember.add(new Info("Олеся", 23, Gender.женский));
        familyMember.add(new Info("Денис", 25, Gender.мужской));
        familyMember.add(new Info("Юля", 23, Gender.женский));
        familyMember.add(new Info("Денис", 3, Gender.мужской));

        for (Info info : familyMember) {
            System.out.println(info.toString());
        }
        System.out.println("Члены семьи женского пола: ");
        for (Info info : familyMember) {
            Comparison check = (n, m) -> info.getGender() == Gender.женский;
            if (check.compare(info.getGender(), Gender.женский)) {
                System.out.println(info);
            }
        }
        System.out.println("Члены семьи мужского пола: ");
        for (Info info : familyMember) {
            Comparison check = (n, m) -> info.getGender() == Gender.мужской;
            if (check.compare(info.getGender(), Gender.мужской)) {
                System.out.println(info);
            }
        }


    }
}
