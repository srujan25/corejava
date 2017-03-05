package inheritance;

/**
 * Created by SG0221519 on 2/9/2017.
 */
public class InheritanceRules {

}

class Sub extends InheritanceRules {

    //--Valid scenarios
    //1. InheritanceRules class reference and InheritanceRules class Object
    InheritanceRules super1 = new InheritanceRules();

    //2. Sub class reference and Sub class object
    Sub sub1 = new Sub();

    //3. InheritanceRules class reference and sub class Object
    InheritanceRules super2 = new Sub();

    //4. InheritanceRules class reference and sub class reference
    Sub sub2 = new Sub();
    InheritanceRules super3 = sub2;


    //--Not valid
    //1.Sub class reference and InheritanceRules class object
    //Sub sub3 = new InheritanceRules(); //incompatible types c error

    //2. Sub class reference and InheritanceRules class reference
    InheritanceRules sup4 = new InheritanceRules();
    //Sub sub4 = sup4; // incompatible types c error

}
