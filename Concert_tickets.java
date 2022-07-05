        TreeMap<Integer, Integer> tickets = new TreeMap<>();
        ArrayList<Integer> customers = new ArrayList<Integer>();
 
        int noOfTickets = reader.ni();
        int noOfCustomers = reader.ni();
 
        int ticketPrice;
 
        for (int i = 0; i < noOfTickets; i++) {
            ticketPrice = reader.ni();
            if (!tickets.containsKey(ticketPrice)) {
                tickets.put(ticketPrice, 1);
            } else {
                tickets.replace(ticketPrice, tickets.get(ticketPrice), tickets.get(ticketPrice) + 1);
            }
        }
 
 
        Integer temp = 0;
 
        for (int i = 0; i < noOfCustomers; i++) {
 
            temp = tickets.floorKey(reader.ni());
 
            if (temp == null) {
                result.append("-1\n");
                continue;
            }
 
            if (tickets.get(temp) == 1) {
                tickets.remove(temp);
            } else {
                tickets.replace(temp, tickets.get(temp), tickets.get(temp) - 1);
            }
            result.append(temp + "\n");
        }
 
        System.out.println(result);
 
    }
