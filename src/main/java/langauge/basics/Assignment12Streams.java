/*
 * package langauge.basics;
 * 
 * import java.util.Arrays; import java.util.stream.Stream;
 * 
 * public class Assignment12Streams {
 * 
 * public Assignment12Streams() { // TODO Auto-generated constructor stub }
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * String sentence = "Java programming is fun and challenging";
 * 
 * long count = Arrays.stream(sentence.trim().split("\\s")).filter(word ->
 * !word.isEmpty()).count();
 * 
 * System.out.println("word count: "+count);
 * 
 * String reverse = Arrays.stream(sentence.split("\\s+"))
 * .collect(collectors.collectingAndThen(collectors.toList());
 * 
 * list->{collectios.reverse(list); return String.join(" ", list); } )); }}
 */