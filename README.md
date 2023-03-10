# r-w-x_file

A library fully made in java to help create-clear-delete file or write-read file (ext: .txt, .java, ...[files containing text]).

By w41k4z

## Description

| File          | Desc                                                                                                                |
| ------------- | ------------------------------------------------------------------------------------------------------------------- |
| Executor.java | A static class for creating files (including directory), clearing file content or deleting files (recursively)      |
| Reader.java   | A class to check if a file contains a certain value of string, and to read files (returning an ArrayList of String) |
| Writer.java   | A class to write an array of object as line of text in a file (great for JSON)                                      |

## Prerequisites

Import the jar file to your project libraries and there you go

- If you are using an IDE, install the right pluggins for java project
- Or, put the path to the jar file in your environment variable CLASS_PATH or also just compile and execute your java file with the parameter [-cp "<jar_file_path>" <java_file_name>]

## How to use

### Executor

- creating file : Executor.createNewFile(File **root**, String **fileName**, boolean **isDirectory**) => return the new File created;
  1. **root**: the parent directory (where the new file will be created)
  2. **fileName**: the file name
  3. **isDirectory**: to specify if the new file is actually a file or a directory

- clearing file content: Executor.clearFile(File **file**) => return void;
  1. **file**: the file to clear

- deleting file: Executor.deleteFile(File **file**) => return void;
  1. **file**: the file to delete

### Reader

First create a new Reader object with parameter the file to read (ex: Reader reader = new Reader(File test))

- reading file: reader.readFile(boolean **toClose**) => return line of text as ArrayList of String;
  1. **toClose**: to specify if you want to close the stream or not (maybe for another reading purpose)

- to check a certain value of string existence: reader.contains(String **value**, boolean **toClose**) => return boolean;
  1. **value**: the value to look for
  2. **toClose**: to specify if you want to close the stream or not

### Writer

First create a new Writer object with parameter the file to write (ex: Writer writer = new Writer(File test))

- writing file: writer.writeFile(Object[] **data**) => return void;
  1. **data**: array of data to write in the file

## Conclusion

This is an open source library, the source code is available and everyone can modify whatever they want
