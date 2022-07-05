        FastReader scn = new FastReader();
        int np = scn.nextInt();
        int x = scn.nextInt();
        int[] arr = new int[np];
        for (int l = 0; l < np; l++) {
            arr[l] = scn.nextInt();
        }
        int[] dp = new int[x + 1];
        dp[0] = 0;
        for (int i = 1; i <= x; i++) {
            dp[i] = 100000000;
            for (int j = 0; j < np; j++) {
                if (i - arr[j] >= 0 && dp[i - arr[j]] != -1) {
                    dp[i] = Math.min(dp[i], dp[i - arr[j]] + 1);
                }
            }
            if (dp[i] == 100000000) {
                dp[i] = -1;
            }
        }
       
        System.out.println(dp[x]);
