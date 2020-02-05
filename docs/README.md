## Overview
_Applied Pregnancy Resilience Informatics_

The onset of labor can be difficult to determine for a mom to be.  Knowing the right time to go to
the hospital can make the difference between having a successful self-designed birth plan
and being admitted before planned.  At times a labor and delivery provider might simply send
her home, frustrated, with instructions on when to return.  This is often a waste of time and
resources for both the hospital and the client.

It is the intention of this project to develop an evidenced based application that provides
accurate and safe coaching to the client regarding her stage of labor.  In so doing,
the application will promote the wellness of both the mother and child.

Using the product involves downloading the app to ones smart device (cell phone or tablet),
and linking external assessment tools to the program.  The entire April Suite will be
implemented during a routine pre-natal visit by the attending provider who will have access to the
client's portal for monitoring and response purposes. 


## Intended Users
* Pregnant women at various stages of gestation  
* Client spouses and support team members  
* OB/GYN and CNM medical providers  
* Community pregnancy support service providers  

[User Stories](user-stories.md)


## Features
* History
  Mom will be prompted to enter medical history relevant to the pregnancy.

* Contraction Counter  
  With every contraction, mom can record the start and end of all contraction types.

* Pain Record  
  Mom will be able to record the onset, duration, quality, intensity, location, change and resolution of pain.

* Fetal Heart Rate Monitor  
  There is an option for either episodic or continuous FHR monitoring with a Wi-Fi enabled device attached to the abdomen.  Continuous recordings will be saved.  An API for the device will be applied to the app.  The assessment tool will be linked to the program.

* Vaginal Mucous Changes
  This feature allows mom to document any changes to vaginal mucous.

* Bloody Show
  Mom will indicate the instance and character of vaginal bleeding.  

* Water-Break Moment  
  This is a feature that records the onset of the rupture of membranes.  The time will be adjustable to allow for late entries.  

* Trends  
  All entered data will be analyzed in sync and trend lines for each will be displayed in relation to the others. 

* Emergency Alert
  When activated, this feature places a call to 911 and the designated emergency contacts.
  

## Stretch Goals
* Cervical Scan  
  A Wi Fi enabled camera probe will relay images of the cervical effacement and dilitation to the app for consideration by the medical provider. This will provide an assessment of labor progression.   

* Abdominal Ultrasound  
  A Wi Fi enabled ultrasound transducer will allow mom to capture images of fetal presentation and the presence of amniotic fluid for the provider to consider.

* Provider Tap
  This feature allow mom to tap the provider as a request for the review of her current data and guidance.


### [Wireframe Diagram](wireframe.md)


### [Entity Relationship Diagram](erd.md)  


## External Services        
* Google GPS for 911 connection, [Bandwidth 911 Access](https://bandwidth.com/911).  April is not dependent on this function.

* Fetal Heart Rate monitoring software and Wi-Fi enabled emitter, [Edan SDI Ultrasonic Pocket Doppler](https://fetaldoppler.net/fd340-fetal-doppler.html).  This API and device support the critical project functionality of April.
 
* Cervical Camera software and Wi Fi enabled device, [SVAKOM Siime Inteligent Camera](https://svakon.net/Siime).  This API and device support the critical project functionality of April.

* Abdominal Ultrasound software and Wi Fi enabled transducer, [MobiSante](https://mobisante.com)  This API and device support advanced functionality of April.
