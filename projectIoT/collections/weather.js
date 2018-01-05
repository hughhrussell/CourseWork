/*
Weather = new Mongo.Collection('weather');

if (Meteor.isClient) {
    Meteor.subscribe('weatherTopic');
}

if (Meteor.isServer) {
    Meteor.publish('weatherTopic', function() {
        // only publish when logged-in users request publishing
        if (this.userId) {
            return [Weather.find()];
        }
    });
}
*/
