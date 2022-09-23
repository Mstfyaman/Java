package Day_32_Constructors_Cont;

public class Square {

       public int sideLenght;


        public Square(){

        }

     public Square(int sideLenght){
           this.sideLenght=sideLenght;
     }

     public int calculateArea(){                           // alan hesaplama
            return (int) Math.pow(this.sideLenght,2);
     }

     public double calculateArea(int sideLenght){          // alan hesaplama
         return Math.pow(this.sideLenght,2);
     }

    public int  calculatePerimeter(){                        // cevre hesaplama
        return 4*(this.sideLenght);
    }

    public double  calculatePerimeter(int sideLenght){       // cevre hesaplama
        return 4*sideLenght;
    }







}
