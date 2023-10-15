package StructuralDesignPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    List<FileSystem> fileSystemList= new ArrayList<>();
    @Override
    public void ls(){
        for(FileSystem fs: fileSystemList){
            fs.ls();
        }
    }

    public void add(FileSystem fs){
        fileSystemList.add(fs);
    }
}
