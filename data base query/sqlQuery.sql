use vehicleshowroom;

create table company(
companyName varchar(50) primary key,
nationality varchar(50) not null,
NoOfServiceCenter int not null,
loanScheme varchar(300) not null,
totalSale int not null,
website varchar(300) not null
);
/*select *from company;
drop table company;*/

create table model(
companyName varchar(50) not null,
modelName varchar(50) primary key,
bateryLife int not null ,
acceleration varchar(200) not null,
topSpeed int not null ,
cost int not null,
noOfWheel int not null ,
otherFeatures varchar(500) not null,
foreign key (companyName) references company(companyName)
);
/*drop table model;
select *from model;*/

create table colour(
modelName varchar(50),
colour varchar(70) ,
foreign key (modelName) references model(modelName),
primary key(modelName,colour)
);
/*select *from colour;*/

insert into company values('TESLA','AMERICAN','156',
'9% Interest Rate on Loan Amount provided by CITi Bank for Purchases greater than 1.5 Cr',
'200000','https://www.tesla.com/');

insert into company values('NISSAN','JAPAN','227',
'8.3% Interest Rate on Loan Amount provided by Tokyo Bank for Purchases greater than 28L',
'174000','https://www.nissan-global.com/EN/');

insert into company values('CHEVROLET','AMERICAN','53',
'7.7% Interest Rate on Loan Amount provided by Wells Farrago Bank for Purchases greater than 28L',
'50000','https://www.chevrolet.com/');

insert into company values('FORD','AMERICAN','212',
'9.3% Interest Rate on Loan Amount provided by JP Morgan Chase Bank for Purchases greater than 25L',
'105000','https://www.ford.com/');

insert into company values('VOLKSWAGEN','GERMAN','73',
'8.3% Interest Rate on Loan Amount provided by Deutsche Bank for Purchases greater than 50L',
'97000','https://www.vw.com/en.html');

insert into company values('KIA','SOUTH KOREAN','198',
'10% Down payment on purchases above 20L by Shinto Bank',
'123000','https://www.kia.com/in/home.html');

insert into company values('BMW','GERMAN','27',
'6% Interest Rate on Loan Amount provided by Axis Bank for Purchases from 1Cr',
'29000','https://www.bmwusa.com/');

insert into company values('MAHINDRA ELECTRIC','INDIAN','350',
'10% Downpayment on purchases above 20L by IOB Bank',
'44000','https://www.mahindraelectric.com/vehicles/');

insert into company values('HERO ELECTRIC','INDIAN','400',
'10% Down payment on purchases above 20L by Dena Bank',
'288000','https://heroelectric.in/');

insert into company values('TATA MOTORS','INDIAN','200',
'12.3% Down payment on purchases above 20L by PNB Bank',
'151000','https://www.tatamotors.com/');

insert into model  values('TESLA','MODEL S','647','4.1s at 100 ',
'250 ','15000000','4',
'luxury sedan ,12 ultrasonic sensors, 360 degrees visibility, autopilot');

insert into model  values('TESLA','MODEL X','565 ','4.7s at 100',
'250','20000000','4',
'SUV, falcon wing doors, room for 7 passengers, low-cost sedan');

insert into model  values('NISSAN','LEAF','200','10.2s at 100 ',
'144','3000000','4',
'leather interior with a matching dash pad,  hybrid gauge cluster with a large analog speedometer');

insert into model  values('NISSAN','ARIYA','185','9.5s at 100',
'160','2700000','4',
'leather interior with a matching dash pad ,  hybrid gauge cluster with a large analog speedometer');


insert into model  values('CHEVROLET','BOLT EV','320','7s at 100',
'145','3000000','4',
'affordable fast-charging option and an innovative regenerative-braking paddle, spacious cargo space');

insert into model  values('FORD','FOCUS ELECTRIC','110','11.4s at 100',
'135','2100000','4',
'Rack-Pinion Steering Type, Brake Actuated Limited Slip Differential, Strut Front Suspension w/Coil Springs');

insert into model  values('FORD','MUSTANG MACH E','600','5.1s at 100',
'180','4200000','4',
'The Mach-E has 29 cubic feet of cargo space behind the rear seats, and up to 60 with the back seats folded');

insert into model  values('VOLKSWAGEN','E-GOLF','190','9.6s at 100',
'150','1575000','4',
'driver assistance, including Adaptive Cruise Control, Front Assist, Blind Spot Sensor, Park Assist, Traffic Jam Assist and Emergency Assist');


insert into model  values('VOLKSWAGEN','ID 4','555','8.5s at 100',
'160','6500000','4',
'LED headlamps and tail lamps, 10-inch touchscreen infotainment system, voice controls, a multi-function steering wheel, keyless entry and go and ambient lighting.');

insert into model  values('KIA','SOUL EV','450','11.2s at 100',
'145','1000000','4',
'Torsion Beam Rear Suspension Type, 60-40 Folding Bench Front Facing Fold Forward Seatback Rear Seat');


insert into model  values('KIA','NIRO EV','455','11.8s at 100',
'180','2885000','4',
'7.0-inch digital driver display, Bluetooth connectivity and support Apple CarPlay and Android Auto.');


