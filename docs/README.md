## Description
Applied_Pregnancy_Resilience_Informatics_

The onset of labor can be difficult to determine for a mom to be.  Knowing the right time to go to
the hospital can make the difference between having a successful self-designed birth plan
and being admitted before planned.  At times a labor and delivery provider might simply send
her home, frustrated, with instructions on when to return.  This is often a waste of time and
resources for both the hospital and the client.

It is the intention of this project to develop an evidenced based application that provides
accurate and safe coaching to the client regarding her stage of labor.  In so doing,
the application will promote the wellness of both the mother and child.

Using the product involves downloading the app to ones smart device (cell phone or tablet),
and linking external clinical tools to the program.  The entire April Suite will be
implemented during a routine pre-natal visit by the attending provider who will have access to the
client's portal for monitoring and response purposes. 


## Intended users
* Pregnant women at various stages of gestation  
* Client spouses and support team members  
* OB/GYN and CNM medical providers  
* Community pregnancy support service providers  


[User Stories](user-stories.md)

# Features
* Water Break  
  This is a counter which when initialized, records the onset of the  rupture of membranes (ROM).  The time will be adjustable to allow for late entries.

* Contraction Counter  
  With every contraction, the mom can record the start and end of the contraction.

* Fetal Heart Rate Monitor  
  There is an option for either episodic or continuous FHR monitoring with a Wi-Fi enabled device attached to the abdomen.  Continuous recordings will be saved on a time delay.
  An API for the device will be applied to the app.

* Pain Record  
  Mom will be able to record the onset, duration, quality, intensity, location, change and resolution of pain.

* Trends  
  All entered data will be analyzed in sync and trend lines for each will be displayed in relation to the others. For example, The trend of contractions and FHR will run parallel providing an indication of how the baby fairs during the stress of contractions.  A data analysis API will be required.


# Stretch Goals
* Cervical Scan  
  A Wi Fi enabled camera probe will relay images of the cervical effacement and dilitation to the app for consideration by the medical provider. This will provide an assessment of labor progression.
* Abdominal Ultrasound  
  A Wi Fi enabled ultrasound transducer will allow the mom to capture images of the fetal presentation and presence of amniotic fluid for the provider to consider.


## External Services/Data        
* Wi-Fi enabled assessment tools and their related software



### [Wireframe Diagram](wireframe.md)

### [Entity Relationship Diagram](erd.md)  

 












