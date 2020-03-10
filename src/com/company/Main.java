package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss=new Boss();
        boss.setDamage(70);
        boss.setHealth(600);
        boss.setDefenceType(" РЎСѓРїРµСЂ РїСЂС‹Р¶РѕРє ");

        System.out.println(  boss.getHealth()+" "+ boss.getDamage()+" "+ boss.getDefenceType());

        Hero hero= new Hero(250,15,"СЃСѓРїРµСЂ РЈРґР°СЂ");
        System.out.println(hero.getHealth()+"  "+hero.getDamage()+" "+hero.getSuperAbility());

        Hero hero1=new Hero(230,20);

        System.out.println(hero1.getHealth()+"    "+ hero1.getDamage() );

    }
}
