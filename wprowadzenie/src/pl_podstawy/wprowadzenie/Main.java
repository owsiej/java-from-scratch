package pl_podstawy.wprowadzenie;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        for (int i=1; i<101; i++) {
//            if (i%15==0) {
//                System.out.println("FizzBuzz");
//            }
//            else if (i % 3==0) {
//                System.out.println("Fizz");
//            } else if (i%5==0) {
//                System.out.println("Buzz");
//            }
//            else {System.out.println(i);
//                }
//            }
        ////////////////////////////////////////////////////////////////
//        Random random = new Random();
//        int numberToGuess=random.nextInt(100) +1;
//
//        Scanner scanner = new Scanner(System.in);
//
//        boolean wasNumberGet=false;
//  /* ! - operator NOT, czyli w tym wypadku while działa póki wasNumberGet jest false */
//        while (!wasNumberGet) {
//            System.out.println("Podaj liczbę.");
//            int userNumber = scanner.nextInt();
//
//            if (userNumber<numberToGuess) {
//                System.out.println("Liczba jest za mała");
//            } else if (userNumber>numberToGuess){
//                System.out.println("Liczba jest za duża");
//            } else {
//                System.out.println("Brawo, to jest właściwa liczba");
//                wasNumberGet=true;
//            }
//        }
        ////////////////////////////////////////////////////////////////
        // - najpierw określamy typ,
        // - poźniej nadajemy nazwę zmiennej,
        // - new - służy do tworzenia nowej instacji klasy;
        // - String[4] - stworzenie nowej 4 elementowej tablicy stringow
//        String[] names = new String[4];
//        String[] names = {"Mariusz", "Dominik", "Kasia", "Asia"};


//        for (int i = 0; i< names.length; i++) {
//            System.out.println(names[i]);

//        for (String name : names) {
//            System.out.println(name);
//        }
        ////////////////////////////////////////////////////////////////

//        List<String> names = new ArrayList<>();
//        names.add("Mariusz");
//        names.add("Dominik");
//        names.add("Błażej");
//
//        Collections.sort(names);
//
//        System.out.println(names.get(2));
//        System.out.println(names.contains("Kamil"));
//        for (String name: names) {
//            System.out.println(name);
//        }
        ////////////////////////////////////////////////////////////////

//        Set<String> meals = new HashSet<>();
//
//        meals.add("Pizza");
//        meals.add("Burger");
//        meals.add("Pizza");
//        meals.add("Salad");
//        for (String meal : meals) {
//            System.out.println(meal);
//
//        }
        ////////////////////////////////////////////////////////////////
//        Map<String, String> nameToMeal = new HashMap<>();
//
//        nameToMeal.put("Mariusz", "Pizza");
//        nameToMeal.put("Dominik", "Burger");
//        nameToMeal.put("Kamil", "Burger");
//
//        System.out.println(nameToMeal.get("Dominik"));
//
//        Set<String> keys = nameToMeal.keySet();
////        Collection<String> values = nameToMeal.values();
//        for (String key: keys) {
//            System.out.println(key);

//        }
        //////////////////////////////////////////////////////////
//        int[] tab = {1,12,41,12,51,12};
//        int result = 0;
//
//        for (int liczba: tab) {
//            result+=liczba;
//        }
//        System.out.println(result);
//    }
//////////////////////////////////////////////////////////////
//    public class Main {
//        public static int minPathSum(int[][] grid) {
//            if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
//                return 0;
//            }
//            int m = grid.length;
//            int n = grid[0].length;
//            int[][] temp = new int[m][n];
//
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (i == 0 && j == 0) {
//                        temp[i][j] = grid[i][j];
//                        continue;
//                    }
//                    // Compute temp
//                    int from_up = i == 0 ? Integer.MAX_VALUE : temp[i - 1][j];
//                    int from_left = j == 0 ? Integer.MAX_VALUE : temp[i][j - 1];
//                    temp[i][j] = Math.min(from_up, from_left) + grid[i][j];
//                }
//            }
//            return temp[m - 1][n - 1];
//        }
//        /* Driver program to test above functions */
//        public static void main(String[] args) {
//
//            int[][] grid = new int[][] {{7,4,2},
//                    {0,5,6},
//                    {3,1,2}};
//
//            System.out.println("Sum of all numbers along its path: "+minPathSum(grid));
//        }
//    }
//
/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 1 liczbę");
        int input1 = scanner.nextInt();
        System.out.println("Podaj 2 liczbę");
        int input2 = scanner.nextInt();
        System.out.println("Podaj 3 liczbę");
        int input3 = scanner.nextInt();
        System.out.println(((double)input1+input2+input3)/3);
*/
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wyraz");
        String input1 = scanner.nextLine();

        String result= "";
        for (int i=input1.length()-1; i>=0; i--) {
            result+=input1.charAt(i);
        }
        System.out.println(result);
*/
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wyraz");

        String input = scanner.nextLine();
        int letters=0;
        int spaces=0;
        int digits=0;
        int other=0;

        for (char chr: input.toCharArray()) {
            if (Character.isLetter(chr)) {
                letters++;
            } else if (Character.isDigit(chr)) {
                digits++;
            } else if (Character.isWhitespace(chr)) {
                spaces++;
            } else {
                other++;
            }
        }
            System.out.println("Letters - "+letters);
            System.out.println("Digits - "+digits);
            System.out.println("Spaces - "+spaces);
            System.out.println("Other - "+other);
*/
        /*
        String name = "Cameron";
        String site = "TechTarget";
        int above = -31231;
        int below = 42342;

        System.out.printf("I like the stuff %s writes on %S. %n", name, site);
        System.out.printf("I like the stuff %15s %n", name, site);
        System.out.printf("%015d lol", above);
*/
//        Date data = new Date();
//        System.out.println(data);

//        String text = "34";
//        System.out.printf("number %+d",Integer.parseInt(text));
        /*
    int start = 5;
    int end = 20;
    int p = 3;
    int result=0;
    for(int i=start; i<=20; i++) {
        if (i%p==0) {
            result++;
        }
    }
        System.out.println(result);
*/
        /*
        String text="jestem sobie tekstem i wkurwiam ludzi.";

        String[] arr = text.split(" ");
        System.out.println(arr[arr.length-2]);

        StringBuilder stringBuilder = new StringBuilder(text);
        System.out.println(stringBuilder.replace(0,6,"cośwpiszemy"));
*/
        /*
        int i, flag = 0;
        int result=0;
        int count=0;
        for (int n = 2;count!=100; n++) {
            for (i = 2; i <= n / 2; i++) {
                flag=0;
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                result+=n;
                count++;
            }

        }
        System.out.println(result);
        */
/*
        int[] arr ={20,30,40,50,60,70,67};
        int[] arr2=new int[arr.length];
        int index = arr.length-1;

        for (int numb: arr) {
            arr2[index]=numb;
            index--;
        }
        System.out.println(Arrays.toString(arr2));

*/
        /*
        int[] arr1 = {1,3,-5,4};
        int[] arr2 = {1,4,-5,-2};

        for (int i=0; i< arr1.length; i++) {
            System.out.println(arr1[i]*arr2[i]);
        }

         */
        /*
        String text="Python";
        String text2 = text.substring(text.length()-3);
        System.out.println(text2+text+text2);

         */
/*
        int numb = 15;

        do {
            if (numb%2==0) {
                numb/=2;
            } else {
                numb=numb*3+1;
            }
            System.out.println(numb);
        } while (numb!=1);

 */
        /*
        int[] arr = {10,10,23,4,1,23,10,10};
        boolean flag=false;

        for (int i=0; i<arr.length-1; i++) {
            if (arr[i]==10 && arr[i+1]==10) {
                if (!flag) {
                    flag=true;
                    continue;
                } else {
                    flag=false;
                    break;
                }
                            }
            if (arr[i]==20 && arr[i+1]==20) {
                if (!flag) {
                    flag=true;

                } else {
                    flag=false;
                    break;
                }
            }
        }
        System.out.println(flag);

         */

//        String text="cgaadsdisdfkdgdsf";
//        int offset=10;
//        int spot;
//        int start;
//        int x=0;
//
//        if (text.length()%offset==0) {
//            spot=0;
//            start=0;
//        } else {
//            spot=1;
//            start=text.length()%offset;
//        }
//
//        String[] tokens = new String[(text.length()/offset)+spot];
//
//        if (start!=0) {
//            String firstToken=text.substring(0,text.length()%offset);
//            tokens[x++]=firstToken;
//        }
//        for (int i=start; i<=text.length()-offset; i+=offset) {
//            tokens[x++]=text.substring(i,i+offset);
//        }
//        System.out.println(Arrays.toString(tokens));

        /*
        String source ="Python";
        String target ="tho";

        if (source == null || target == null) {
            System.out.println(-1);
        }
        if ("".equals(target) || source.equals(target)) {
            System.out.println(0);
        }
        int i = 0;
        int last = source.length() - target.length() + 1;
        while (i < last) {
            if (source.charAt(i) == target.charAt(0)) {
                boolean equal = true;
                for (int j = 0; j < target.length() && equal; ++j) {
                    if (source.charAt(i + j) != target.charAt(j)) {
                        equal = false;
                    }
                }
                if (equal) {
                    System.out.println(i);
                }
            }
            ++i;
        }
        System.out.println(1);;
        */

//        int numb =3425345;
//        char[] arr = String.valueOf(numb).toCharArray();
//        System.out.println(arr.length);

        /*
        int numberOfRows = 4;
        int numberOfDigits = 1;
        int numberOfSpaces = numberOfRows - numberOfDigits;

        for (int i = 1; i <= numberOfRows; i++) {
            for (int y = numberOfSpaces; y > 0; y--) {
                System.out.print(" ");
            }
            for (int x = 0; x < numberOfDigits; x++) {
                System.out.print(i + " ");
            }
            numberOfDigits++;
            numberOfSpaces--;
            System.out.println("");
        }
        */
        /*
        int numberOfRows = 10;
        int numberOfDigits = 1;
        int numb=1;
        for (int i=1; i<=numberOfRows; i++) {
            for (int x=0; x<numberOfDigits; x++) {
                System.out.print(numb+" ");
                numb++;
            }
            numberOfDigits++;
            System.out.println("");
        }
*/
        /*
        int[] arr = {0,0,0,1,0,1,0,1,1,0,1,1,0,1,0,1};

        int range = arr.length-1;

        for (int i=0; i<range; i++) {
            if (arr[i]==1) {
                while (arr[range]==1) {
                    range--;
                }
                int temp=arr[range];
                arr[range]=arr[i];
                arr[i]=temp;
                range--;
            }
        }
        System.out.println(Arrays.toString(arr));

         */

//        String text = "xxx";
        String str ="h";
        String word = "ix";
/*
        String newText = text.substring(0, Math.min(text.length(), 2)).replace("x", "");
        System.out.println(newText+text.substring(Math.min(text.length(), 2)));

 */
/*
        if (text.endsWith("x")) {
            text=text.substring(0,length-1);
        }
        if (text.startsWith("x")){
            text=text.substring(1);
        }
        System.out.println(text);

 */
        /*
        if (word.length()==1) {
            System.out.println(str.substring(0,1));
        } else {
            if (str.substring(1,word.length()).equals(word.substring(1))) {
                System.out.println(str.substring(0,word.length()));
            } else {
                System.out.println();
            }
        }

         */

//        String model = "Toyota";
//        int productionYear = 1956;
//        String condition = "brand-new";
//
//        System.out.printf("This car is a %s.%nProducion Year: %d.%nIt's in %s condition.%n", model, productionYear, condition);
    }

}


