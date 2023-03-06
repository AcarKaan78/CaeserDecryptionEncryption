public class Decryption1 {

    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public String DecryptionOfCaesar(int key,String code)
    {
        code = code.toLowerCase();
        StringBuilder DecryptedText = new StringBuilder();
        for(int i = 0;i < code.length();i++)
        {
            int charPosition = alphabet.indexOf(code.charAt(i));
            if (Character.isAlphabetic(code.charAt(i)))
            {
                int keyVal = (key + charPosition) % 26;
                char replaceVal = alphabet.charAt(keyVal);
                DecryptedText.append(replaceVal);
            } else {
                DecryptedText.append(code.charAt(i));
            }
        }
        return DecryptedText.toString();
    }
}
