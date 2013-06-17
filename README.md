
CSS for Swing
-------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/css-builder](http://artifacts.griffon-framework.org/plugin/css-builder)


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

