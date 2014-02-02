//practice on using records and basic manipulation on array


public class StudentDataBase {
    private static Student[] studentArray = new Student[100];
    private static int numStudent=0;
    
    //insert student at a given index (index has to be between 0-numStudent)
    //basically shift the students after the index to the right by 1
    //then assign the new student to the index
    //1 2 3 4 -> 1 2 (7) 3 4
    public void insertEntry(int index,Student student){ 
        //if index is out of bound
        if (index > numStudent || index<0){
            System.out.println("Index is invalid, insertion unsuccessfull");
        }else{
          //if index is the next empty entry
            if (index==numStudent){
                studentArray[index]=student;
            }else{//if index is between two existing students
                //create a temporary array to store students after the index
                Student[] tempArray = new Student[numStudent-index];
                //populate the temporary array
                for (int i=0; i<tempArray.length;i++){
                    tempArray[i]=studentArray[index+i];
                }
                //assign the index with new student
                studentArray[index]=student;
                //load back what's in the temporary array to the end of student array
                for (int i=0;i<tempArray.length;i++){
                    studentArray[index+1+i]=tempArray[i];
                }
            }
            //increase number of student by 1
            numStudent++;
        }
    }
    
    //delete student at given index 
    //(basically shift the students after the index to the left by 1)
    //1 2 3 4 -> 1 3 4 (empty)
    public void deleteEntry(int index){
        //if index out of bound
        if (index >= numStudent || index<0){
            System.out.println("Index is invalid, deletion unsuccessfull");
        }else{
            //index is fine, so decrease number of student by 1
            numStudent--;
            //delete the last student
            if (index==numStudent){
                studentArray[index]=null;
            }else{//if to delete student that's between two existing student
                //create temporary array to store what's after the index
                Student[] tempArray = new Student[numStudent-index];
                //populate the temporary array
                for (int i=0; i<tempArray.length;i++){
                    tempArray[i]=studentArray[index+1+i];
                }
                //make the last student null
                studentArray[numStudent]=null;
                //load back what's in the temporary array
                for (int i=0;i<tempArray.length;i++){
                    studentArray[index+i]=tempArray[i];
                }
            }
        }
    }
    //display entry using formatted printing
    public void display(){
        System.out.printf("%-20s%-20s%-20s\n", "Student ID", "Student Name", "Grade");
        for (Student s : studentArray){
            if (s==null){
                break;
            }else{
                System.out.printf("%-20d%-20s%-20.2f\n", s.id, s.name, s.grade);
            }
        }
    }
    
    //return the number of students in the array
    public int getNumStudent(){
        return numStudent;
    }
}
