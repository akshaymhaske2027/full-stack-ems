Employee Management System
A full-stack CRUD (Create, Read, Update, Delete) application built with Spring Boot for the backend and React for the frontend. This project is an employee management system where users can manage employee details.

Table of Contents
Features
Technologies Used
Prerequisites
Getting Started
Backend Setup (Spring Boot)
Frontend Setup (React)
Usage
Screenshots
Contributing
License
Contact
Features
Add new employees
View a list of all employees
Update employee details
Delete employees
Technologies Used
Backend
Java
Spring Boot
Spring Data JPA
Frontend
React
Axios (for HTTP requests)
Vite (for fast development build)
Bootstrap (for styling)
Prerequisites
Java 
Node.js and npm
Git
Getting Started
Follow these instructions to get a copy of the project up and running on your local machine.

Backend Setup (Spring Boot)
Clone the repository:

sh
Copy code
git clone https://github.com/akshaymhaske2027/full-stack-ems.git
cd full-stack-ems/ems-backend
Build the project using Maven:

sh
Copy code
./mvnw clean install
Run the Spring Boot application:

sh
Copy code
./mvnw spring-boot:run
The backend server will start on http://localhost:8080.

Frontend Setup (React)
Navigate to the frontend directory:

sh
Copy code
cd ../ems-frontend
Install the dependencies:

sh
Copy code
npm install
Start the development server:

sh
Copy code
npm run dev
The frontend server will start on http://localhost:3000.

Usage
Open your browser and go to http://localhost:3000.
Use the UI to add, view, update, and delete employee records.
Screenshots

Figure 1: Employee List


Figure 2: Add Employee

Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes. Ensure your code follows the project's coding guidelines and includes appropriate tests.

Fork the repository
Create a new branch (git checkout -b feature-branch)
Commit your changes (git commit -m 'Add some feature')
Push to the branch (git push origin feature-branch)
Open a pull request
License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
If you have any questions or suggestions, please contact me at akshaymhaske2027@gmail.com.
