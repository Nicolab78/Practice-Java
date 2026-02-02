import exo1.ReverseString;
import exo10.FusionArray;
import exo2.MaxArray;
import exo4.CharOccurs;
import exo44.ArrayContains;
import exo45.ReverseInt;
import exo46.IsPangram;
import exo47.IndexOfMax;
import exo48.MergeString;
import exo49.UniqueChars;
import exo50.Variance;
import exo6.ArraySum;
import exo7.Factorial;
import exo8.Palindrome;
import exo9.IndexOf;

import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        System.out.println("Test marche");

        /*
        ReverseString.run();
        System.out.println(ReverseString.reverse("Hello World"));

        System.out.println(ReverseString.reversefonct("Hello World")); // prog fontionnelle
        */


        /*
        MaxArray.run();
        int[] array = {1,5,3,9,2};
        System.out.println(MaxArray.MaxArray(array));


        System.out.println(MaxArray.MaxArrayfonct(array)); // prog fontionnelle
        */

        /*
        PrimeNumber.run();
        int number = 2;
        System.out.println("Is this number prime? " + PrimeNumber.isPrime(number));
        */

        /*
        CharOccurs.run();
        String s = "hello world";
        char c = 'o';
        System.out.println("The character " + c + " occurs " + CharOccurs.countChar(s,c) + " times in the string \"" + s + "\".");

        System.out.println("The character " + c + " occurs " + CharOccurs.countCharfonct(s,c) + " times in the string \"" + s + "\"."); // prog fonctionnelle

        */

        /*
        InstanceDeClasse.run();
        */

        /*

        ArraySum.run();
        int[] array = {1,2,3,4,5};
        System.out.println("The sum of the array is: " + ArraySum.ArraySum(array));

         System.out.println("The sum of the array is: " + ArraySum.ArraySumfonct(array)); // prog fonctionnelle

        */


        /*
        Factorial.run();
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + Factorial.Factorial(n));

        System.out.println("Factorial of " + n + " is: " + Factorial.Factorialfonct(n)); // prog fonctionnelle
        */


        /*
        Palindrome.run();
        String str = "radar";
        System.out.println("Is the string \"" + str + "\" a palindrome? " + Palindrome.isPalindrome(str));

        System.out.println("Is the string \"" + str + "\" a palindrome? " + Palindrome.isPalindromefonct(str)); // prog fonctionnelle
        */


        /*
        IndexOf.run();
        String s = "hello world";
        char c = 'h';
        System.out.println("The character " + c + " is found at index: " + IndexOf.IndexOf(s,c));

        System.out.println("The character " + c + " is found at index: " + IndexOf.indexOffonc(s,c)); // prog fonctionnelle
        */

        /*

        FusionArray.run();

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        int[] merged = FusionArray.merge(array1, array2);
        System.out.print("Merged array: ");
        for (int i : merged) {
            System.out.print(i + " ");
        }

        int[] mergedfonc = FusionArray.mergefonc(array1, array2); // // prog fonctionnelle
        System.out.print(" fonc Merged array: ");
        for (int i : merged) {
            System.out.print(i + " ");
        }

         */





        /*
        MinArray.run();
        int[] array = {7, 2, 8, 1, 4};
        System.out.println("The minimum value in the array is: " + MinArray.MinArray(array));

        */

        /*
        CountVowels.run();
        String str = "Hello World";
        System.out.println("The number of vowels in the string \"" + str + "\" is: " + CountVowels.countVowels(str));
        */

        /*
        ArrayReverse.run();
        int[] array = {1, 2, 3, 4, 5};
        int[] reversed = ArrayReverse.ArrayReverse(array);

        System.out.println("Original array: ");
        for (int i : array) {
            System.out.print("" + i + " ");
        }

        System.out.println("Reversed array: ");
        for (int i : reversed) {
            System.out.print("" + i + " ");
        }

        */

        /*
        IsArraySorted.run();
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Is the array sorted? " + IsArraySorted.isSorted(array));
        */

        /*
        SecondLargest.run();
        int[] array = {3, 5, 2, 9, 7};
        System.out.println("The second largest element in the array is: " + SecondLargest.SecondLargest(array));
        */

        /*
        CountWords.run();
        String str = "Education is the key to success.";
        System.out.println("The number of words in the string \"" + str + "\" is: " + CountWords.CountWords(str));
        */

        /*
        LongestWord.run();
        String str = "The beautiful quick brown fox jumps over the lazy dog";
        System.out.println("The longest word in the string \"" + str + "\" is: " + LongestWord.LongestWord(str));
         */

        /*
        ArrayAverage.run();
        int[] array = {2, 4, 6, 8, 10};
        System.out.println("The average of the array is: " + ArrayAverage.ArrayAverage(array));
        */

        /*
        CountChar.run();
        String s = "hello world";
        char c = 'o';
        System.out.println("The character " + c + " occurs " + CountChar.CountCharInString(s,c) + " times in the string \"" + s + "\".");

        System.out.println("Comptage de tous les caractères dans une chaîne:");
        System.out.println(s);
        CountChar.CountCharsInString(s);

         */

        /*
        LongestIncreasingArray.run();
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        System.out.println("The length of the longest increasing subsequence is: " + LongestIncreasingArray.longestIncreasing(arr));
        */

        /*
        IsAnagram.run();
        String s1 = "listen";
        String s2 = "silent";
        System.out.println("Are \"" + s1 + "\" and \"" + s2 + "\" anagrams? " + IsAnagram.isAnagram(s1, s2));
        */

        /*
        CountUnique.run();
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("The number of unique elements in the array is: " + CountUnique.CountUnique(array));
        */

        /*
        SmallestMissing.run();
        int[] array = {1, 2, 3, 5};
        System.out.println("The smallest missing positive integer is: " + SmallestMissing.SmallestMissing(array));
        */

        /*
        Power.run();
        int base = 2;
        int exponent = 3;
        System.out.println(base + " raised to the power of " + exponent + " is: " + Power.power(base, exponent));
        */

        /*
        ArrayEven.run();
        int [] array = {1, 2, 3, 4, 5, 6};
        ArrayEven.ArrayEven(array);
        */

        /*
        ArrayMedian.run();
        int[] array = {3, 1, 4, 2, 5};
        System.out.println("The median of the array is: " + ArrayMedian.ArrayMedian(array));
        */

        /*
        ArrayFrequent.run();
        int [] array = {1, 2, 3, 3, 3,  4, 4, 5, 6};
        System.out.println("The most Frequent int the array is " + ArrayFrequent.mode(array));
         */

        /*
        IsPerfectSquare.run();
        int n = 25;
        System.out.println("L'entier : "+ n + " est t'il un carré parfait ? : " + IsPerfectSquare.IsPerfectSquare(n));
        */

        /*
        CountDigits.run();
        int n = 123456;
        System.out.println("Number of digits in " + n + " is : " + CountDigits.CountDigits(n));
        */

        /*
        LargestPalindrome.run();
        int[] arr = {121, 44, 989, 10};
        System.out.println("The largest palindrome is : " + LargestPalindrome.LargestPalindrome(arr));
         */

        /*
        CountUpperCase.run();
        String s = "AaaaBbbbCccc";
        System.out.println("The number of uppercase in the string is : " + CountUpperCase.CountUpperCase(s));
         */

        /*
        SumEven.run();
        int[] arr = {121, 44, 989, 10};
        System.out.println("The number of even numbers is : " + SumEven.CountEven(arr));
        */

        /*
        MostFrequent.run();
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3};
        System.out.println("The most frequent int is " + MostFrequent.mostFrequent(arr));
         */

        /*
        IsNumeric.run();
        String str = "1236572168";
        System.out.println("Is the string a digit ? : " + IsNumeric.IsNumeric(str));
         */

        /*
        FindProduct.run();
        int[] arr = {2, 3, 4};
        System.out.println("The products in the array are : " + FindProduct.FindProduct(arr));
         */

        /*
        CountGreaterThan.run();
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3};
        int value = 2;
        System.out.println("The nombre d'élément supérieur à "+ value +  " est : " + CountGreaterThan.CountGreaterThan(arr,value));
         */

        /*
        SmallestEven.run();
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("The smallest even is : " + SmallestEven.SmallestEven(arr));
        */

        /*
        EqualArray.run();
        int [] a = {2, 3, 4};
        int [] b = {2, 3, 4};
        System.out.println("Are the array equal ? : " + EqualArray.EqualArray(a,b));
        */

        /*
        SumOdd.run();
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("The sum of the odd numbers in the array is : " + SumOdd.SumOdd(arr));
        */

        /*
        RotateRight.run();
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int [] rotated = RotateRight.RotateRight(arr);
        for ( int i : rotated){
            System.out.print(i + " ");
        }
         */

        /*
        PGCD.run();
        int a = 25;
        int b = 15;
        System.out.println("The gcd of " + a + " and " + b + " is " + PGCD.PGCD(a,b));
        */

        /*
        ArrayContains.run();
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int value = 2;
        System.out.println("Does the array contains " + value + " ? :" + ArrayContains.ArrayContains(arr, value));
         */

        /*
        ReverseInt.run();
        int a = 12345;
        System.out.println("Reverse of " + a + " is :" + ReverseInt.ReverseInt(a));
        */

        /*
        IsPangram.run();
        String string = "The quick brown fox jumps over the lazy dog";
        System.out.println("Is the String: "+string + " a pangram ? : " + IsPangram.IsPangram(string));
        */

        /*
        IndexOfMax.run();
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("The max index is : " + IndexOfMax.indexOfMax(arr));
        */

        /*
        MergeString.run();
        String a = "abc";
        String b = "efg";
        System.out.println("Merge String : " + MergeString.MergeString(a,b));
        */

        /*
        UniqueChars.run();
        String string = "hello world";
        System.out.println("The number of unique char in " + string + " is : " + UniqueChars.UniqueChar(string) );
        */

        /*
        Variance.run();
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("The Variance of the array is : " + Variance.variance(arr));
         */


    }
}
