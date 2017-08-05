package becker;

import becker.robots.*;
import java.util.Scanner;

public class CuartosKarel
{
   public static void main(String[] args)
  {  
      //  ESTABLECER QUE NUMEROS COLOCAR EN CUARTOS 
             Scanner lector = new Scanner(System.in); 
             
             int num[];
             num = new int[3];
             System.out.println("ingrese los números que se colocaran en el tablero");
             for(int b=0;b<3;b++)
             {
             System.out.println("ingrese "+(b+1)+" numero");
             num[b]=lector.nextInt();
             }
             System.out.println("los numeros elegidos fueron = ");
             for(int b=0;b<3;b++)
             {
             System.out.print(num[b]+",");
             }
             
      City bogota = new City();
     // ESTABLECE LAS PAREDES DE LOS CUARTOS
      int k=1;
      int f=3;
      for(int j=0;j<3;j++){
          if (j==0)
            {
            Wall pared1 = new Wall (bogota, 5, 1, Direction.SOUTH);
            Wall pared2 = new Wall (bogota, 5, 3, Direction.SOUTH);      
            for(int i=1;i<6;i++){
                Wall pared = new Wall (bogota, i, 1, Direction.WEST);
            }
            for(int i=1;i<4;i++){
                Wall pared = new Wall (bogota, 1, i, Direction.NORTH);
            }
            for(int i=1;i<6;i++){
                Wall pared = new Wall (bogota, i, 3, Direction.EAST);
            }
            } 
          if(j==1)
           {
            Wall pared3 = new Wall (bogota, 5, 4, Direction.SOUTH);
            Wall pared4 = new Wall (bogota, 5, 6, Direction.SOUTH);      
            for(int i=4;i<7;i++){
                Wall pared = new Wall (bogota, 1, i, Direction.NORTH);
            }
            for(int i=1;i<6;i++){
                Wall pared = new Wall (bogota, i, 6, Direction.EAST);
            }
            }
            if(j==2)
           {
            Wall pared5 = new Wall (bogota, 5, 7, Direction.SOUTH);
            Wall pared6 = new Wall (bogota, 5, 9, Direction.SOUTH);      
            for(int i=7;i<10;i++){
                Wall pared = new Wall (bogota, 1, i, Direction.NORTH);
            }
            for(int i=1;i<6;i++){
                Wall pared = new Wall (bogota, i, 9, Direction.EAST);
            }
            }
             // LUGAR DE INICIO KAREL
             Robot karel = new Robot(bogota, 6, 2, Direction.NORTH,5);
      }   
      switch(num[0]){
          case 0:
              Thing parcel1 = new Thing(bogota, 1, 1);
              Thing parcel2 = new Thing(bogota, 1, 2);
              Thing parcel3 = new Thing(bogota, 1, 3);
              Thing parcel4 = new Thing(bogota, 2, 1);
              Thing parcel5 = new Thing(bogota, 3, 1);
              Thing parcel6 = new Thing(bogota, 4, 1);
              Thing parcel7 = new Thing(bogota, 5, 1);
              Thing parcel8 = new Thing(bogota, 5, 2);
              Thing parcel9 = new Thing(bogota, 5, 3);
              Thing parcel10 = new Thing(bogota, 4, 3);
              Thing parcel12 = new Thing(bogota, 3, 3);
              Thing parcel13 = new Thing(bogota, 2, 3);
              break;
          case 1:
              Thing parcel11 = new Thing(bogota, 1, 3);
              Thing parcel21 = new Thing(bogota, 2, 3);
              Thing parcel31 = new Thing(bogota, 3, 3);
              Thing parcel41 = new Thing(bogota, 4, 3);
              Thing parcel51 = new Thing(bogota, 5, 3);
              break;
          case 2:
              Thing parcel122 = new Thing(bogota, 1, 1);
              Thing parcel22 = new Thing(bogota, 1, 2);
              Thing parcel32 = new Thing(bogota, 1, 3);
              Thing parcel42 = new Thing(bogota, 2, 3);
              Thing parcel52 = new Thing(bogota, 3, 3);
              Thing parcel62 = new Thing(bogota, 3, 2);
              Thing parcel72 = new Thing(bogota, 3, 1);
              Thing parcel82 = new Thing(bogota, 4, 1);
              Thing parcel92 = new Thing(bogota, 5, 1);
              Thing parcel102 = new Thing(bogota, 5, 2);
              Thing parcel132= new Thing(bogota, 5, 3);
              break;
          case 3:
              Thing parcel123 = new Thing(bogota, 1, 1);
              Thing parcel23 = new Thing(bogota, 1, 2);
              Thing parcel33 = new Thing(bogota, 1, 3);
              Thing parcel43 = new Thing(bogota, 2, 3);
              Thing parcel53 = new Thing(bogota, 3, 3);
              Thing parcel63 = new Thing(bogota, 3, 2);
              Thing parcel73 = new Thing(bogota, 3, 1);
              Thing parcel83 = new Thing(bogota, 4, 3);
              Thing parcel93 = new Thing(bogota, 5, 3);
              Thing parcel103 = new Thing(bogota, 5, 2);
              Thing parcel133= new Thing(bogota, 5, 1);
              break;
          case 4:
              Thing parcel124 = new Thing(bogota, 1, 1);
              Thing parcel24 = new Thing(bogota, 2, 1);
              Thing parcel34 = new Thing(bogota, 3, 1);
              Thing parcel44 = new Thing(bogota, 3, 2);
              Thing parcel54 = new Thing(bogota, 3, 3);
              Thing parcel64 = new Thing(bogota, 2, 3);
              Thing parcel74 = new Thing(bogota, 1, 3);
              Thing parcel84 = new Thing(bogota, 4, 3);
              Thing parcel94 = new Thing(bogota, 5, 3);
              break;
          case 5:
              Thing parcel125 = new Thing(bogota, 1, 1);
              Thing parcel25 = new Thing(bogota, 1, 2);
              Thing parcel35 = new Thing(bogota, 1, 3);
              Thing parcel45 = new Thing(bogota, 2, 1);
              Thing parcel55 = new Thing(bogota, 3, 1);
              Thing parcel65 = new Thing(bogota, 3, 2);
              Thing parcel75 = new Thing(bogota, 3, 3);
              Thing parcel85 = new Thing(bogota, 4, 3);
              Thing parcel95 = new Thing(bogota, 5, 3);
              Thing parcel105 = new Thing(bogota, 5, 2);
              Thing parcel135= new Thing(bogota, 5, 1);
              break;
          case 6:
              Thing parcel16 = new Thing(bogota, 1, 1);
              Thing parcel26 = new Thing(bogota, 1, 2);
              Thing parcel36 = new Thing(bogota, 1, 3);
              Thing parcel46 = new Thing(bogota, 2, 1);
              Thing parcel56 = new Thing(bogota, 3, 1);
              Thing parcel66 = new Thing(bogota, 3, 2);
              Thing parcel76 = new Thing(bogota, 3, 3);
              Thing parcel86 = new Thing(bogota, 4, 1);
              Thing parcel96 = new Thing(bogota, 4, 3);
              Thing parcel106 = new Thing(bogota, 5, 1);
              Thing parcel126= new Thing(bogota, 5, 3);
              Thing parcel136 = new Thing(bogota, 5, 2);
              break;
          case 7:
              Thing parcel117 = new Thing(bogota, 1, 3);
              Thing parcel217 = new Thing(bogota, 2, 3);
              Thing parcel317 = new Thing(bogota, 3, 3);
              Thing parcel417 = new Thing(bogota, 4, 3);
              Thing parcel517 = new Thing(bogota, 5, 3);
              Thing parcel4117 = new Thing(bogota, 1, 1);
              Thing parcel51117 = new Thing(bogota, 1, 2);
              break;  
          case 8:
              Thing parcel18 = new Thing(bogota, 1, 1);
              Thing parcel28 = new Thing(bogota, 1, 2);
              Thing parcel38 = new Thing(bogota, 1, 3);
              Thing parcel48 = new Thing(bogota, 2, 1);
              Thing parcel58 = new Thing(bogota, 3, 1);
              Thing parcel68 = new Thing(bogota, 4, 1);
              Thing parcel78 = new Thing(bogota, 5, 1);
              Thing parcel88 = new Thing(bogota, 5, 2);
              Thing parcel98 = new Thing(bogota, 5, 3);
              Thing parcel108 = new Thing(bogota, 4, 3);
              Thing parcel128= new Thing(bogota, 3, 3);
              Thing parcel138 = new Thing(bogota, 2, 3);
              Thing parcel1388 = new Thing(bogota, 3, 2);
              break;
           case 9:
              Thing parcel19 = new Thing(bogota, 1, 1);
              Thing parcel29 = new Thing(bogota, 1, 2);
              Thing parcel39 = new Thing(bogota, 1, 3);
              Thing parcel49 = new Thing(bogota, 2, 1);
              Thing parcel59 = new Thing(bogota, 3, 1);
              Thing parcel69 = new Thing(bogota, 2, 3);
              Thing parcel79 = new Thing(bogota, 3, 3);
              Thing parcel89 = new Thing(bogota, 3, 2);
              Thing parcel99 = new Thing(bogota, 4, 3);
              Thing parcel109 = new Thing(bogota, 5, 3);
              break;
              
              
              
                      }
      
                 
                     
   }    
}

