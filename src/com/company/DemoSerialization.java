package com.company;

import java.io.*;

/**
 * Created by moneg on 05.03.2016.
 */
public class DemoSerialization {
    public static void main(String[] args) {
        Student Goncharenko = new Student("MMF", "Goncharenko",1,"G017s9");
        System.out.println(Goncharenko);
        File fw = new File("demo.dat");

        try {

            ObjectOutputStream ostream =

                    new ObjectOutputStream(

                            new FileOutputStream(fw));

            ostream.writeObject(Goncharenko);

            ostream.close();

        } catch (IOException e) {

            System.err.println(e);

        }

        Student.faculty = "GEO";//изменение значения static-поля

                                // чтение и вывод объекта

        File fr = new File("demo.dat");

        try {

            ObjectInputStream istream =

                    new ObjectInputStream(

                            new FileInputStream(fr));

            Student unknown =

                    (Student)istream.readObject();

            istream.close();

            System.out.println(unknown);

        } catch (ClassNotFoundException ce) {

            System.err.println(ce);

            System.err.println("Класс не существует");

        } catch (FileNotFoundException fe) {

            System.err.println(fe);

            System.err.println("Файл не найден");

        } catch (IOException ioe) {

            System.err.println(ioe);

            System.err.println("Ошибка доступа");

        }

    }

}