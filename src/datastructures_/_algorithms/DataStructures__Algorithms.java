/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures_._algorithms;

import com.algorithms.sorting.Selection;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Arun
 */
public class DataStructures__Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("Selection.txt");
        Scanner sc= new Scanner(file);
        List<Integer> list=new ArrayList<>();
        int [] a= new int[16];
        int count=0;
        while(sc.hasNextInt()){
            a[count]=sc.nextInt();
            count++;
        }
        
        Selection.sort(a);
        Selection.show(a);
        
    }
    
}
