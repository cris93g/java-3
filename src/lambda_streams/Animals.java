package lambda_streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Animals {
    //This class will be using streams.
    static List<String> animals = Arrays.asList("peacoCK","rabbit","chiwawa","OranguTAN","vipeR","cobra","paNDa","bUffalo","DeeR","maLLard");

    public static void main(String[] args) {
        System.out.println("original animals : " + animals);

        //clean up the animals array by using the capsFirst() method. follow instructions in the method definition. 
        List<String> cleaned = capsFirst(animals, false);
        System.out.println(cleaned);
       
        //do not modify these addAnimal() method invocations
        addAnimal("rEIndeeR");
        addAnimal("Platypus");
        addAnimal("frOg");
        addAnimal("lEOpArD");
        //---------------------------------------

        capsFirst(animals,true);
        System.out.println(animals);

        List<String> lowered = lowerFirst(animals,false);
        System.out.println(lowered);

        

    }

    static List<String> capsFirst(List<String> animaList, boolean mutate) {
        //clean up the animals list so that the first letter is capitalized, and all the other letters are lowercased. Use a stream to accomplish this task.  Also, the 2nd parameter of this function is a boolean.  use this boolean 'flag' to determine whether or not to 'mutate' the original animals array stored as a static class field.  if the flag is set to 'true', mutate the animals and return the animals out of the function.  if it is false, create a copy of the animals, perform your stream operations on the copy, and return the copy of animals out of the function, WITHOUT modifying the original animals array.  
        if(mutate) {
            return animals.stream().map(name -> Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase()).collect(Collectors.toList());
        }
        List<String> newAnimals = new ArrayList(animals);
        return newAnimals.stream().map(name -> Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase()).collect(Collectors.toList());
    }

    static String addAnimal(String animal) {
        animals.add(animal);
        return animal;
    };


    static List<String> lowerFirst(List<String> animaList, boolean mutate) {
        if(mutate) {
            return animals.stream().map(name -> Character.toLowerCase(name.charAt(0)) + name.substring(1).toUpperCase()).collect(Collectors.toList());
        }
        List<String> newAnimals = new ArrayList(animals);
        return newAnimals.stream().map(name -> Character.toLowerCase(name.charAt(0)) + name.substring(1).toUpperCase()).collect(Collectors.toList());
    }

    static List<String> flipAnimals(boolean mutate) {
        List<String> instructions = Arrays.asList("Flip","the","animals","list","."," ","Mutate","the","animals","only","if","flag","true");
        IntStream.range(0, instructions.size()).forEach((i) -> {
            int j = instructions.size() - 1;
            while(true) {
                if (i < j) {
                    String temp = instructions.get(i);
                    instructions.set(i, instructions.get(j));
                    instructions.set(j, temp);
                    j--;
                } else {
                    break;
                }
            }
        });
        return instructions;
    }

    static List<String> sortAnimals(boolean mutate) {
    //sort the animals in alphabetical order.  If the booleaen parameter is true, mutating the animals list.  if the mutate boolean is false, sort a 'copy' of the animals list, then return that list of sorted animals, WITHOUT mutating the static animals array. return the sorted list in both cases.
        if(mutate) {
            Collections.sort(animals);
            return animals;
        }
        List<String> newAnimals = new ArrayList(animals);
        Collections.sort(newAnimals);
        return newAnimals;
    }

}
