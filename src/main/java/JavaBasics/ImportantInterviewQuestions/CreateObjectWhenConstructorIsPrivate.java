package JavaBasics.ImportantInterviewQuestions;

public class CreateObjectWhenConstructorIsPrivate {

    int age;

    private CreateObjectWhenConstructorIsPrivate() {

        age=30;
    }

    ;

    static {
        CreateObjectWhenConstructorIsPrivate createObjectWhenConstructorIsPrivate = new CreateObjectWhenConstructorIsPrivate();
    }

    public static int createObject(){
        CreateObjectWhenConstructorIsPrivate createObjectWhenConstructorIsPrivateOne = new CreateObjectWhenConstructorIsPrivate();
        createObjectWhenConstructorIsPrivateOne.age=40;
        return createObjectWhenConstructorIsPrivateOne.age;
    }


}
