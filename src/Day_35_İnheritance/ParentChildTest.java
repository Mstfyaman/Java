package Day_35_İnheritance;

public class ParentChildTest {
    public static void main(String[] args) {

        ChildClass childClass=new ChildClass();
       // childClass.print_message_P();
        childClass.print_message_C();

        ParentClass parentClass=new ParentClass();
      //  parentClass.print_message_C();    //parent class child classın methodlarına
                                            //ve fieldslerine erişemez



    }
}
