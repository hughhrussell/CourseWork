

IoT Project

Written for an IoT course.

The goal was a introduction to OOP.

- A raspberry Pi was hooked up to temperature and humidity sensors to get indoor measurements.
- Data from the Pi was transferred over MQTT to a Node-Red application.
- Also, the Node-Red appplication pulled a local weather data (outside) from a weather API
  which was in JSON format.
- From the Node-Red application, both the local outdoor and indoor measurements were inserted
  into a MongoDb. 
- The MeteorApp created a webspage for this to be viewed.
