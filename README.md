## SwipeToRefreshLayout

### Overview
This library helps to declare default progress bar & background colors via theme.xml

### Usage
Create the style which extend SwipeToRefreshLayout style

```xml
<style name="App.SwipeToRefreshLayout" parent="SwipeToRefreshLayout">
    <item name="backgroundColor">#000000</item>
    <item name="progressColor1">#A2BAFF</item>
    <item name="progressColor2">#FAF5AC</item>
    <item name="progressColor3">#FA9494</item>
</style>
```

After you created your style, you can go to your app theme and add this line 
```xml
<item name="swipeToRefreshLayoutStyle">@style/App.SwipeToRefreshLayout</item>
```

All SwipeToRefreshLayout's use above style without more code from the programmer

### Download
Gradle is the only supported build configuration, so just add the dependency to your project build.gradle file:


    dependencies {
      implementation 'gr.amoutzidis.swipetorefreshlayout:$version'
    }

### License

    Copyright 2020 Amoutzidis, Dimitrios
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
        http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.