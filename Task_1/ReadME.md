#OIBSIP internship project

Task 1 completed --> Online reservation system using java
Task description:
The Online Reservation System will include all the necessary field which are required during online reservation system.
This Online system will be easy to use and can be used by any person.The basic idea behind this project is to save data in central database which can be accessed by any authorize person to get information and saves time and burden which are being faced by customers. 


Steps Involved:
1. First, the code generates an interface which allows the user to register itself by entering name, user-name and password.
2. Then a login page interface will be generated to enter the reservation page
3. The code creates an array of boolean values called seats with a length of 10. Each element in the array represents a seat, and the value true indicates that the seat is reserved, while false indicates that the seat is available.

4. The main method sets up a loop that displays a menu of options to the user and gets their input. The user can choose to view the current seat map, reserve a seat, cancel a reservation, or exit the program.

5. The viewSeatMap method simply prints the current state of the seats array to the console, with an "X" indicating a reserved seat and the seat number indicating an available seat.

6. The reserveSeat method prompts the user to enter a seat number, checks if the input is valid, and if the seat is available, sets the corresponding element in the seats array to true to reserve the seat.

7. The About method is used to give a description about the author.

8. The cancelReservation method works similarly to the reserveSeat method, but instead sets the corresponding element in the seats array to false to cancel the reservation