 class Poweboy {

     int Num ;
     String name;
     String Clr;
     String Power;

     Poweboy (int Num,String name,String Clr,String Power) {

         this.Num = Num;
         this.name = name ;
         this.Clr = Clr ;
         this.Power = Power ;
     }
       public Poweboy() {
            //comment
           //hi batch 86
     }
         void Jump () {
             System.out.println("Powerboy can Study");
         }

         void Color () {
             System.out.println("Powerboy has a unique color");
         }

         void Power () {
             System.out.println("Powerboy has an power");
         }

         void Information () {
             System.out.println(" Information of powerboy");
             System.out.println(  "poweboy  num = " + Num);
             System.out.println( "Powerboy Name = " + name);
             System.out.println( "Powerboy Clr = " + Clr);
             System.out.println( "Powerboy Power = " + Power);

         }

     }


