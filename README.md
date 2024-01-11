Hospital Management System API
This project presents a RESTful API for a Hospital Management System, developed using Spring Boot. It is designed to handle the basic operations of a hospital management system, including management of patients, doctors, and appointments. This API is fully testable via Postman, ensuring easy interaction and testing of its capabilities.

Features
The API is structured into three primary modules:

1. Patient Module
Create: Add new patient information.
Read: Retrieve patient details.
Update: Modify existing patient records.
Delete: Remove patients from the system.
2. Doctor Module
Create: Register new doctors with their details.
Read: Fetch information about doctors.
Update: Edit existing doctor records.
Delete: Remove doctors from the database.
3. Appointment Module
Create: Schedule new appointments between patients and doctors.
Read: Retrieve information about scheduled appointments.
Update: Modify existing appointment details.
Delete: Cancel or reschedule appointments.
Getting Started
Prerequisites
Java Development Kit (JDK)
Maven
MySQL
Postman
Installation
Clone the repository:
bash
Copy code
git clone https://github.com/your-username/hospital-management-system-api.git
Open the project in your preferred Java IDE or text editor.
Configure the database connection details in the application.properties file.
Build and run the application.
API Endpoints
The API supports various endpoints under each module:

Patient Module Endpoints
GET /patients: Get all patients.
GET /patients/{id}: Get details of a specific patient.
POST /patients: Add a new patient.
PUT /patients/{id}: Update an existing patient.
DELETE /patients/{id}: Delete a patient.
Doctor Module Endpoints
GET /doctors: Get all doctors.
GET /doctors/{id}: Get details of a specific doctor.
POST /doctors: Add a new doctor.
PUT /doctors/{id}: Update an existing doctor.
DELETE /doctors/{id}: Delete a doctor.
Appointment Module Endpoints
GET /appointments: Get all appointments.
GET /appointments/{id}: Get details of a specific appointment.
POST /appointments: Schedule a new appointment.
PUT /appointments/{id}: Update an existing appointment.
DELETE /appointments/{id}: Cancel or reschedule an appointment.
Postman Collection
For convenient testing, import the provided Postman collection. This collection contains prepared requests for all API endpoints, making it easier to test and interact with the API.

Technologies
Spring Boot: For creating the RESTful API.
MySQL: As the database for storing data.
Maven: For managing dependencies.
Postman: For testing API endpoints.
