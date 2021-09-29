/*   Created by IntelliJ IDEA.
 *   Author: Ompal Singh (Ompal-Singh)
 *   Date: 9/28/2021
 *   Time: 5:58 PM
 *   File: MyMain.java
 */

package main;

public class MyMain {
    public static void main(String[] args){

    }
    public boolean search (int[] arr, int searchElement){
        boolean response = false;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == (searchElement)){
                response =  true;
                break;

            }

        }
        return response;
    }
    // find the index of search element in given arr
    public int findIndex(int[] arr, int searchElement){
        return -1;
    }
    public int findIndex(int[] arr, int givenElement, int n){
        return -1;
    }
}
