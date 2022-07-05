        FastReader scn = new FastReader();
        int n = scn.nextInt();
        long max = scn.nextLong();
        ArrayList<Long> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scn.nextLong());
        }
        Collections.sort(arr);
 
        int i = 0;
        int j = n - 1;
        long ans = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) > max) {
                ans++;
                j--;
                if (j - i == 0) {
                    ans++;
                }
            } else {
                ans++;
                i++;
                j--;
                if (j - i == 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
