package AdvancedAlgorithm;
import java.util.ArrayList;
import java.util.List;
public class KNUTHMORRIESPATH {


        public static int[] calcPrefixLen(String pattern) {
            int patternLen = pattern.length();
            int[] ar = new int[patternLen + 1];
            ar[0] = -1;
            ar[1] = 0;

            int prefixLen = 0;
            int i = 1;

            while (i < patternLen) {
                if (pattern.charAt(prefixLen) == pattern.charAt(i)) {
                    prefixLen++;
                    i++;
                    ar[i] = prefixLen;

                } else if (prefixLen > 0) {
                    prefixLen = ar[prefixLen]; // note  that we do not increment i here

                } else {
                    i++;
                    ar[i] = 0; // 'prefixLen' reached 0, so save that into ar[] and move forward
                }
            }

            return ar;
        }


        public static List<Integer> search(String text, String pattern) {
            int t = 0; // the position of the current character in text
            int p = 0; // the position of the current character in pattern

            int tLen = text.length();
            int pLen = pattern.length();

            List<Integer> matches = new ArrayList<>();
            int[] prefixLen = calcPrefixLen(pattern);

            while (t < tLen) {
                if (pattern.charAt(p) == text.charAt(t)) {
                    p++;
                    t++;

                    if (p == pLen) {
                        // occurrence found, if only first occurrence is needed then you could halt here
                        matches.add(t-p);
                        p = prefixLen[p]; // reset
                    }
                } else {
                    p = prefixLen[p];
                    if (p < 0) {
                        t++;
                        p++;
                    }
                }
            }

            return matches;
        }

        public static void main(String[] args) {
            String text = "aaaaracarac";
            String pattern = "car";

            System.out.println("text="+text);
            System.out.println("pattern=" + pattern);

            System.out.println(search(text, pattern));
        }
    }

