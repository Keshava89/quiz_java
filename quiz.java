import java.util.Scanner;

class Question {
    String prompt;
    String answer;

    public Question(String prompt, String answer) {
        this.prompt = prompt;
        this.answer = answer;
    }
}

public class Quiz {
    public static void main(String[] args) {
        Question[] questions = {
            new Question("What is the capital of France? \n(a) Paris \n(b) Rome \n(c) Madrid \nYour answer: ", "a"),
            new Question("What is 2 + 2? \n(a) 2 \n(b) 3 \n(c) 4 \nYour answer: ", "c"),
            new Question("Which planet is known as the Red Planet? \n(a) Venus \n(b) Mars \n(c) Jupiter \nYour answer: ", "b"),
            new Question("Who wrote 'To Kill a Mockingbird'? \n(a) J.K. Rowling \n(b) Harper Lee \n(c) Stephen King \nYour answer: ", "b"),
            new Question("What is the chemical symbol for water? \n(a) Wa \n(b) W \n(c) H2O \nYour answer: ", "c"),
            new Question("What is the largest mammal in the world? \n(a) Elephant \n(b) Blue Whale \n(c) Giraffe \nYour answer: ", "b"),
            new Question("What is the tallest mountain in the world? \n(a) Mount Everest \n(b) K2 \n(c) Mount Kilimanjaro \nYour answer: ", "a")
        };

        runQuiz(questions);
    }

    public static void runQuiz(Question[] questions) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        for (Question question : questions) {
            System.out.print(question.prompt);
            String answer = input.nextLine().toLowerCase();
            if (answer.equals(question.answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }

        System.out.println("You got " + score + " out of " + questions.length + " questions correct.");
    }
}
