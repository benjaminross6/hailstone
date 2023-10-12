class hailstone_computer {

    public static int max = 1;
    public static int steps = 0;

    public static int transform(int a) {
        if(a > max) {
            max = a;
        }
        
        if(a == 1) {
            steps = -3;
        }
        
        if (a % 2 != 0) {
            a = 3 * a +1;
        } else {
            a = a / 2;
        }

        steps++;

        return a;
    }

    public static void complete(int start) {
        max = 1;
        steps = 0;
        while(start != 1) {
            start = transform(start);
        }
    }
    public static void main(String args[]){
        int maxstepnumber = 1;
        int maxstep = 0;
        for(int m = 1; m <= 10000; m++) {
            complete(m);
            //System.out.println("number: " + m + ", steps: " + steps + ", max: " + max);
            System.out.println(m  + ", " + steps);
            if(steps > maxstep) {
                //System.out.println(m + ", " + steps /*  + "--" + (Math.log(m)) + ", " + Math.log(steps)) */ );
                maxstep = steps;
                maxstepnumber = m;
            }
        }
        System.out.println("max max: " + maxstep + " steps at " + maxstepnumber);
    }
}
