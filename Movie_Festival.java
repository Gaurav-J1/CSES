public static void main(String[] args) {
 
        FastReader scn = new FastReader();
        int np = scn.nextInt();
        ArrayList<Pair> al = new ArrayList<>();
        for (int l = 0; l < np; l++) {
            long a = scn.nextLong();
            long b = scn.nextLong();
            al.add(new Pair(a, b));
 
        }
        Collections.sort(al);
        int answer = 1;
        long val1 = al.get(0).present;
        for (int i = 1; i < al.size(); i++) {
            long val2 = al.get(i).val;
            
            if (val2 >= val1) {
                answer++;
                val1 = al.get(i).present;
            } else {
 
            }
 
        }
        System.out.println(answer);
  
    }
 

    }
    static class Pair implements Comparable<Pair> {
        long val;
        long present;
        Pair(long val , long present) {
            this.val = val;
            this.present = present;
        }
        @Override
        public int compareTo(Pair that) {
            return (int)this.present - (int)that.present;
        }
        public String toString() {
            return val + " " + present;
        }
    }
