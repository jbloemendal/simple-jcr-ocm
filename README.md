JCR Simple OCM
============

Annotate your beans to load and persist from / to JCR.

## Example
```
@JcrNodeType(value = "jcrmockup:user")
public class User implements Serializable {

    private static final long serialVersionUID = -3487145516242048487L;

    @JcrPath(value = "jcrmockup:username")
    private String userName;

    @JcrPath(value = "jcrmockup:fullname")
    private String fullName;

    @JcrPath(value = "*")
    private Map<String, Attribute> attributes;

    @JcrPath(value = "*")
    private Map<String, Preference> preferences;
}
```

## Supports
- Inheritance
- Aggregation
- Collections (List, Map, Set)
- Converters, intersecting read / write

For details and examples look at the tests src/main/java/org/onehippo/simpleocm/.
