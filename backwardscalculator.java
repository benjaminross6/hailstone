class backwardscalculator{
    public static int steps = 0;
    public static int transform(int a) {
        if(a == 1) {
            steps = -3;
        }
        
        if (a % 2 != 0) {
            a = 3 * a + 1;
        } else {
            a = a / 2;
        }

        steps++;

        return a;
    }

    public static int steps(int a) {
        while(a != 1) {
            a = transform(a);
        }
        int x = steps;
        steps = 0;
        return x;
    }
    public static void main(String args[]) {
        int nw = 1;
        while(steps(nw) < 50 && nw < Integer.MAX_VALUE / 2) {
        //for(int i = 1; i < 1000; i++) {
            System.out.println(nw + ", steps: " + steps(nw));
            int testodd = (nw - 1) / 3;
            if((nw-1) % 3 == 0 && testodd % 1 == 0 && testodd % 2 !=0 && testodd % 3 != 0 && testodd != 1) {
                nw = (nw - 1) / 3;
            } else {
                nw *= 2;
            }
        }
        //System.out.println(steps(9));
    }
}
