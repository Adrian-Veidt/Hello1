public class Main {

    public static void main(String[] args) {

        

        Queue LongQ = new Queue(100);
        Queue ShortQ = new Queue(4);
        char ch;
        int i;

        System.out.println("LongQ for some ABC shit");

        for (i = 0; i < 26; i++)
            LongQ.put((char)('A' + i));

        System.out.println("And showing what LongQ got at this moment:");

        for (i=0; i <26; i++) {
            ch = LongQ.get();
            if (ch != (char) 0 ) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("ShortQ is used for demonstration of errors");
        for (i=0; i<5; i++) {
            System.out.println("trying to save in Quee " + (char)('Z'-i) );
            ShortQ.put((char)('Z'-i));
            System.out.println();
        }
        System.out.println();
        System.out.println("ShortQ: ");
        for (i=0; i<5; i++) {
            ch = ShortQ.get();
            if(ch != (char) 0) System.out.println(ch);
        }

    }
}
