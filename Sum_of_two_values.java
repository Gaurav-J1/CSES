    public static void main(String[] args) {

        FastReader scn = new FastReader();
        int n = scn.nextInt();
        long x = scn.nextLong();
        ArrayList<Pair> al = new ArrayList<>();
        for (int l = 0; l < n; l++) {
            al.add(new Pair(scn.nextLong(), l));
        }
        Collections.sort(al);
        int i = 0;
        int j = al.size() - 1;
        boolean f = false;
        while (i < j ) {
            if (al.get(i).val + al.get(j).val > x) {
                j--;
            } else if (al.get(i).val + al.get(j).val < x) {
                i++;
            } else {
                f = true;
                break;
            }
        }
        if (f) {
            System.out.println((al.get(i).present + 1) + " " + (al.get(j).present + 1));
        } else {
            System.out.println("IMPOSSIBLE");
        }

    }

    static class Pair implements Comparable<Pair> {
        long val;
        int present;
        Pair(long val , int present) {
            this.val = val;
            this.present = present;
        }
        @Override
        public int compareTo(Pair that) {
            return (int)this.val - (int)that.val;
        }
        public String toString() {
            return val + " " + present;
        }
    }
