public class Solution {
    //    public static String replaceSpace(StringBuffer stringBuffer) {
//        int length = stringBuffer.length();
//        StringBuffer result = new StringBuffer();
//        for (int i = 0; i < length; i++) {
//            char character = stringBuffer.charAt(i);
//            if (" ".equals(String.valueOf(character))) {
//                result.append("%20");
//            } else {
//                result.append(character);
//            }
//        }
//        return result.toString();
//    }
    public static String replaceSpace(StringBuffer stringBuffer) {
        return stringBuffer.toString().replaceAll("\\s", "%20");
    }
}
