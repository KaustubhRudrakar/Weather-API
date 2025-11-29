let stateDistricts = {};
const weatherIcons = {
  "Sunny": "☀️",
  "Clear": "☀️",
  "Partly Cloudy": "⛅",
  "Cloudy": "☁️",
  "Overcast": "🌥️",
  "Rainy": "🌧️",
  "Thunderstorm": "⛈️",
  "Snow": "❄️",
  "Fog": "🌫️",
  "Windy": "💨"
};

window.onload = async function () {
  try {
    const res = await fetch("https://raw.githubusercontent.com/KaustubhRudrakar/Weather-API/main/india_all_districts_weather_nested.json");
    stateDistricts = await res.json();
    let stateSelect = document.getElementById("state");
    for (let state in stateDistricts) {
      let option = document.createElement("option");
      option.value = state;
      option.text = state;
      stateSelect.appendChild(option);
    }
  } catch (err) {
    console.error("Error loading states and districts:", err);
  }
};

function populateDistricts() {
  let state = document.getElementById("state").value;
  let districtSelect = document.getElementById("district");
  districtSelect.innerHTML = "<option value=''>-- Select District --</option>";

  if (state && stateDistricts[state]) {
    for (let district in stateDistricts[state]) {
      let option = document.createElement("option");
      option.value = district;
      option.text = district;
      districtSelect.appendChild(option);
    }
  }
}

async function getWeather() {
  const state = document.getElementById("state").value;
  const district = document.getElementById("district").value;
  if (!district) {
    document.getElementById("result").innerText = "Please select a district.";
    return;
  }

  try {
    const res = await fetch(`http://localhost:8080/weather-data/district/${district}`);
    const text = await res.text();
    const condition = stateDistricts[state][district]["Condition"];
    const icon = weatherIcons[condition] || "🌍";
    document.getElementById("result").innerHTML = `
      <span>${icon}</span>
      ${text}<br>
      Condition: ${condition}
    `;
  } catch (err) {
    document.getElementById("result").innerText = "Error fetching data.";
  }
}
