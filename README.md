# CustomSpinner
## With customer spinner you can easily modify the spinner like: Spinner style, font etc.

![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)
[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)


# How it works:

1. Gradle Dependency

- Add the JitPack repository to your project's build.gradle file

```groovy
    allprojects {
        repositories {
            ...
    	    maven { url 'https://jitpack.io' }
        }
    }
```
- Add the dependency in your app's build.gradle file

```groovy
    dependencies {
         implementation 'com.github.TecOrb-Developers:CustomSpinner:0.0.1'

    }
```

2. Implement Custom spinner

```
 override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context=this
        face1 = ResourcesCompat.getFont(this, R.font.din_condensed_bold);
        txtSpinner=findViewById(R.id.txtSpinner)
        list!!.add("January")
        list!!.add("February")
        list!!.add("March")
        list!!.add("April")
        list!!.add("May")
        list!!.add("June")
        list!!.add("July")
        list!!.add("August")
        list!!.add("September")
        list!!.add("October")
        list!!.add("November")
        list!!.add("December")
        txtSpinner!!.setOnClickListener {
            SpinnerWindow(this)
            SpinnerWindow.showSpinner(context, list as ArrayList<String>?)
            SpinnerWindow.setTitleFont(face1,context)

        }
    }

    override fun selectedPosition(position: Int) {
        txtSpinner?.let{
            it.text= list!![position]
        }

    }
    
```

 
# Developers

MIT License

Copyright (c) 2019 TecOrb Technologies

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
