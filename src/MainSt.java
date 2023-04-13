public class MainSt {
    public static void main(String[] args) {
        StringsMethods obj = new StringsMethods();
        int opc;

        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    obj.carxcar();
                    break;
                case 2:
                    obj.veces();
                    break;
//                case 3:
//                    obj.palindromo();
//                    break;
//                case 4:
//                    obj.cuenta();
//                    break;
                default:
                    break;
            }
        } while (opc != 0);
    }
}
