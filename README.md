Android Project Template [![Build Status](https://travis-ci.org/orogersilva/template-android.svg?branch=master)](https://travis-ci.org/orogersilva/template-android)
========

Template for app Android project.

## Scaffolding Provided

This repository provides the following components that are common to our open source projects:

- CHANGELOG.md
- README.md
- RELEASING.md
- Git Ignore
- Dependency Management
- Travis CI Support
- Proguard Config

## Checklist

- [ ] Clone this repository into a folder of your project's name `git clone git@github.com:uber/android-template.git MY_PROJECT`. Or if you're copying the folder, don't forget hidden files!
- [ ] Reinitialize git
    - [ ] Delete the `.git` folder
    - [ ] Start a git repo with `git init`
    - [ ] Make initial git commit with all files
- [ ] Move your project's modules into the sample project
    - [ ] Update `settings.gradle` to point to the modules you added
    - [ ] Update `dependencies.gradle` and respective `build.gradle` files to make sure dependencies are hooked up and compiling properly
- [ ] Remove the sample modules `app` and `lib`.
- [ ] Modify `CHANGELOG.md` to reflect the version of your initial release.
- [ ] Update this `README.md` file to reflect your project.
    - [ ] Update the Travis Build Status badge to reflect your project
    - [ ] Delete everything above including these checkboxes

# Project Name [![Build Status](https://travis-ci.org/uber/your-project.svg?branch=master)](https://travis-ci.org/uber/your-project)

Replace this text with a synopsis of the app.

## License

Copyright Roger Silva 2017 ([@orogersilva](https://www.linkedin.com/in/orogersilva))

This file is part of Android Project Template.

Android Project Template is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Android Project Template is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Android Project Template.  If not, see <http://www.gnu.org/licenses/>.

Contact: Roger Silva [orogersilva@gmail.com](mailto:orogersilva@gmail.com)