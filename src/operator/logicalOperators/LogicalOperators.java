package operator.logicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean isInterviewQuestionsSent = false;
        boolean isJavaHomeworkSent = false;

        System.out.println("The student is okay (OR): " + (isInterviewQuestionsSent || isJavaHomeworkSent));
        System.out.println("The student is okay (AND): " + (isInterviewQuestionsSent && isJavaHomeworkSent));

        System.out.println("\nThe student did NOT send the homework: " + !isInterviewQuestionsSent);

    }
}
