import java.util.Scanner;
class Student_Grade
{
    public static void main(String[] args)
    {
        System.out.println("Enter The Five Subjects Marks :");
        int marks[] = new int[5];
        int i;
        float total=0;
        Scanner scanner = new Scanner(System.in);


        for(i=0; i<5; i++) {
            System.out.print("Enter Marks of Subject No "+(i+1)+":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        float per = total/5;
        System.out.println("The total marks obtained is :"+total+ " Out of 500");
        System.out.println("The total percentage is  : "+per+" %");
        if(per>=90)
            System.out.println("Grade A");
        else if(per>=80)
            System.out.println("Grade B");
        else if(per>=70)
            System.out.println("Grade C");
        else if(per>=60)
            System.out.println("Grade D");
        else if(per>=40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");
    }
}