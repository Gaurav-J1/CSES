        FastReader scn = new FastReader();
        int np = scn.nextInt();
        int[] dp = new int[np + 1];
        dp[0] = 1;
        for (int i = 1; i < np + 1; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i - j >= 0) {
                    dp[i] = (dp[i] + dp[i - j]) % 1000000007;
                }
 
            }
        }
        System.out.println(dp[np]);
