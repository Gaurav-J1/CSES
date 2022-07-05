        FastReader scn = new FastReader();
        long n = scn.nextLong();
        long answer = 0;
        long div = 5;
        int i = 2;
        while (n / div > 0) {
            answer += n / div;
            div = (long)Math.pow(5, i);
            i++;
        }
 
        System.out.println(answer);
