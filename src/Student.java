class Student{

    //Syntax =   Type + Name + Value //

   int id ;
   String name;
   String email;
   int PhoneNum;

   //Syntax of Constructor = className + ( Pass Attribute ) + {this.AttributeName = AttributeName;}   //

    Student (int id,String name,String email,int PhoneNum) {

        this.id = id;
        this.name = name ;
        this.email = email ;
        this.PhoneNum = PhoneNum ;

    }

    public Student() {

    }

    //Syntax of method = Return type + method Name + () +{} //

    //study
    //read
    //eat

    void Study () {
        System.out.println("student can Study");
    }

    void Read () {
        System.out.println("Student can Read");
    }

    void Eat () {
        System.out.println("Student can Eat");
    }

    void information () {
        System.out.println("Student Information");
        System.out.println(  "Student id = " + id);
        System.out.println( "Student Name = " + name);
        System.out.println( "Student Email = " + email);
        System.out.println( "Student PhoneNumber = " + PhoneNum);

    }

}