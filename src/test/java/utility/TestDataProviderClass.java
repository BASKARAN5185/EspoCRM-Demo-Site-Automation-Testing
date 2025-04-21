package utility;

import org.testng.annotations.DataProvider;

public class TestDataProviderClass {

	@DataProvider(name = "accountDataProvider")
	public Object[][] accountDataProvider() {
	    return new Object[][] {
	        // 1. All valid
	        { "Acme Inc.", "https://acme.com", "contact@acme.com", "1234567890", "123 Main St", "Los Angeles", "CA", "90001", "USA",
	          "456 Elm St", "New York", "NY", "10001", "USA", "John Doe", "Sales", "Enterprise software solutions", "Customer", "Banking" },

	        // 2. Invalid email
	        { "Beta Corp", "https://beta.com", "invalid-email", "9876543210", "321 Oak St", "Chicago", "IL", "60601", "USA",
	          "789 Pine St", "Houston", "TX", "77001", "USA", "Jane Smith", "Marketing", "Test invalid email", "Customer", "Finance" },

	        // 3. Missing phone number
	        { "Gamma LLC", "https://gamma.com", "support@gamma.com", "", "456 Maple Ave", "Phoenix", "AZ", "85001", "USA",
	          "321 Birch Rd", "Austin", "TX", "73301", "USA", "Mike Ross", "Support", "Phone number is missing", "Partner", "Healthcare" },

	        // 4. Empty name
	        { "", "https://delta.com", "contact@delta.com", "5551234567", "777 Cedar St", "Miami", "FL", "33101", "USA",
	          "999 Palm Ave", "Orlando", "FL", "32801", "USA", "Rachel Green", "HR", "Missing name", "Customer", "Retail" },

	        // 5. Overly long name
	        { "Zeta Enterprise Holdings International United Global Ltd.", "https://zeta.com", "info@zeta.com", "1112223333",
	          "888 Willow Way", "Denver", "CO", "80201", "USA", "888 Oak Blvd", "Seattle", "WA", "98101", "USA",
	          "Harvey Specter", "Legal", "Very long name input", "Customer", "Legal" },

	        // 6. Invalid URL
	        { "Eta Ltd", "htp://invalid-url", "eta@company.com", "3334445555", "555 Lakeview", "Boston", "MA", "02101", "USA",
	          "666 Riverside", "Portland", "OR", "97201", "USA", "Jessica Pearson", "IT", "Invalid website URL", "Prospect", "Education" },

	        // 7. Missing billing country
	        { "Theta Co", "https://theta.com", "hello@theta.com", "4445556666", "900 Spring St", "Atlanta", "GA", "30301", "",
	          "1000 Autumn Ln", "Charlotte", "NC", "28201", "USA", "Nick Fury", "Admin", "Missing billing country", "Customer", "Technology" },

	        // 8. Billing and shipping address same
	        { "Iota Systems", "https://iota.com", "team@iota.com", "2223334444", "100 Tech Park", "San Jose", "CA", "95101", "USA",
	          "100 Tech Park", "San Jose", "CA", "95101", "USA", "Natasha Romanoff", "R&D", "Same billing and shipping", "Partner", "Manufacturing" },

	        // 9. Empty description
	        { "Kappa Ltd", "https://kappa.com", "contact@kappa.com", "9998887777", "88 Windy Dr", "Las Vegas", "NV", "89101", "USA",
	          "77 Sunny Rd", "San Diego", "CA", "92101", "USA", "Bruce Wayne", "Security", "", "Customer", "Aerospace" },

	        // 10. Invalid postal code
	        { "Lambda Tech", "https://lambda.com", "support@lambda.com", "3332211000", "111 Data St", "Raleigh", "NC", "ABCDE", "USA",
	          "222 Info Rd", "Tampa", "FL", "123AB", "USA", "Clark Kent", "Dev", "Invalid postal codes", "Customer", "Software" },

	        // 11. All fields blank
	        { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" },

	        // 12. Valid international characters
	        { "Niño Corp", "https://nino.com", "soporte@nino.com", "5556667777", "Calle 123", "Madrid", "Madrid", "28001", "España",
	          "Av. Reforma", "Ciudad de México", "CDMX", "01000", "México", "Pedro Sánchez", "Ventas", "Datos en español", "Customer", "Automotive" },

	        // 13. Valid with special characters
	        { "O’Connor & Sons", "https://oconnor.com", "info@oconnor.com", "5551237890", "45 King's Rd", "London", "LDN", "W1D4", "UK",
	          "10 Queen St", "Edinburgh", "EDH", "EH11", "UK", "Liam O'Connor", "Europe", "Testing special characters", "Customer", "Real Estate" },

	        // 14. Excessively long description
	        { "Pi Inc", "https://pi.com", "dev@pi.com", "6543217890", "12 Math Ln", "Columbus", "OH", "43085", "USA",
	          "34 Circle Ave", "Cleveland", "OH", "44101", "USA", "Alan Turing", "Math", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.", "Customer", "Research" },

	        // 15. Valid, short name
	        { "Q", "https://q.com", "q@q.com", "1231231234", "1 Main", "City", "ST", "00000", "USA", "1 Main", "City", "ST", "00000", "USA",
	          "Agent Q", "Lab", "Shortest name", "Customer", "Engineering" },

	        // 16. Non-ASCII symbols in fields
	        { "Ωmega", "https://omega.com", "omega@tech.com", "1010101010", "Σtreet 42", "Athens", "AT", "10000", "Greece",
	          "Πark Ave", "Thessaloniki", "TH", "20000", "Greece", "Socrates", "ThinkTank", "Greek symbols test", "Customer", "Philosophy" },

	        // 17. HTML Injection test
	        { "<script>alert('XSS')</script>", "https://test.com", "xss@test.com", "9999999999", "<b>Bold St</b>", "City", "ST", "12345", "USA",
	          "Normal St", "OtherCity", "ST", "54321", "USA", "XSS Bot", "Test", "Try to break UI", "Prospect", "Cybersecurity" },

	        // 18. Duplicate email and phone
	        { "Sigma Group", "https://sigma.com", "duplicate@sigma.com", "1231231234", "10 Dup Ln", "NYC", "NY", "10001", "USA",
	          "20 Clone Rd", "LA", "CA", "90001", "USA", "Duplicate User", "CloneTeam", "Testing duplicate data", "Customer", "Media" },

	        // 19. Valid with numbers in team
	        { "Tau Corp", "https://tau.com", "info@tau.com", "8887776666", "Alpha Rd", "Dallas", "TX", "75001", "USA",
	          "Beta Rd", "Fort Worth", "TX", "76101", "USA", "Tony Stark", "Team42", "Team name with numbers", "Partner", "Defense" },

	        // 20. Special case: whitespace entries
	        { " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " }
	    };
	}
	
	@DataProvider(name = "contactData")
	public Object[][] contactDataProvider() {
	    return new Object[][] {
	        // Valid Data Set
	        {"Mr.", "John", "Doe", "Test Account", "john.doe@example.com", "Mobile", "1234567890", 
	         "123 Elm Street", "New York", "NY", "10001", "USA", "01/01/1990", "Admin", "Sales", "Test Description"},
	        
	        {"Ms.", "Jane", "Smith", "Another Account", "jane.smith@example.com", "Home", "9876543210", 
	         "456 Oak Street", "Los Angeles", "CA", "90001", "USA", "05/12/1985", "Manager", "HR", "Important Contact"},
	        
	        {"Dr.", "Alice", "Johnson", "Corporate Account", "alice.johnson@company.com", "Mobile", "1122334455", 
	         "789 Pine Avenue", "Chicago", "IL", "60601", "USA", "15/08/1980", "Admin", "IT", "Corporate Admin"},
	        
	        {"Mr.", "Robert", "Brown", "Customer Account", "robert.brown@customer.com", "Work", "2233445566", 
	         "123 Maple Road", "San Francisco", "CA", "94101", "USA", "20/03/1992", "Support", "Customer Service", "Client Contact"},
	        
	        {"Mrs.", "Emily", "Williams", "Client Account", "emily.williams@client.com", "Mobile", "6677889900", 
	         "321 Birch Blvd", "Seattle", "WA", "98101", "USA", "10/10/1975", "Client", "Sales", "Long-Term Client"},

	        // Invalid Data Set
	        // Invalid Email Format
	        {"Mr.", "Sam", "Green", "Test Account", "sam.green@com", "Mobile", "1122334455", 
	         "987 Elm Street", "Houston", "TX", "77001", "USA", "25/07/1995", "Admin", "Sales", "Invalid Email"},

	        // Missing First Name
	        {"Ms.", "", "Black", "Sample Account", "ms.black@example.com", "Home", "9988776655", 
	         "654 Pine Street", "Miami", "FL", "33101", "USA", "14/06/1990", "HR", "Support", "No First Name"},

	        // Invalid Phone Number (contains letters)
	        {"Dr.", "James", "Carter", "Corporate Account", "james.carter@company.com", "Mobile", "abcd1234", 
	         "987 Cedar Lane", "Austin", "TX", "73301", "USA", "22/11/1980", "Manager", "IT", "Invalid Phone"},

	        // Missing Postal Code
	        {"Mr.", "Mark", "Taylor", "Customer Account", "mark.taylor@customer.com", "Work", "2233445566", 
	         "123 Oak Road", "Dallas", "TX", "", "USA", "11/12/1992", "Support", "Customer", "No Postal Code"},

	        // Invalid Date Format
	        {"Ms.", "Laura", "Miller", "Client Account", "laura.miller@client.com", "Mobile", "7788990011", 
	         "456 Birch Lane", "Boston", "MA", "02101", "USA", "1992-12-11", "Client", "Sales", "Invalid Date Format"},

	        // Missing Country
	        {"Mr.", "Steve", "Davis", "Test Account", "steve.davis@example.com", "Mobile", "1231231234", 
	         "987 Oak Street", "Phoenix", "AZ", "85001", "", "USA", "15/06/1990", "Support", "Marketing", "No Country"}
	    };
	}

    
    

}
