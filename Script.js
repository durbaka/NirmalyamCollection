// script.js

// Initialize the Google Map
function initMap() {
  const defaultLocation = { lat: 12.9716, lng: 77.5946 }; // Default location (e.g., Bangalore)
  const map = new google.maps.Map(document.getElementById("map-container"), {
    zoom: 13,
    center: defaultLocation,
  });

  const marker = new google.maps.Marker({
    position: defaultLocation,
    map: map,
    draggable: true,
    title: "Drag to your location",
  });

  google.maps.event.addListener(marker, 'dragend', function (event) {
    alert(`Pinned Location:\nLatitude: ${event.latLng.lat()}, Longitude: ${event.latLng.lng()}`);
  });
}

// Handle Form Submission
document.getElementById("registration-form").addEventListener("submit", function (e) {
  e.preventDefault();
  
  const name = document.getElementById("name").value;
  const phone = document.getElementById("phone").value;
  const address = document.getElementById("address").value;
  const schedule = document.getElementById("schedule").value;

  console.log({ name, phone, address, schedule });

  alert("Registration successful! We will contact you soon.");
});

