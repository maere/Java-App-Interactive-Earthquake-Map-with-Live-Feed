#Earthquake Mapping App



**The Project**

This repo is from an online class I took this fall, that I completed this month. Over the course of 6 weeks we used two Java libraries (UnfoldingMaps and Processing) to build a mapping application. UnfoldingMaps allows you to create maps with any geographical feature you can imagine: in our case we parsed an atom feed from USGS of earthquake data and represented this data visually using the tools provided by the Processing library (so without JS--although there is a JS version of the same library called p5.js).

Our final assignment was to come up with our own extension to the application that went above and beyond the basic requirements of the course. 

**My Extension: A Local Airport Revealer**

For my extension I chose to integrate airport data into the existing earthquake map to provide another interactive component for the applet that allows a user to find the airports local to a city. Here is what it looks like:  

[View visual of airport revealer extension](AirportRevealer.png)

When you click on an earthquake, it excludes all other earthquakes and shows you all airports within a 100 mile radius. To do this I extended both the visual and functional components of the application. This new functionality could easily be furthered by allowing the user to input their required desired distance.

To utilize the app you would need to download the source and open in Eclipse. Choose module 6, and run from  EarthquakeCityMap.java. 

Note: This app will only work while online.

The class was the first part of a five-part certification series. 




