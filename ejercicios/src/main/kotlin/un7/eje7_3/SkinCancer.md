Skin Cancer
9 points
Introduction
Computer vision is a broad field that will increase in the coming years. Automated disease
diagnosis will also be an important field. Today we will merge both, making an algorithm that
diagnoses skin cancer. For this purpose, the algorithm has to evaluate the average of the values
obtained and their standard deviation (stdev).
Remember that the standard deviation formula is:
where xi = {x1, x2, x3, ...} are the observed values of the sample items, x̅ is the mean value of these
observations, and N is the number of observations in the sample.
Your algorithm will be feed with images from a microscope composed by an array of 5x5 grayscale
pixels. (0: means a dark pixel and 255: a white one).
On this simple detector, we can consider a skin cancer if 40 ≤ average ≤ 80 and stdev ≥10. If stdev
is lower it's a benign skin mole (benign is a medical term to indicate non-hazardous).
It is also considered a benign skin mole if 80 < average ≤ 230. Independent of stdev.
And microscope calibration is needed when: average < 40 or average > 230. Independent of stdev.
HINT: perform all operations as
floats.
Input
The input consists of one line of 25 integers separated by spaces.
Output
Print out one of the following outputs classification:
•
Skin cancer
30CODEWARS 2021
SPAIN Virtual Edition
• Benign skin mole
• Recalibrate microscope