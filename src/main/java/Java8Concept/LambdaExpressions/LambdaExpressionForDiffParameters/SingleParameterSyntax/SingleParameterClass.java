package Java8Concept.LambdaExpressions.LambdaExpressionForDiffParameters.SingleParameterSyntax;

public class SingleParameterClass {

    public static void main(String[] args) {

        SingleParameter singleParameter = (p)-> System.out.println("name is:" +p);
        singleParameter.name("Saurabh");

    }
}
