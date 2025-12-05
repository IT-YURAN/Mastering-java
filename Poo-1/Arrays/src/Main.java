public class Main {

    public static void main(String[] args) {

        int [] numbers={ //This is a dynamic array, it does not have a defined size
          4,5,6,9,7,2,4,
        };
        System.out.println(numbers[0]); //output: 4 'cause is the first element
        System.out.println(numbers.length); //output: 7

        //Array of objects

        Student[] student; //Declaration

        //Initialization
        student=new Student[3]; //This is a fixed size and can not be changed

        //Adding students to the array
        student[0]=new Student("Alfred",1);
        student[1]=new Student("Mel",2);
        student[2]=new Student("Liza",3);

        for (int i = 0; i <student.length ; i++) {
            System.out.println(student[i].toString());
        }




    }
}
