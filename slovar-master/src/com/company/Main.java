package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String[]> dictionary = new
                HashMap<>();
        HashMap<String, String[]> dictionaryBig = new HashMap<>();
        dictionary.put("chelovek", new String[]{"gumanoid", "individum", "lichnost", "persona"});
        dictionary.put("krasivyi", new String[]{"simpotichnyi", "vysokiy", "prekrasnyi", "ptyvlikatelnyi"});
        dictionary.put("dom", new String[]{"kvartira", "osobnyak", "hata", "dacha"});
        dictionary.put("bolshoi", new String[]{"ogromnyi", "gromadnyi", "velikyi", "ne malenkyi"});

        HashMap<String,String[]>bigDictionary= new HashMap<>();
        bigDictionary.putAll(dictionary);
        Set<String>keys = dictionary.keySet();
        Iterator<String>iterator=keys.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            String[]synonym= bigDictionary.get(key);
            for (int i = 0; i <synonym.length ; i++) {
                String newKey = synonym[i];
                ArrayList<String>arl = new ArrayList<>();
                arl.addAll(Arrays.asList(synonym));
                arl.add(key);
                arl.remove(newKey);
                String[]newSynonym = new String[arl.size()];
                arl.toArray(newSynonym);
                dictionaryBig.put(newKey,newSynonym);

            }
        }

        System.out.println("Vvedite slovo iz slovarya");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        for (int i = 0; i <words.length ; i++) {
            if (dictionary.get(words[i])==null){
            System.out.println("takogo slovo net v slovare");
        }else {
        String[]synonyms = dictionary.get(words[i]);
        Random r = new Random();
        int j = r.nextInt(synonyms.length);
        System.out.printf(synonyms[j] + " ");






            }
        }
}}



