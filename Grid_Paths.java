        FastReader scn = new FastReader();
        int np = scn.nextInt();
        char[][] arr = new char[np][np];
        for (int i = 0; i < np; i++) {
            String str = scn.next();
            for (int j = 0; j < np; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        int[][] dp = new int[np][np];
        dp[0][0] = 1;
        for (int i = 0; i < np; i++) {
            for (int j = 0; j < np; j++) {
 
                if (arr[i][j] == '.') {
                    if (i - 1 >= 0) {
                        dp[i][j] += dp[i - 1][j];
                        dp[i][j] %= mod;
                    }
                    if (j - 1 >= 0) {
                        dp[i][j] += dp[i][j - 1];
                        dp[i][j] %= mod;
                    }
                } else {
                    dp[i][j] = 0;
                }
 
            }
        }
        System.out.println(dp[np - 1][np - 1]);
