package eksamen_host_2018.oppgave3;

class List {
    public static int storreEnNull(int [] list){
        int teller = 0;
        for (int i : list){
            if (i > 0){
                teller++;
            }
        }
        return teller;
    }

    public static int forekomst(int [] list, int tall){
        int teller = 0;
        for (int i : list){
            if (i == tall){
                teller++;
            }
        }
        return teller;
    }

    public static int storst(int [] list){
        int storst = 0;
        for (int i : list){
            if (storst < i){
                storst = i;
            }
        }
        return storst;
    }
}
