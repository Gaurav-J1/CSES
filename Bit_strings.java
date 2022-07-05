        FastReader scn = new FastReader();
        int n = scn.nextInt();
        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans *= 2;
            ans = ans % 1000000007;
        }
        System.out.print(ans);
