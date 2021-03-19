

    public class DuplicatesFrequency {
        public static void main(String[] args) {
            //String str ="java is java language is useful";
            String str = "asss dddd f ghhh jj k";
            //output:a1s3 d4 f1 g1h3 j2 k1
            System.out.println("word/char and frequency = " + frequency(str));
        }
        public static String frequency(String str) {
            String result = "";
            int k=0;
            while (str.length() > 0) {
                int count = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.substring(i, i + 1).contains(str.substring(0, 1)))
                        count++;
                }
                //if(count=2)
                if (str.charAt(0) != ' ') {
                    if(!result.contains(str.substring(0, 1))){
                    result += str.substring(0, 1) + count;}
                }else{
                    result += " ";

                }
                k+=count;
                //result += str.substring(0, 1);
                str=str.replaceFirst(str.substring(0, 1), "");

            }
            return result;
        }
    }


