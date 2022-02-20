package br.com.stream.main;

import br.com.stream.model.Child;
import br.com.stream.model.Potus;
import br.com.stream.model.Wife;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainPotus {

    public static void main(String[] args) {

        List<Wife> wifesOfDonaldTrump = Arrays.asList(new Wife("Melania",Arrays.asList(new Child("Barron",12))),
                new Wife("Marla",Arrays.asList(new Child("Tiffany",24))),
                new Wife("Ivana",Arrays.asList(new Child("Donal Trump Jr.",40),
                        new Child("Ivanka",36),
                        new Child("Eric",34))));

        List<Potus> potuses = Arrays.asList(new Potus("Donald","Trump",2016,"Republican", wifesOfDonaldTrump),
                new Potus("Barack","Obama", 2012,"Democratic",null),
                new Potus("Barack","Obama",2008,"Democratic",null),
                new Potus("George w.","Bush",2004,"Republican",null),
                new Potus("George w.","Bush",2000,"Republican",null),
                new Potus("Bill","Clinton",1996,"Democratic",null),
                new Potus("Bill","Clinton",1992,"Democratic",null),
                new Potus("George H.W.","Bush",1988,"Republican",null),
                new Potus("Ronald","Reagan",1984,"Republican",null),
                new Potus("Ronald","Reagan",1984,"Republican",null),
                new Potus("Jimmy","Carter",1984,"Democratic",null));



        //filtrando todos os presidentes antes de 2000
        potuses.stream().filter(potus -> potus.getElectionYear() < 2000).forEach(System.out::println);
        //todos os presidentes antes de 2000 só os sobrenomes
        potuses.stream()
                .filter(potus -> potus.getElectionYear() < 2000)
                .map(Potus::getLastName)
                .distinct()
                .forEach(System.out::println);
        System.out.println("===================================================================");
        //todos os presidentes antes de 2000 só os sobrenomes, sem ter repetidos e limitados a 3
        //ctrl + alt + v com o codigo selecionado ele ja adiciona o list para vc se tiver p .collect(Collectors.toList())
        potuses.stream()
                .filter(potus -> potus.getElectionYear() < 2000)
                .map(Potus::getLastName)
                .distinct()
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        // flatmap sort collect
        //flatmap pega a proxima ou maior lista eu acho
        System.out.println("====================================================================");
        Potus trump = potuses.get(0);
        List<Child> kids = trump.getWifes()
                .stream()
                .flatMap(wife -> wife.getChild().stream())
                .sorted(Comparator.comparing(Child::getAge).reversed())
                .collect(Collectors.toList());
        System.out.println(kids);

//        trump.getWifes()
//                .stream()
//                .flatMap(wife -> wife.getChild().stream())
//                .sorted(Comparator.comparing(Child::getAge)).forEachOrdered(System.out::println);

        System.out.println("=============================MAP======================================");
        Map<Integer,Child> kidsMap = trump.getWifes()
                .stream()
                .flatMap(wife -> wife.getChild().stream())
                .sorted(Comparator.comparing(Child::getAge).reversed())
                .collect(Collectors.toMap(Child::getAge, Function.identity()));

        System.out.println(kidsMap);
        System.out.println("=============================findAndMatch======================================");
        //alt+ctrl+v extract predicate

        Predicate<Wife> hasMoreThan2Children = wife -> wife.getChild().size() > 2;

        Optional<Wife> firstWife = trump
                .getWifes()
                .stream()
                .filter(hasMoreThan2Children)
                .findFirst();
        System.out.println(firstWife);

        boolean doesEveryWifeHaveMoreThan2Kids = wifesOfDonaldTrump.stream().allMatch(hasMoreThan2Children);
        System.out.println("doesEveryWifeHaveMoreThan2Kids "+ doesEveryWifeHaveMoreThan2Kids);

        boolean doesAnyWifeHaveMoreThan2Kids = wifesOfDonaldTrump.stream().anyMatch(hasMoreThan2Children);
        System.out.println("doesAnyWifeHaveMoreThan2Kids "+ doesAnyWifeHaveMoreThan2Kids);

        boolean notASingleWifeHaveMoreThan2Kids = wifesOfDonaldTrump.stream().noneMatch(hasMoreThan2Children);
        System.out.println("notASingleWifeHaveMoreThan2Kids "+ notASingleWifeHaveMoreThan2Kids);

        System.out.println("=============================REDUCE======================================");

        int totalNumberOfChildren = trump.getWifes()
                .stream()
                .mapToInt(wife -> wife.getChild().size())
                .reduce(0, (sum, count) -> sum + count);

        System.out.println(totalNumberOfChildren);

    }
}
