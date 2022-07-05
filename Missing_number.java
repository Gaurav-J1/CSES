        
        FastReader scn = new FastReader();
        long n = scn.nextLong();
        long sum = 0;
 
 
        for (int i = 0; i < n - 1 ; i++){
            sum += scn.nextLong();
        }

        System.out.println(((n * (n + 1)) / 2 ) - sum);    // n(n+1)/2 is the sum for 1-n


