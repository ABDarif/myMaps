# My Maps

## *Abdullah Arif*

**My Maps** displays a list of maps, each of which show user-defined markers with a title, description, and location. The user can also create a new map.

Time spent: **10** hours

## Functionality

The following **required** functionality is completed:

* [x] The list of map titles is displayed.
* [x] After tapping on a map title, the associated markers in the map are shown.
* [x] The user is able to create a new map.

The following **POSSIBLE extensions** are **YET-TO-BE** implemented:

* [ ] When a map marker is created, the pin is animated.
* [ ] In the initial screen, show the number of places in each map along with the title.
* [ ] Instead of the default marker, use a custom marker drawable
* [ ] Add a menu option in the map activity to change the map type (e.g. normal vs terrain)
* [ ] In the creation flow, add a button where the map will move to the user’s current location.
* [ ] Add the ability to search for maps which contain a string in the title
* [ ] Instead of storing the maps in a file, store them in a Room database

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://im2.ezgif.com/tmp/ezgif-2-48fc05427c.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

* [x] In the 2023.1.1 version of Android Studio (Hedgehog), if I an object with an id in the xml file, it doesn't automatically get referred to the .kt files, you have to use findViewById(). This was a major issue I faced when designing the floating Action Button for Creating Maps (fabCreatemap)

## License

    Copyright [2024] [Abdullah Arif]
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
        http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.