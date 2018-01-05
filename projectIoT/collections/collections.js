// databases
Sensors = new Mongo.Collection('sensors');
Weather = new Mongo.Collection('weather');

//subscribe to topics
if (Meteor.isClient) {
    Meteor.subscribe('sensorsTopic');
    Meteor.subscribe('weatherTopic');
}

if (Meteor.isServer) {
    Meteor.publish('sensorsTopic', function() {
        // only publish when logged-in users request publishing
        if (this.userId) {
            return [Sensors.find()];
        }
    });
    Meteor.publish('weatherTopic', function() {
        // only publish when logged-in users request publishing
        if (this.userId) {
            return [Weather.find()];
        }
    });
}
