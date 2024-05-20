 class SoftwareEnginear {

    String Name ;
    String expertise;
    String project;

    SoftwareEnginear(String Name,String expertise,String project) {

        this.Name = Name ;
        this.expertise = expertise ;
        this.project = project ;
    }

    void expertise () {

        System.out.println("softwareendeneer is  expertise in java");
    }

    void project () {
        System.out.println("SoftwareEnginear is best in POS Projects ");
    }


    void Information () {
        System.out.println(" Information of Softwareengineer");
        System.out.println( "Softname Name = " + Name);
        System.out.println( "Softexpet  = " + expertise);
        System.out.println( "softproj  = " + project);

    }

}


