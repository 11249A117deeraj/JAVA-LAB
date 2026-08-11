public class stringfunctions {
    public static void main(String[]args){
        String str1="Java programming";
        String str2="java programming";
        String str3="Welcome to java ";
        System.out.println("Original string:"+str1);
        System.out.println("Length:"+str1.length());
        System.out.println("Character at index 5:"+str1.charAt(5));
        System.out.println("Substring(5)"+str1.substring(5));
        System.out.println("Substring(5,11): " + str1.substring(5,11));
        System.out.println("Concatenation: " + str1.concat(" Language"));
        System.out.println("Equals:"+ str1.equals(str2));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2));
        System.out.println("CompareTo: " + str1.compareTo(str2));
        System.out.println("CompareTo Ignore Case: " + str1.compareToIgnoreCase(str2));
        System.out.println("Contains 'java':"+ str1.contains("java"));
        System.out.println("Starts With 'Java': " + str1.startsWith("Java"));
        System.out.println("Ends With 'ming': " + str1.endsWith("ming"));
        System.out.println("Index of'p':"+ str1.indexOf('p'));
        System.out.println("Last Index of 'a': " + str1.lastIndexOf('a'));
        System.out.println("Replace java with python:"+str1.replace("java","python"));
        System.out.println("ReplaceAll vowels:"+ str1.replaceAll("[AEIOUaeiou]","*"));
        System.out.println("Upper Case: " + str1.toUpperCase());
        System.out.println("Lower Case: " + str1.toLowerCase());
        System.out.println("Trim: '" + str3.trim() + "'");
        String str4 = "";
        System.out.println("Is Empty: " + str4.isEmpty());
        String[] words = str1.split(" ");
        System.out.println("Split:");
        for(String word : words){
            System.out.println(word);
        }
        int num=100;
        String s = String.valueOf(num);
        System.out.println("ValueOf(): " + s);
        char[] ch =str1.toCharArray();
        System.out.println("Character Array:");
        for(char c : ch){
            System.out.println(c+"");
        }
        System.out.println();
        String joined= String.join("-","java","python","C++");
        System.out.println("Join:"+ joined);
        






        
           








    }
    
}
