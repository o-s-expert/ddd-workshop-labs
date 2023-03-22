/*
 * Copyright (c) 2022 Contributors to the Eclipse Foundation
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *  The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *  and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 * You may elect to redistribute this code under either of these licenses.
 */

//package expert.os.workshop.ddd.jnosql;


import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
//import jakarta.nosql.document.DocumentTemplate;
//
//import java.time.Year;
//import java.util.List;
//import java.util.UUID;


public class App {
    public static void main(String[] args) {

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            /**
             * TODO: Create a book instance: `effective`
             * */


            /**
             * TODO: Use CDI container to create `template`, an instance of `jakarta.nosql.document.DocumentTemplate`
             * */


            /**
             * TODO: Using the `template` instance, use the method `insert` to save the `effective` book
             * */


            /**
             * TODO: Try out the fluent API for searching data.
             * Use the `template.select` method to search for books where title equals to "Effective Java");
             * Store the results in a `List<Book> books;
             * Print out the result of the search:  System.out.println("These are the books founds: " + books);
             * */



            /**
             * TODO: Delete
             * Using the `template`, use the method `delete` to delete instances of `Book.class` where the `title`
             * is equals to `Effective Java`.
             * Remind to invoke ".execute();" method to finalize the command;
             * */


            /**
             * TODO: Search and List
             * Use the `template.select` method to search and print the result like you have done previously;
             * */

        }
    }

    private App() {
    }
}
