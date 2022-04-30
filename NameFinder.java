public class NameFinder {
    public boolean FindName(String[] nameArray, String name){
        for(int i = 0; i < nameArray.length; i++){
            if(name.equals(nameArray[i])){
                System.out.println("Name found!");
                return true;
            }
        }
        System.out.println("Name not found :(");
        return false;
    }

}
