import java.util.*;
class Grader
{
    private int score;
    Grader (int score)
    {
        this.score=score;
    }
    public String letterGrade()
    {
        if(score>=90)
        {
            return "O";
        }
        else if(score>=80)
        {
            return "E";
        }
        else if(score >=70)
        {
            return "A";
        }
        else if(score>=60)
        {
            return "B";
        }
        else if(score>=50)
        {
            return "C";
        }
        else
        {
            return "F";
        }
    }
}
class Assignment_4
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int score;
        String grade;
        System.out.println("Enter your score to obtain the grade : " );
        score=obj.nextInt();
        if(score<0||score>100)
        {
            System.out.println("Invaild score! please enter a score between 0 and 100. ");
        }
        else
        {
            Grader grader = new Grader(score);
            grade=grader.letterGrade();
            System.out.println("The grade is : " + grade);
        }
    }
}