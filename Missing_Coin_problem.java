        FastReader scn = new FastReader();
        int np = scn.nextInt();
        ArrayList<Long> al = new ArrayList<>();
        for (int l = 0; l < np; l++) {
            al.add(scn.nextLong());
        }
        Collections.sort(al);
        if (al.get(0) != 1) {
            System.out.println(1);
        } else {
            ArrayList<Long> prefix = new ArrayList<>();
            prefix.add((long)1);
            long answer = 0;
            for (int i = 1; i < al.size(); i++) {
                if (prefix.get(i - 1) < al.get(i) - 1) {
                    answer = prefix.get(i - 1) + 1;
                    break;
                }
                prefix.add(prefix.get(i - 1) + al.get(i));
            }
            if (answer == 0) {
                answer = prefix.get(prefix.size() - 1) + 1;
            }
            System.out.println(answer);
 
 
        }
