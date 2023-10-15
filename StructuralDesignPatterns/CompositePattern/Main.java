package StructuralDesignPatterns.CompositePattern;

public class Main {
    public static void main(String[] args) {

        Directory parentDir = new Directory();
        parentDir.add(new File("fileAtLevel1"));

        Directory childDir = new Directory();
        childDir.add(new File("file1AtLevel2"));
        childDir.add(new File("file2AtLevel2"));
        parentDir.add(childDir);

        // Traverse the entiry FileSystem starting from parent directory
        System.out.println("Traversing the parent directory: ");
        parentDir.ls();


        //raverse the entiry FileSystem starting from child directory
        System.out.println("Traversing the child directory: ");
        childDir.ls();
    }
}
