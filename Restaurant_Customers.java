public static void main(String[] args) {
 
        FastReader scn = new FastReader();
        int np = scn.nextInt();
 
        ArrayList<Pair> arr = new ArrayList<>();
        for (int l = 0; l < np; l++) {
            long a = scn.nextLong();
            long b = scn.nextLong();
            arr.add(new Pair(a, 1));
            arr.add(new Pair(b, -1));
 
        }
        Collections.sort(arr);
        int max = 0;
        int answer = 0;
        for (Pair p : arr) {
            answer += (p.present);
            max = Math.max(max, answer);
        }
        System.out.println(max);
 
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