insert into model  values('BMW','I3','430','6.9s at 100',
'160','10000000','4',
'subcompact city car, All i3 models come with BMWs iDrive 6 infotainment interface');

insert into model  values('MAHINDRA ELECTRIC','TREO','130','11.5s at 100',
'55','154000','4',
'Quick charging, Hazard Indicator, Wind Screen & Wiping System, Driving Modes - LMH (Low Medium High) Speed');


insert into model  values('MAHINDRA ELECTRIC','EALPHA MINI','85','13.1s at 100',
'30','126000','3',
'robust body, superior suspension and chassis');

insert into model  values('HERO ELECTRIC','ELECTRIC NYX','50','24s at 100',
'42','79000','2',
'Drum Brakes Front, Alloy Wheels, Tube Tyre, Digital Fuel Indicator');

insert into model  values('HERO ELECTRIC ','ELECTRIC DASH','60','28s at 100',
'25','62000','2',
'Tubeless Tyre and Cast Aluminium Wheels, Passenger Footrest, Pass Switch');


insert into model  values('TATA MOTORS ','NEXON EV','302','9.9s at 100',
'120','1400000','4',
'Front Suspension
Independent MacPherson strut with coil spring, Rear Suspension
Twist beam with dual path Strut,
Smart regenerative braking, Hill Ascent Assist, Hill Descent Assist
');

insert into model  values('TATA MOTORS','TIGOR EV','213','19.84s at 100',
'80','1270000','4',
'Automatic transmission, 5 seater Sedan ,
Anti Lock Braking System, Automatic Climate Control');

insert into colour values('MODEL S','RED');
insert into colour values('MODEL S','BLACK');
insert into colour values('MODEL S','WHITE');
insert into colour values('MODEL S','BLUE');
insert into colour values('MODEL S','GREY');


insert into colour values('MODEL X','RED');
insert into colour values('MODEL X','BLACK');
insert into colour values('MODEL X','WHITE');
insert into colour values('MODEL X','BLUE');
insert into colour values('MODEL X','GREY');


insert into colour values('LEAF','RED');
insert into colour values('LEAF','BLACK');
insert into colour values('LEAF','WHITE');
insert into colour values('LEAF','BLUE');
insert into colour values('LEAF','GREY');


insert into colour values('ARIYA','RED');
insert into colour values('ARIYA','BLACK');
insert into colour values('ARIYA','WHITE');
insert into colour values('ARIYA','BLUE');
insert into colour values('ARIYA','GREY');


insert into colour values('BOLT EV','RED');
insert into colour values('BOLT EV','BLACK');
insert into colour values('BOLT EV','WHITE');
insert into colour values('BOLT EV','BLUE');
insert into colour values('BOLT EV','GREY');


insert into colour values('FOCUS ELECTRIC','RED');
insert into colour values('FOCUS ELECTRIC','BLACK');
insert into colour values('FOCUS ELECTRIC','WHITE');
insert into colour values('FOCUS ELECTRIC','BLUE');
insert into colour values('FOCUS ELECTRIC','GREY');


insert into colour values('MUSTANG MACH E','RED');
insert into colour values('MUSTANG MACH E','BLACK');
insert into colour values('MUSTANG MACH E','WHITE');
insert into colour values('MUSTANG MACH E','BLUE');
insert into colour values('MUSTANG MACH E','GREY');



insert into colour values('E-GOLF','BLACK');
insert into colour values('E-GOLF','WHITE');
insert into colour values('E-GOLF','BLUE');
insert into colour values('E-GOLF','GREY');


insert into colour values('ID 4','YELLOW');
insert into colour values('ID 4','WHITE');
insert into colour values('ID 4','BLUE');
insert into colour values('ID 4','GREY');

insert into colour values('SOUL EV','RED');
insert into colour values('SOUL EV','BLACK');
insert into colour values('SOUL EV','WHITE');
insert into colour values('SOUL EV','BLUE');
insert into colour values('SOUL EV','GREY');

insert into colour values('NIRO EV','RED');
insert into colour values('NIRO EV','BLACK');
insert into colour values('NIRO EV','WHITE');
insert into colour values('NIRO EV','BLUE');
insert into colour values('NIRO EV','GREY');


insert into colour values('I3','RED');
insert into colour values('I3','BLACK');
insert into colour values('I3','WHITE');
insert into colour values('I3','BLUE');
insert into colour values('I3','GREY');



insert into colour values('TREO','BLUE/WHITE');

insert into colour values('EALPHA MINI','RED/BLACK');

insert into colour values('ELECTRIC NYX','BLACK');
insert into colour values('ELECTRIC NYX','SILVER');


insert into colour values('ELECTRIC DASH','RED');


insert into colour values('NEXON EV','WHITE');
insert into colour values('NEXON EV','BLUE');
insert into colour values('NEXON EV','SILVER');


insert into colour values('TIGOR EV','WHITE');
insert into colour values('TIGOR EV','BLUE');
insert into colour values('TIGOR EV','SILVER');


