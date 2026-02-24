Emergency Room Priority Queue Simulation (Java)
Overview

This project simulates an emergency room triage system where patients are admitted based on priority, determined by severity, age, and arrival time. The system uses a custom generic min-heap to implement a priority queue without relying on Java’s built-in PriorityQueue.

Features

Patients are assigned a severity level (1–10) and an arrival time when checked in.
Older patients are prioritized if severity is equal.
Earlier arrivals are prioritized if severity and age are equal.
Efficient O(log n) insertion and removal using a heap.
Simulates check-in and admit workflow in an emergency room.
Prints patient info in priority order for verification.

Project Structure
EmergencyRoomProject/
│
├─ src/
│  ├─ Severity.java          # Enum for patient severity levels
│  ├─ Patient.java           # Represents a patient
│  ├─ PatientComparator.java # Comparator defining priority rules
│  ├─ Heap.java              # Generic min-heap implementation
│  ├─ EmergencyRoom.java     # ER class managing patient queue
│  ├─ EmergencyRoomDemo.java # Demo main program
│  └─ HeapDemo.java          # Demo for testing generic heap
│
├─ README.md                 # This file

How It Works

Patient Check-In

A patient object is created with name and DOB.
When checkIn() is called, the system assigns severity and arrival time, and adds the patient to the heap.
Heap Maintains Priority
The heap automatically orders patients according to the PatientComparator:
Severity → Age → Arrival Time.
bubbleUp() and bubbleDown() maintain the heap structure.

Admit Patients

The admit() method removes the patient with the highest priority.
Admitted patients are printed with all relevant details.

Example Output
Jeff Barnes
DOB=1968-12-19
severity=EIGHT
arrivalTime=23:30:34.911978200 admitted
Tara Silva
DOB=1975-05-08
severity=EIGHT
arrivalTime=23:30:34.895978600 admitted
Ruth Mendez
DOB=1965-01-22
severity=SEVEN
arrivalTime=23:30:34.863979100 admitted
Melvin Ingram
DOB=1965-01-22
severity=SEVEN
arrivalTime=23:30:34.879979900 admitted
Mirabella Jones
DOB=1973-07-11
severity=SEVEN
arrivalTime=23:30:34.844985 admitted

Technologies Used

Java (OOP, generics, enums)
ArrayList for internal heap storage
Comparator for custom sorting
LocalDate & LocalTime for age and timestamp handling
Heap-based priority queue for efficient sorting

Skills Demonstrated

Object-oriented programming
Generic data structures and algorithms
Multi-level sorting with comparators
Simulation of real-time systems
Heap operations (bubbleUp, bubbleDown)
Algorithmic efficiency (O(log n) operations)

How to Run

Clone the repository:

git clone https://github.com/yourusername/EmergencyRoomProject.git

Compile the Java files:

javac src/*.java

Run the demo:

java src.EmergencyRoomDemo
