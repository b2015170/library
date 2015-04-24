import com.library.*
class BootStrap {

    def init = { servletContext ->
def course1= new Course(title:'Computing',
				code:'1234',
				tutor:'Ms Davis',
				department:'ACES',
				description:'Bsc Computing course').save()	

def student1= new Student(name:'James Luke',
				email:'james33l@hotmail.com',
				studentId:'22015140',
				course:Course.findByTitle('Computing')).save()
				

def book1= new Book(title:'Bible',
			author:'Bob',
			isbn:'785969756',
			dateBorrowed: new Date('11/03/2015'),
			returnDate: new Date('11/04/2015'),
			student:Student.findByName('James Luke')).save()

def librarian1= new Librarian(name:'James Dunn',
					email:'james63d@hotmail.com',
					userName:'JDunn',
					password:'password',
					telephone:'07865349244').save()

def library1= new Library(location:'Sheffield',
				openingHours:'12:00-9:00',
				book:Book.findByTitle('Bible'),
				student:Student.findByName('James Luke'),
				librarian:Librarian.findByName('James Dunn'))

				
if(!library1.save()){
	library1.errors.allErrors.each{ error ->	println "An error occurred whilst creating library1: ${error}"
	}
}
}
def destroy = {
}
}
