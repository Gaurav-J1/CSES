        FastReader scn = new FastReader();
        int np = scn.nextInt();
        ArrayList<Long> al = new ArrayList<>();
        for (int l = 0; l < np; l++) {
            al.add(scn.nextLong());
        }
        Collections.sort(al);
        long final_length = al.get(np / 2); // median
        long answer = 0;
        for (int i = 0; i < np; i++) {
            answer += Math.abs(final_length - al.get(i));
        }
        System.out.println(answer);
