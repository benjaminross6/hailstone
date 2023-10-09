class hailstone_calculator{
    
    //one step
    public static int transform(int a){
        //if a is a multiple of 2 (even) then divide by 2. If it isn't even, multiply by 3, and add 1
        if(a%2 != 0) {
            a = 3*a +1;
        } else {
            a = a/2;
        }
        System.out.print(a + ", ");
        return a;
    }

    public static void main(String args[]) {
        int b = (int) (Math.random() * 1000); //871 has the most steps of the numbers between 1 and 1000
        System.out.println("The number is: " + b);
        System.out.println(b);
        int i = 0;

        //steps will continue until number returns to 1
        while(b != 1) {
            b = transform(b);
            i++;
        }
        System.out.println("\nDone in " + i + " steps.");
    }
}
