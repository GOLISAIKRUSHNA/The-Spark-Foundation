package Basic_folder.Pattern2;

import java.util.*;
/**
 * Solid_Rhombus
 */
public class Solid_Rhombus {

    static void Solid_Rhombus(int row){

        for(int i=1;i<=row;i++){

            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Solid_Rhombus(4);
    }
    
} 