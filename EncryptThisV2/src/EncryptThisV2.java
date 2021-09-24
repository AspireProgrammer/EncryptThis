public class EncryptThisV2 {
    public static void main(String[] args) {
        String text = "A wise old owl lived in an oak";
        String encryption = "";
        String[] array = text.split(" ");

        if (text.length() == 0) {
            System.out.println(encryption);
        } else {

            for (String txt : array) {

                if (txt.length() == 1) {
                    char letter = txt.charAt(0);
                    int ascii = (int) letter;

                    encryption = encryption + String.valueOf(ascii) + " ";


                }

                if (txt.length() == 2) {
                    char letter = txt.charAt(0);
                    int ascii = (int) letter;

                    encryption = encryption + String.valueOf(ascii) + txt.charAt(1) + " ";
                }
                if (txt.length() == 3) {
                    char letter = txt.charAt(0);
                    int ascii = (int) letter;

                    encryption = encryption + String.valueOf(ascii) + txt.charAt(2) + txt.charAt(1) + " ";
                }
                if (txt.length() >= 4) {
                    char letter = txt.charAt(0);
                    int ascii = (int) letter;

                    String secondLetter = txt.substring(1, 2);

                    String lastLetter = txt.substring(txt.length() - 1);

                    encryption = encryption + String.valueOf(ascii) + lastLetter + txt.substring(2, txt.length() - 1) + secondLetter + " ";

                }

            }

            System.out.println(encryption.substring(0, encryption.length() - 1));
            
        }
    }
}


