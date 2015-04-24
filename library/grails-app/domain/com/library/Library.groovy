package com.library

class Library {
String location
Integer openingHours
Book book
Student student
Librarian librarian
static hasMany=[books:Book, students:Student, librarians:Librarian]
    static constraints = {
    }
}
