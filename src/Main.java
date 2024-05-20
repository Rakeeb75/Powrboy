import java.util.Scanner;

 class main {

    public static void main(String []args){

                Scanner obj1 = new Scanner(System.in);

        int St_id ;
        String St_name,Department,Address;
        int Mobile_num;
        String Email;
        int Proggramming_mark,pp_mark,DDD_mark,Networking_mark,SQL_mark;

        System.out.println("Enter Student_id");
        St_id = Integer.parseInt(obj1.next());

        System.out.println("enter Student_name");
        St_name = obj1.next();

        System.out.println("enter Department");
        Department = obj1.next();

        System.out.println("enter Address");
        Address = obj1.next();

        System.out.println("enter Mobile_num");
        Mobile_num = Integer.parseInt(obj1.next());

        System.out.println("enter Email");
        Email = obj1.next();

        System.out.println("enter Proggramming_mark");
        Proggramming_mark = Integer.parseInt(obj1.next());

        System.out.println("enter pp_mark");
        pp_mark = Integer.parseInt(obj1.next());

        System.out.println("enter DDD_mark");
        DDD_mark = Integer.parseInt(obj1.next());


        System.out.println("enter Networking_mark");
        Networking_mark = Integer.parseInt(obj1.next());

        System.out.println("enter SQL_mark");
        SQL_mark = Integer.parseInt(obj1.next());

        System.out.println("Studdent_id = " + St_id);
        System.out.println("Student_name = " + St_name);
        System.out.println("Department = " + Department);
        System.out.println("Address = "+Address);
        System.out.println("Mobile_number = " + Mobile_num);
        System.out.println("email = "+ Email);
        System.out.println("Programming_marks = " +Proggramming_mark);
        System.out.println("profational practice mark = " + pp_mark);
        System.out.println("DDD mark = " + DDD_mark);
        System.out.println("Networking marks = " + Networking_mark);
        System.out.println("SQL mark = " +SQL_mark);

        int total = pp_mark+Proggramming_mark+Networking_mark+DDD_mark+SQL_mark;
        System.out.println("total = " + total);

        int Avg = total /5;
        System.out.println("Avarage =" + Avg);

        String Grade ;
        if (total >= 480) {
            Grade = "A";
        } else if (total>= 400) {
            Grade ="B";
        } else if (total>= 350) {
            Grade = "C";
        }else Grade = "W";
        System.out.println("grade =" + Grade);


    }
}