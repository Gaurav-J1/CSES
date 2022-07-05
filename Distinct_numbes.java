        FastReader scn = new FastReader();
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            
            arr[i] = scn.nextInt();
        }
 
        Arrays.sort(arr);
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                ans++;
            }
        }
        System.out.println(ans);
