
# Task 3: Connect the screens

## 3.3
When CSC 231 is tapped, the detail screen displays CSC 231. The code is passed using navigate(CourseDetail(code)).

## 3.4
After using the device Back gesture twice, the app returns to the Home screen. Navigation Compose manages the back stack.

## 3.5
CourseListScreen does not know about the NavController. It reports the selected course using the onCourseClick lambda.
