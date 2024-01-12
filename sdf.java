

class Attendance{

    void mark(){

        System.out.println("Mass bunk");

    }

    void mark(String...s){

        System.out.println(s.length+" students present");

        for(String detail:s){

            System.out.println(detail);

        }

    }

}

class sdf{

    public static void main(String[] args){

        Attendance sebd = new Attendance();

        sebd.mark();

        sebd.mark("jeeva");

    }

}