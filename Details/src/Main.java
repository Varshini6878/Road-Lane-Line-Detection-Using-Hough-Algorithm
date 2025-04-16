
class Students {
    String name;
    int rollno;
    int marks;

    Students(String n, int r, int m) { //constructor
        name = n;
        rollno = r;
        marks = m;
    }
    void showDetails() { // shows details
        System.out.println("Name:" + name);
        System.out.println("RollNo:" + rollno);
        System.out.println("Marks:" + marks);

        // Create student details
            Students[] students = new Students[3];
            students[0] = new Students("Varshini", 53, 90);
            students[1] = new Students("Sheebika", 43, 80);
            students[3] = new Students("Hema", 33, 70);

            //Display student details
            for (int i = 0; i < 4; i++) {
                students[i].showDetails();
            }
        }
    }