
Template.weatherTable.helpers({
    weather: function() {
        return Weather.find();
    }
});

Template.weatherRow.helpers({
    weatherdatetime: function() {
        return Date(Template.currentData().timestamp);
    }
});
