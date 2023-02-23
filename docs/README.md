---
layout: home
permalink: index.html

# Please update this with your repository name and title
repository-name: e16-4yp-ABM-for-Micro-Mobility-in-Sri-Lankan-Cities
title: Agent Based Model for Micro Mobility in Sri Lankan Cities
---

[comment]: # "This is the standard layout for the project, but you can clean this and use your own template"

# Agent based Model for Micro Mobility in Sri Lanka

#### Team

- E/16/039, Nimashi Uthpala, [email](mailto:e16039@eng.pdn.ac.lk)
- E/16/087, Sachini Dissanayaka, [email](mailto:e16087@eng.pdn.ac.lk)
- E/16/126, Naduni Hansika, [email](mailto:e16126@eng.pdn.ac.lk)

#### Supervisors

- Dr. Damayanthi Herath, [email](mailto:damayanthiherath@eng.pdn.ac.lk)
- Dr. Rajith Vidanaarachchi, [email](mailto:rajith.vidanaarachchi@unimelb.edu.au)
-	Dr. Samal Dharmarathna, [email](mailto:samal@eng.pdn.ac.lk)

#### Table of content

1. [Abstract](#abstract)
2. [Related works](#related-works)
3. [Methodology](#methodology)
4. [Experiment Setup and Implementation](#experiment-setup-and-implementation)
5. [Results and Analysis](#results-and-analysis)
6. [Conclusion](#conclusion)
7. [Publications](#publications)
8. [Links](#links)

---

## Abstract
The rapid pace of urbanization has resulted in significant traffic congestion in urban areas worldwide. This has led to several issues, such as increased air pollution, economic losses, and fuel waste. To address these issues, it is essential to develop innovative and sustainable mobility solutions. Micro-mobility is emerging as a promising option for efficient and sustainable urban transportation, and it can be studied using agent-based models (ABMs). ABMs offer several advantages for analyzing urban transportation and sustainability, including the ability to model complex systems, explore multiple scenarios, and study the effects of individual behaviors on the system as a whole. This project aims to investigate the impact of micro-mobility solutions on urban transportation in Sri Lanka, which is currently facing significant traffic issues. The study utilizes two ABMs created with MATSim. The first model is based on current traffic data from Kandy city and is used to identify the most congested areas and time periods. The second model is based on a simple network and focuses on introducing bicycle lanes parallel to main roads to reduce traffic congestion. The study compares the results and evaluates the impact of micro-mobility on traffic congestion. The findings of the study suggest that micro-mobility solutions, such as introducing bicycle lanes parallel to main roads, can significantly reduce traffic congestion in urban areas. The study concludes with a discussion of potential improvements to the model and future research directions. Overall, this research highlights the potential of micro-mobility in achieving sustainable outcomes in urban transportation and emphasizes the importance of utilizing ABMs for the analysis of transportation systems. 

## Related works
We analyzed case studies and research on agent-based models for micro-mobility and agent-based models for traffic simulation during the literature review. Numerous research on traffic control in urban areas have been carried out using micro-mobility and agent-based traffic simulation technologies. We aimed to investigate and evaluate some of those case studies and experiments carried out in various areas throughout the world to replicate various sorts of traffic congestion. We looked at 16 case studies published between 2014 and 2022 gathered from academic research sources such as ScienceDirect, IEEE Xplore, and Scopus.

The publications chosen were chosen primarily based on the purposes of their case studies. We used the terms "agent-based models for micro-mobility" and "agent-based models for traffic simulation" to find the publications. First, we reviewed a number of publications returned in the search results that were published between 2014 and 2022. We looked at topics like the types of traffic they were exploring, the types of agent-based traffic simulation tools they used, the transportation modes examined, and the sources of the datasets utilized when reading the articles. Based on our research, we selected 16 case cases to be critically examined. We assessed the case studies once they were completed using six criteria.

- The location where they did their experiment
- Purpose of the research
- Traffic simulation tool used
- Transportation modes that they used as the agents of their simulation
- Data set used & how it was collected
- How they validated and evaluated their results

The case studies chosen can be divided into two categories: mixed traffic simulations and bicycle traffic simulations. The majority of the research for this study was conducted in the United States and the Europe. Additional case studies have been conducted in countries such as Vietnam, and Singapore (1 case study in each country).

Several ABM simulation technologies were utilized to simulate the ABMs in the case studies we chose. MATSim was the most commonly used simulation tool (used in 8 case studies), and GAMA was utilized in two case studies. NetLogo, SimMobility, GemSim, and OD Matrix were the least used simulation tools. For each of those simulation tools, we discovered one case study.

The majority of research configured and validated ABMs using publicly available data. They employed sources such as the literature, questionnaires, and traffic flow video footage to find traffic-related statistics (number of cyclists/vehicles on the network at a particular moment). The case studies' conclusions were validated primarily by comparing them to predefined scenarios and traffic recordings obtained on the road.



## Methodology
MATSim (Multi-Agent Transport Simulation) is a powerful tool for simulating transportation systems and traffic flow. It allows us to create a detailed model of a transportation network and the agents that use it, such as drivers, pedestrians, and public transit users.

To reproduce traffic congestion using MATSim, we need to create a simulation scenario that accurately represents the transportation system we want to model. Here are the basic steps we followed:

### Defined the study area: 
For the research, we chose Kandy City, Sri Lanka as the case study location. The kandy city is one of the busiest urban areas and experiences a variety of traffic types in Sri Lanka.  The types of traffic that can be seen in Kandy city, Sri Lanka include private vehicles, public transport, pedestrian traffic, tourist traffic, commercial traffic, and two- and three-wheelers. These different types of traffic can contribute to traffic congestion and flow issues, particularly during peak hours. Effective traffic management and transportation planning are important to ensure the smooth flow of traffic in Kandy city.
To simulate city traffic, a small area of Kandy, including the city center, was chosen.

![Alt text](https://github.com/cepdnaclk/e16-4yp-ABM-for-Micro-Mobility-in-Sri-Lankan-Cities/blob/main/docs/images/kandy.png)
### Data:
Road network data: This includes data on the road layout, geometry, and connectivity in the study area. The road network of Kandy city is obtained from OpenStreetMap including information such as speed limits, one-way streets, and turn restrictions. In the context of transportation modeling with MATSim, OSM data can be used as input to create a detailed network of roads and other transportation infrastructure. This network can be combined with travel demand data and other inputs to simulate transportation systems and analyze traffic flow and congestion.

### Travel demand data:
This includes data on the number and characteristics of travelers in the study area, such as their origin and destination, travel mode choice, and travel behavior. The data is collected from a study done in 2011{cite}. The study area is further defined as falling within two rings based on the orientation of the road network and land use formations within Kandy city. The inner ring is known as the Central Business District (CBD), while the outer ring is known as the Study Area (SA). The CBD is identified separately because it contains several traffic generators and attractors, such as a number of popular schools, the General Hospital, the Sacred Temple of the Tooth Relic, and commercial and administrative services.

### Simulation scenario: 
In terms of introducing micro-mobility options, there are several possibilities depending on the existing infrastructure and transportation network. These are some potential options for introducing micro-mobility in Kandy city include:

#### Bicycle lanes: 
Creating dedicated bicycle lanes on existing roads can help promote cycling as a safe and convenient mode of transportation. This can be particularly effective in areas with heavy traffic congestion.

#### Bike-sharing schemes: 
Establishing a bike-sharing scheme in Kandy city can make bicycles more accessible to residents and visitors, particularly for short trips around the city.

#### E-bikes and e-scooters: 
Electric bicycles and scooters are becoming increasingly popular in urban areas around the world. Introducing e-bikes and e-scooters in Kandy city can provide a convenient and sustainable mode of transportation for short trips.

In our research, we attempted to implement parallel bicycle lanes in the city. We took into account the type of vehicle used, the purpose of the trip, and the average number of people who travel by different modes of transportation.
We replaced the number of cars that travel on non-home-based trips on Kandy city roads with bicycles based on the average number of passengers that travel in the car based on the research stats.
According to sources, 17% of trip purposes are Non-home-based other trips (NHBO) and 2% are Non-home-based education trips (NHBE). As a result, 19% of non-home-based trips were taken to replace 19% of cars with bicycles. The number of cars that have been replaced by bicycles is calculated using the Passenger Car Unit(PCU) (/cite). Based on that, one car can be replaced by two cars.
We created four scenarios for four linked networks in order to introduce parallel bicycle lanes on the city's most congested roads.

![Alt text](https://github.com/cepdnaclk/e16-4yp-ABM-for-Micro-Mobility-in-Sri-Lankan-Cities/blob/main/docs/images/one link network.png)

To create scenarios, 100 agents were chosen, and because 19% of trips can be taken as non-based-home trips. The use of the scenarios is defined in the table below. In scenarios one and two, we attempted to run all 100 agents on a single road at the same speed for all links while varying the link speeds to demonstrate the speed variation of the road condition. The agents were given three different time frames in which they were expected to return from their trips. In scenarios three and four, we replaced 19 cars with 38 bicycles while maintaining the same conditions as in the first two scenarios and attempted to figure out how parallel bicycle lanes could be affected in order to reduce traffic congestion and how it could affect policy making.

| | Scenario one | Scenario two  | Scenario three | Scenario four | 
| ------------- | ------------- | ------------- | ------------- |------------- |
| Number of car agents| 100| 100| 81| 81  |
| Number of Bicycle agents| 0| 0| 19x2=38 |19x2=38 | 
| Start time| 6.00am| 6.00 am| 6.00 am| 6.00am|
| Avg Speed for Link 01| Same speed for all links| 45Kmh| 45Kmh| Same speed for all links|
| Avg Speed for Link 02| |40Kmh| 40Kmh| |
| Avg Speed for Link 03| |30Kmh| 40Kmh| |
| Avg Speed for Link 04| |45Kmh| 45Kmh| |
<!-- ## Experiment Setup and Implementation -->

## Results and Analysis
### Results
In this section, we present the results of simulating the
case study in order to identify the real traffic in Kandy
city, as well as the four different scenarios that were used
to implement parallel bicycle lanes on the most congested
roads. We considered the data of the CBD of Knady city as
mentioned in the previous section and used 500 car agents
to create the current model. To plan the trips of the vehicle
agents, four major nodes that people use to enter the city were
considered. All agents begin and end their journeys at one of
these nodes. It essentially depicts how the car agents move
through the city. The simulation can be used to track the most
congested roads as well as the duration of the traffic jam. We
observed the most congested links for starting and returning
trips after running the simulation 100 times.

![Alt text](https://github.com/cepdnaclk/e16-4yp-ABM-for-Micro-Mobility-in-Sri-Lankan-Cities/blob/main/docs/images/NEW01.png)
![Alt text](https://github.com/cepdnaclk/e16-4yp-ABM-for-Micro-Mobility-in-Sri-Lankan-Cities/blob/main/docs/images/NEW02.png)

Links that are highly saturated are shown in red(10% of the
sample data) and medium saturated are in yellow. However,
it is observed that these are not congested links, as the actual
traffic volume in these cases may be much lower or higher than
the actual free flow capacity. The visualization shows where
large numbers of vehicles are moving in the network with
the additional width setting based on the absolute volume. In
MATSim, vehicles typically travel very close to the free-flow
speed, unless there are more vehicles on a link than the flow capacity allows for. In such cases, the vehicles are held back
in MATSim, resulting in a longer travel time on that link and
thus a lower speed.
Following the identification of congested roads, the next
step is to introduce parallel bicycle lanes to those congested
roads. These are the results obtained by simulating the four
scenarios 1000 times in the MATSim tool. 

| | Scenario one | Scenario two  | Scenario three | Scenario four | 
| ------------- | ------------- | ------------- | ------------- |------------- |
|Number of car agents| 100| 100| 81| 81|
|Number of Bicycle agents| 0| 0| 19x2=38| 19x2=38|
|Time taken till all the passengers reach the destination|01:03:36| 00:52:12| 01:05:11| 00:53:47|
|Time saved due to micromobility| |00:11:24| 00:11:24| |
|CO2 emission| 0.1t| 0.081t| 0.1t| 0.081t|

he CO2 emissions are calculated using the [tool](https://co2.myclimate.org/en/car_calculators/new), assuming that each car runs on petrol. The following calculations
show how CO2 is calculated for car agents traveling on the
one-link network that is used for scenarios in order to compare
the benefit over the environment.
• CO2 emission per car = 0.001t
• CO2 emission for 100 cars = 0.001*100 = 0.1t
• CO2 emission for 81 cars = 0.001*81 = 0.081t
• Reduction of CO2 emission due to reducing number of
cars = 0.1 - 0.081 = 0.019t

### Analysis

In recent years, the rise of micro-mobility options such as
bicycles and electric scooters has gained attention as a promising solution to traffic congestion, air pollution, and other
transportation-related issues. This study aims to contribute to
the ongoing discourse on micro-mobility by examining its
potential impact on Sri Lankan roads using a simple road
network comprising three links that connect four vertices. The
experiment focused solely on cars and bicycles as the two
transport modes, without considering parallel lanes, to simplify
calculations.
The results of the study showed a significant reduction
in travel time, with a 17.707% average decrease in total
travel time for all passengers. Furthermore, the experiment
demonstrated an 19% reduction in CO2 emissions, suggesting
that micro-mobility could be an effective means of reducing
carbon emissions and improving air quality.
However, to achieve more realistic results when comparing similar network infrastructures, several factors should be
considered. For instance, mixed traffic should be taken into
account, as different types of vehicles may behave differently
on the roads, potentially affecting travel time and other outcomes. Parallelly driven vehicles, which vary in width, also
need to be considered, as they may affect the overall road
capacity and travel time. Road signs and traffic lights must be
considered where necessary, as they play an essential role in
regulating traffic flow and reducing accidents.
Moreover, road conditions can affect travel time, and it
is essential to factor in these variations when assessing the
potential impact of micro-mobility. In the current study, bad
road conditions were represented by reducing the maximum
speed of the vehicles on the roads. However, future studies
should capture the full range of road conditions to arrive at
more accurate results.
Additionally, in situations where road widening is not feasible, other practical methods must be identified to introduce
micro-mobility to the current traffic. For example, dedicated
bicycle lanes can be created on existing roads, or public
transportation options can be integrated with micro-mobility
solutions to offer a more comprehensive range of options

## Conclusion

In conclusion, the results of this study suggest that micromobility options, such as bicycles, have the potential to significantly reduce travel time and CO2 emissions, particularly
on simple road networks. However, for future studies to
provide more realistic results and inform policy decisions, it
is necessary to consider various factors that may impact the
performance of micro-mobility on the roads.
One key recommendation for future studies is to increase
the number of vehicles traveling on the road network, as
this would enable the identification of congested areas with
greater accuracy. This can be accomplished using tools such
as ”Simunto Via” by purchasing an educational or commercial
license. Another recommendation is to include mixed traffic
scenarios in the model, with a particular focus on adding
three-wheelers, public transport, and motorbikes, which are
commonly used modes of transportation in Sri Lanka.
As the next steps of this project, we plan to calibrate this
conceptual model with real data to identify congested roads
in Sri Lankan cities and study the behavior and impacts of
micro-mobility modes. With the results we obtain, we can
make recommendations to transportation policymakers, such
as the implementation of dedicated bicycle lanes to reduce
road traffic congestion.
Moreover, this research opens doors to many other research
areas in different fields such as civil engineering, town planning, and social sciences. Based on the findings of this study,
researchers can further explore topics such as commuters’
behaviors, mode choice of the commuters, and the impact of
micro-mobility in situations such as fuel price increases, bus
fare decreases, and public transportation development.
In summary, this study provides valuable insights into the
potential benefits of micro-mobility in reducing travel time
and CO2 emissions. It highlights the need for future studies
to consider various factors that may impact the performance of
micro-mobility on the roads and calls for further research to be
conducted in related fields to provide a more comprehensive
understanding of the potential impact of micro-mobility.

## Publications
[//]: # "Note: Uncomment each once you uploaded the files to the repository"

<!-- 1. [Semester 7 report](./) -->
<!-- 2. [Semester 7 slides](./) -->
<!-- 3. [Semester 8 report](./) -->
<!-- 4. [Semester 8 slides](./) -->
<!-- 5. Author 1, Author 2 and Author 3 "Research paper title" (2021). [PDF](./). -->


## Links

[//]: # ( NOTE: EDIT THIS LINKS WITH YOUR REPO DETAILS )

- [Project Repository](https://github.com/cepdnaclk/e16-4yp-ABM-for-Micro-Mobility-in-Sri-Lankan-Cities)
- [Project Page](https://cepdnaclk.github.io/e16-4yp-ABM-for-Micro-Mobility-in-Sri-Lankan-Cities)
- [Department of Computer Engineering](http://www.ce.pdn.ac.lk/)
- [University of Peradeniya](https://eng.pdn.ac.lk/)

[//]: # "Please refer this to learn more about Markdown syntax"
[//]: # "https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet"
