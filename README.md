# Weather-API-Project
Group Members: Michael, Lydia, and Vinicius 
Professor: Simon Sultana 
Class: CSSE-350 

Team Project – Weather Window 

General Project Idea: 

For the ambient interface, we are planning to create a small window that provides information about the weather for a certain place location. This information will be updated after each specified time passes (ex. 10 minutes). The weather information will be based on real time events which will be retrieved from a weather API. There will also be a way to maximize the ambient interface to a bigger window for more information. 

Weather API: Open Weather Map API 

1) Planning: 
  First sprint (1st Team Deliverable):  
  - Create a paper prototype 
  - Create user questions about project 
  - Present to users the paper prototype and gather data from their input 
  - Make changes to overall paper prototype 
  - Present to users the new prototype and gather information 
  - Result: Final Paper Prototype for project 

  Second Sprint (2nd Team Deliverable): 
  - Start developing code for prototype 
  - Choose platform for project (phone, computer, tablet)  
  - Think about design 
  - Result: Start project development (ex. use terminal to find data from API) 

  Third Sprint (3rd Team Deliverable): 
  - Record a video describing project progress
    - Keep track of team documents 
    - Keep track of team’s code 
    - Show project progress with code 
    - Reveal what source is keeping track of version control (ex. GitHub) 
  - Start planning for Quality Assurance 
    - Testing 
    - Verification 
    - Validation 
  - Result: Working code and video about project progress and documentation, organization, and individual contributions). Develop plans for Quality Insurance. 

  Fourth Sprint (4th Team Deliverable): 
  - Develop code module: 
    - Uses API to update data for a cycle time 
    - Able to show the changes of values (from API) on our module (interface) 
    - *** ASK ABOUT SWAP MODULES WITH ANOTHER TEAM 
    - Result: Working module that interacts with API and updates in the background 		(retrieves data automatically using time cycle) 

  Fifth Sprint (5th Team Deliverable): 
  - Demonstrate the interface (video) 
  - Show documented results of Quality Assurance (testing, validation, verification) 
    - Create test cases 
    - Array with different numbers for temperature, for loop that goes through every number with specific time interval (5 seconds) 
    - Could use a random number generator every five seconds to change interface
    - Screen record the window 
    - Result: Documentation of project and version control. Want quality assurance tests and record these results. 

  Sixth Sprint (6th Team Deliverable): 
  - Create a video demonstrating the main interface we developed \
  - Java App 
  - Develop another interface??? Smaller interface (phone) 
  - Result: A fully functional java application of our project. Develop another interface??? 

///////////////////////////////////////////////////////////////////////////////

2) Requirements: 
 - Minimized Window on desktop 
   - This is the ambience interface 
   - Must display some current weather information (temperature, description) 
   - Must update during a time cycle (specific time frame – every ten minutes) 
   - Must contains button to expand to maximized window 
 - Maximized Window 
   - Must contain previous information from last window 
   - Must have more current information about the weather for the location 
     - Air quality 
     - Weather description (ex: cloudy, sunny) 
   - Must have a search button to change location we are gathering information on 
     - Changes the bigger window information to searched place 
     - selected location would change the original window on screen 
   - Must have a check box (if selected – displays on main screen) 
     - Must change accordingly to selected location!! 
  - A search windows to change location 
    - Must be able to search for a different location 
    - Must be able to set this new location as “default” 
 - Extras: 
      - May be able to change metrics 
      - May be able to get current location 
      - There may be a determined number of places users could add or 
      - There may be unlimited places to add if we can work that out 
      - Minimized window might change places automatically (set by user) 

////////////////////////////////////////////////////////////////////////////////

Specifications: 
  - APIs 
    - OpenWeather API will use longitude and latitude information to retrieve specific weather data from the web in JSON file format 
      - Change temperature 
      - Air quality 
      - Other information 
    - Geocoding API will be used to change user location input to Latitude and longitude to be inputted in the weather API get request  
      - Allow us to switch locations / places 
      - Works with weather API to find information based on area 
   - Java.util Package 
    - It will be used to get the current time and date 
    - Timer might be used to control the weather API’s GET request cycles 
      - Date 
      - Time / timer 
      - Calendar 
   - Java Thread Class 
      - Yield or sleep might be used to control the weather API’s GET Requeste cycles instead of using the timer 
