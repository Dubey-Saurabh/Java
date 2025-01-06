package Java8Concept.LambdaExpressions.UseOfLambdaExpression;

public class Lambda {

    /*it is an anonymous function or method which is having no name, no return type and no access modifiers*/
    /*if a method has a single statement body we don't have to put curly braces in body*/
    /*Don't have to put data type in arguments as Compiler itself understand the situation and will compile it*/
    /*No return keyword*/
    /*if only one parameter or argument is there then no need to place bracket as well*/

    public static void main(String[] args) {

        Employee employee = () -> "Saurabh";
        System.out.println(employee.getName());

    }

}
