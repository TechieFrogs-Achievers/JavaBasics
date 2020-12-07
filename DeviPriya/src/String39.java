public class String39 {
    public static void main(String argu[]) {
    for ( String word : splitWords ) {
        Integer oldCount = occurrences.get(word);
        if ( oldCount == null ) {
           oldCount = 0;
        }
        occurrences.put(word, oldCount + 1);
     }
    }
}
