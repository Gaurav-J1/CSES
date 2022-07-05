        FastReader scn = new FastReader();
        int np = scn.nextInt();
        int m = scn.nextInt();
        long k = scn.nextLong();
        ArrayList<Long> applicants = new ArrayList<>();
        ArrayList<Long> appartments = new ArrayList<>();
 
        for (int l = 0; l < np; l++) {
            applicants.add( scn.nextLong());
        }
        for (int l = 0; l < m; l++) {
            appartments.add(scn.nextLong());
        }
        Collections.sort(applicants);
        Collections.sort(appartments);
        int i1 = 0;
        int i2 = 0;
        int answer = 0;
        while (i1 < applicants.size() && i2 < appartments.size()) {
            if (appartments.get(i2) <= applicants.get(i1) + k && appartments.get(i2) >= applicants.get(i1) - k) {
                answer++;
                i1++;
                i2++;
            } else if (appartments.get(i2) > applicants.get(i1) + k) {
                i1++;
            } else {
                i2++;
            }
        }
        System.out.println(answer);
 
