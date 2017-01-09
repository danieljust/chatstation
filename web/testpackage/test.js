/**
 * Created by safon on 09.01.2017.
 */
var connectBtnEl = document.querySelector('#connect');

    var connection = new WebSocket('ws://html5rocks.websocket.org/echo');
// When the connection is open, send some data to the server
    connection.onopen = function () {
        connection.send('Ping'); // Send the message 'Ping' to the server
    };




// Log errors
connection.onerror = function (error) {
    console.log('WebSocket Error ' + error);
};

// Log messages from the server
connection.onmessage = function (e) {
    console.log('Server: ' + e.data);
};
