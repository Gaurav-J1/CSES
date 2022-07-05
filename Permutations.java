        FastReader scn = new FastReader();
        int n = scn.nextInt();
 
        if (n == 1) {
            System.out.println(1);
        } else if (n <= 3) {
            System.out.println("NO SOLUTION");
        }
 
        else {
            StringBuilder str = new StringBuilder();
            for (int i = 1; i <= n / 2; i++) {
                str.append(2 * i + " ");
            }
            int i = 1;
            while (i <= n) {
                str.append(i + " ");
                i += 2;
            }
            System.out.println(str.toString());
        }
