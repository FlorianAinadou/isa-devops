# All available commands
  - bill: Send a bill to the carrier, you should specify the amount of the bill : bill $Amount
  - bye: Exit Delivery System
  - next: Return the next delivery 
  - parcel: Show a parcel for a given reference
  - init: null
  - feedback: Send a feeback to our services, you can rate us from 0 (very bad) to 5 (very good) : feedback $yourName $Amount
  - askDelivery: Asking fo a delivery giving  hour H, reference R, address A
  - flushP: Clearing all times slots
  - allTimeSlots: Give all available time slots for scheduling a delivery
  - initDeliveries: Init some deliveries from the database
  - Statistics: Get the statistics of the planning


# Scenario: 
## try to get some parcel but will return an exception 
  - command: parcel 1 
  - result: an exception error
  
## send a feedback to the customer service (the rate can be from 0 to 5)
  - command: feedback collet 4 
  - result: no exception error
  
## get the statistics of the feedback
  - command: Statistics
  - result: the number of feedbacks and the average rate
  
## send a bill to the Carrier (be aware the dot net server is running)
  - command: bill 50
  - result: the bill appear on the dotnet terminal

##  Init the database: adding some parcels and drones 
- command: init

##  Since the parcel is available 
- command: parcel 1 
- result: parcel.toString()

##  Find times Slots for a delivery 
- command: allTimeSlots 
- result: 8h-10h 10h-12h

##  Then you must 8:00 or 10:00 to ask for a delivery at thoses times 
- command:  askDelivery 8 or 10 1 Adress
- here 1 is the available parcel added by the init command reference And thne add the address you want 
but you must replace spaces by _

##  The selected timeSlot is not available anymore 
- command:  allTimeSlots
- result: You will only get the one that you haven't choose

##  Then Manu will get the next delivery informations 
- command:  next 
- result: next delivery details

##  then bye 
- command:bye 
- if you are done testing
