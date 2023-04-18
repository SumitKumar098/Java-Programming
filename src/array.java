public class array {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 8 };
        System.out.println("\tThis is a value of array\n" + arr[1]);

        System.out.println("***********");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("***********");

        arr[3] = 45;
        for (int value : arr) { //For each loop
            System.out.println(value);
        }

        int [][] multiarr={{34,53,23,56},{43,23,22,12}};
        System.out.println(multiarr[0][3]);

        System.out.println("----------");

        for(int j=0,i=0;j<multiarr.length && i<multiarr.length;j++,i++){
            System.out.println(multiarr[j][i]);
        }

        System.out.println("-----------");

        String [] name={"Ram","Sham","Mohan","Sumit"};
        for(String value:name){
            System.out.println(value);
        }
        System.out.println("$$$$$$$$$$$$");
        
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
    }
}
