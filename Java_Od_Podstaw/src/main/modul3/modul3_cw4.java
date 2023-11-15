class Scratch {
    public static void main(String[] args) {

        String text = "race car";
        String modifiedText = text.replace(" ", "");
        StringBuilder result = new StringBuilder();
        
        for (int i =modifiedText.length()-1; i>=0; i--) {
            result.append(modifiedText.charAt(i));
        }
        System.out.println(modifiedText.contentEquals(result));
    }
}