public class string {
    public static void main(String[] args) {
        String name_1="ramesh";
        String employee="ramesh";
        //same address place used by name and employee
        System.out.println(name_1 == employee); //return true (shallow search compares only add)
        String tenent=new String("ramesh");
        System.out.println("shallow search "+(name_1==tenent)); //return false since diff add space
        System.out.println("deep search "+employee.equals(tenent));//check value return true
        
    }

    string substring(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    string substring(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
