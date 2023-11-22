public class Methods {
    public static String lPad(String str, int length, char padChar) {
        StringBuilder paddedStr = new StringBuilder(length);
        int padLength = length - str.length();
        for (int i = 0; i < padLength; i++) {
            paddedStr.append(padChar);
        }

        paddedStr.append(str);
        return paddedStr.toString();
    }

    public static String rPad(String str, int length, char padChar) {
        StringBuilder paddedStr = new StringBuilder(length);
        paddedStr.append(str);
        int padLength = length - str.length();
        for (int i = 0; i < padLength; i++) {
            paddedStr.append(padChar);
        }

        return paddedStr.toString();
    }

    public static String encrypt(String str, int key) {
        str = str.toUpperCase();
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int temp = (str.charAt(i) + key % 26);

            if (temp >= 91) {
                temp = 65 + temp % 91;
            }
            encrypted.append((char) temp);
        }
        return encrypted.toString();
    }

    public static String decrypt(String str, int key) {
        str = str.toUpperCase();
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int temp = (str.charAt(i) - key % 26);

            if (temp < 65) {
                temp = Math.abs(65 - temp - 91);
            }
            encrypted.append((char) temp);
        }
        return encrypted.toString();
    }

    public static void countAlphabates(String str) {
        int digit = 0;
        int upperCase = 0;
        int lowerCase = 0;
        int other = 0;
        int space = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                digit++;
            } else if (Character.isUpperCase(c)) {
                upperCase++;
            } else if (Character.isLowerCase(c)) {
                lowerCase++;
            } else if (Character.isWhitespace(c)) {
                space++;
            } else {
                other++;
            }

        }
        System.out.println("LowerCase: " + lowerCase);
        System.out.println("UpperCase: " + upperCase);
        System.out.println("Digits: " + digit);
        System.out.println("Space: " + space);
        System.out.println("Other: " + other);

    }

    public static int stringCount(String str, String target) {
        int index = 0;
        int count = 0;
        while (true) {
            if (str.indexOf(target, index) == -1) {
                break;
            }
            index = 1 + str.indexOf(target, index);
            count++;
        }
        return count;
    }

    public static int stringCount(String str, char target) {
        int index = 0;
        int count = 0;
        while (true) {
            if (str.indexOf(target, index) == -1) {
                break;
            }
            index = 1 + str.indexOf(target, index);
            count++;
        }
        return count;
    }

    public static int tokenCount(String str, String key) {
        int index = 0;
        int count = 1;
        while (true) {
            if (str.indexOf(key, index) == -1) {
                break;
            }
            index = str.indexOf(key, index) + key.length();
            count++;
        }
        return count;
    }
}
