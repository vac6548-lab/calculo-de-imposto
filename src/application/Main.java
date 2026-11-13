package application;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> pessoa = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n;i++){
            System.out.println("Tax payer #" + i + " data: ");
            sc.nextLine();
            System.out.print("Individual or company(i/c)?");
            String type = sc.nextLine();
            if(type.equals("i")){
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                Double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                Double health = sc.nextDouble();
                Pessoa fis = new Fisica(name,anualIncome,health);
                pessoa.add(fis);
            }else if(type.equals("c")){
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                Double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int emp = sc.nextInt();
                Pessoa pj = new Juridica(name, anualIncome,emp);
                pessoa.add(pj);
            }
        }
        System.out.println("TAXES PAID: ");
        double total = 0;
        for(Pessoa x : pessoa){
            total += x.tax();
            System.out.println(x.getName() + ": $ " + String.format("%.2f",x.tax()));
        }
        System.out.println("Total taxes: $ " + String.format("%.2f", total));
    }
}