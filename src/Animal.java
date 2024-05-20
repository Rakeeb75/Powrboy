public class Animal {

        String Name ;
        String Type;
        String Sounds;

    Animal (String Name,String Type,String Sounds) {

            this.Name = Name ;
            this.Type = Type ;
            this.Sounds = Sounds ;
        }

        void zoo () {

            System.out.println("animal can shout");
        }

        void project () {
            System.out.println("SoftwareEnginear is best in POS Projects ");
        }


        void Information () {
            System.out.println(" Information of Animal");
            System.out.println( "animal Name = " + Name);
            System.out.println( "animal type = " + Type);
            System.out.println( "animal sound = " + Sounds);

        }

    }




