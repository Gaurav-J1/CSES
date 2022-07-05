        FastReader scn = new FastReader();
        int np = scn.nextInt();
        long[] arr = new long[np];
        for (int l = 0; l < np; l++) {
            arr[l] = scn.nextLong();
        }
        long current_max = arr[0];
        long max = arr[0];
        for (int i = 1; i < np; i++) {
            if (current_max + arr[i] > arr[i]) {
                current_max = current_max + arr[i];
            } else {
                current_max = arr[i];
            }
            max = Math.max(max, current_max);
 
        }
        System.out.println(max);
