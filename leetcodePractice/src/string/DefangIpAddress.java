package string;

public class DefangIpAddress {

    public static void main(String[] args) {
        String address = "1.1.1.1";
        String address1 = "255.100.50.0";
        System.out.println(defangIPaddr(address));
        System.out.println(defangIPaddr(address1));
    }
    public static String defangIPaddr(String address) {

        return address.replace(".", "[.]");
    }

    public static String defangIPNaive(String address){
        String newIp = "";

        for(int i=0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                newIp += "[.]";
            } else {
                newIp += address.charAt(i);
            }
        }
        return newIp;
    }
}
