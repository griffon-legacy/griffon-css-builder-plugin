/*
 * Copyright 2009-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class CssBuilderGriffonPlugin {
    String version = '0.9'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [:]
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-css-builder-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'CSS for Swing'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
Enables styling your Griffon application with CSS using [CSSBuilder][1].

Usage
----
1. Define `name:` and/or `cssClass:` attributes on the nodes you wan to style using targeted CSS ids/selectors.
2. Create as many stylesheets as needed, place then under `griffon-app/resources`.
3. Add the following code when you're ready to apply a stylesheet, you can do this at any time after the Views have been created

        import griffon.builder.css.CSSDecorator
        CSSDecorator.decorate("style", rootComponentToBeStyled)

4. As an alternative you can apply a style on the fly with

        import griffon.builder.css.CSSDecorator
        // make all components have a white background
        String style = """
            * {
                background-color: white;
            }
        """
        CSSDecorator.applyStyle(style, rootComponentToBeStyled)


[1]: http://griffon.codehaus.org/CSSBuilder
'''
}
