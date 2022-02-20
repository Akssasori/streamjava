package br.com.stream.main;

import br.com.stream.model.Funcionario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

//        List<Funcionario> funcionarios = Arrays.asList(
//                new Funcionario("Lucas", 32, 4500.0),
//                new Funcionario("Jose", 50, 5000.0),
//                new Funcionario("Thiago", 45, 7000.0),
//                new Funcionario("DG", 25, 2000.0),
//                new Funcionario("Alf", 19, 1000.0),
//                new Funcionario("Peter", 62, 3500.0),
//                new Funcionario("Clark", 75, 9000.0),
//                new Funcionario("Thor", 75, 9000.0)
//
//        );
//
//        List<Funcionario> exec1 = funcionarios.stream().filter(funcionario -> funcionario.getIdade() >= 25).collect(Collectors.toList());
//        System.out.println(exec1);
//
//        List<String> exec2 = funcionarios.stream().map(Funcionario::getNome).collect(Collectors.toList());
//        System.out.println(exec2);
//
//        List<Double> exec3 = funcionarios.stream().map(Funcionario::getSalario).collect(Collectors.toList());
//        System.out.println(exec3);
//
//        List<Double> exec4 = funcionarios.stream().map(Funcionario::getSalario).filter(aDouble -> aDouble > 4000.0).collect(Collectors.toList());
//        System.out.println(exec4);
//
//        List<Double> exec5 = funcionarios.stream().map(Funcionario::getSalario).filter(aDouble -> aDouble > 4000.0).distinct().collect(Collectors.toList());
//        System.out.println(exec5);
//
//        List<Double> exec6 = funcionarios.stream().map(Funcionario::getSalario).filter(aDouble -> aDouble > 4000.0).map(aDouble -> aDouble * 0.2 + aDouble).collect(Collectors.toList());
//        System.out.println(exec6);
//
//        Double exec7 = funcionarios.stream().mapToDouble(Funcionario::getSalario).average().orElse(0);
//        System.out.println(exec7);
//
//        Double exec8 = funcionarios.stream().mapToDouble(Funcionario::getSalario).sum();
//        System.out.println(exec8);
//
//        Double exec9 = funcionarios.stream().mapToDouble(Funcionario::getSalario).max().orElse(0);
//        System.out.println(exec9);
//
//        Double exec10 = funcionarios.stream().mapToDouble(Funcionario::getSalario).min().orElse(0);
//        System.out.println(exec10);





    }
}
