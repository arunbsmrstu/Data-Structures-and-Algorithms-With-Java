/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures_._algorithms;

import com.algorithms.sorting.Data;
import com.algorithms.sorting.Insertion;
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
        
        Integer[] integerArray={100,45,87,194,33,87,43,6,78,90,43};
        Selection.sort(integerArray);
        Selection.show(integerArray);
    }
    
}
