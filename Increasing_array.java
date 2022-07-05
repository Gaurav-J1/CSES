        FastReader scn = new FastReader();
        int n = scn.nextInt();
        long[] arr = new long[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextLong();
            if (i >= 1) {
                if (arr[i] - arr[i - 1] < 0) {
                    ans += arr[i - 1] - arr[i];
                    arr[i] = arr[i] + (arr[i - 1] - arr[i]);
                    
                }
            }
        }
        System.out.print(ans);
