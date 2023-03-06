public class Encryption {

    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public String EncryptionOfCaesar(int key,String code)
    {
        code = code.toLowerCase();
        StringBuilder cipherText = new StringBuilder();
        for (int ii = 0; ii < code.length(); ii++) {
            if (Character.isAlphabetic(code.charAt(ii))) {
                int charpos = alphabet.indexOf(code.charAt(ii));
                int keyVal = (charpos - key) % 26;
                if (keyVal < 0) {
                    keyVal = alphabet.length() + keyVal;
                }
                char replaceChar = alphabet.charAt(keyVal);
                cipherText.append(replaceChar);
            } else {
                cipherText.append(code.charAt(ii));
            }
        }
        return cipherText.toString();
    }
}
