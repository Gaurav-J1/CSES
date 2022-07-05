        FastReader scn = new FastReader();
        String str = scn.next();
        int ans = 1;
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
                if (count > ans) {
                    ans = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.print(ans);
