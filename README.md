# Maps



**The Project**

This repo is from an online class I completed this month. We used two Java libraries to build a mapping application: UnfoldingMaps and Processing. The first library allows you to create maps with any geographical feature you can imagine: in our case we parsed a live streams of earthquake data and represented this data visually using the tools for graphics and event handling provided by the Processing library (without JS--although there is a JavaScript version of the same library called p5.js).

For our final project we were required to come up with our own  extension to the application that went above and beyond the basic requirements of the course. 

**My Extension: A Local Airport Revealer**

For my extension I chose to integrate airport data into the existing earthquake map. To do this I extended both how the airport markers were represented visually as well as the functionality of the map. Here is what it looks like:  

[View visual of airport revealer extension](AirportRevealer.png)

When you click on an earthquake it, it excludes all other earthquakes and shows you all airports within a 100 mile radius.  The functionality could easily be changed to request input from the user regarding desired distance, as well as allowing the user to customize the data they wanted to visualize.

The class was part 1 of a 5 part certification series. 




