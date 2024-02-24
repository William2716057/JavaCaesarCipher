public class CaesarCipher {
    public static String encrypt(String plaintext, int shift) {
        StringBuilder ciphertext = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            if (Character.isLetter(ch)) {
                char shifted = (char) (((ch - 'a' + shift) % 26) + 'a');
                ciphertext.append(shifted);
            } else {
                ciphertext.append(ch);
            }
        }
        return ciphertext.toString();
    }

    public static String decrypt(String ciphertext, int shift) {
        return encrypt(ciphertext, 26 - shift);
    }

    public static void main(String[] args) {
        String plaintext = "message";
        int shift = 5;
        String encrypted = encrypt(plaintext, shift);
        System.out.println("Encrypted: " + encrypted);
        String decrypted = decrypt(encrypted, shift);
        System.out.println("Decrypted: " + decrypted);
    }
}
