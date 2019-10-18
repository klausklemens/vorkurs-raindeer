class Test {
    public static void main(String[] args) {
        if (args.length >= 2) {
            if (args[0].equals("-s")) {
                System.out.println(args[1] + " ist " + (schaltjahr(args[1])?"ein":"kein") + " Schaltjahr");
            }
        } else {
            System.out.println("Nicht genug Argumente!!");
        }
    }

    static boolean schaltjahr(String jahr_str) {
        int jahr = 0;
        try {
            jahr = Integer.parseInt(jahr_str);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("\"" + jahr_str + "\" ist keine Nummer!");
            System.exit(0);
        }

        return (jahr % 4 == 0) && ( (jahr % 100 != 0) || (jahr % 400 == 0) );
    }
}
