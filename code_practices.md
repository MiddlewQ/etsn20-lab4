## Code Review

This file describe good questions to consider before and during a code review.

### First here is some terminology:
- CL - Change List 
- GTM - Looks good to me

### Design Questions:
- Do the interactions of the code in the CL make sense?
- Does this change belong in your codebase, or in a library?
- Does it integrate well with the rest of your system?
- Is now a good time to add this functionality?

### Functionality Questions
- Does this CL do what the developer intended?
- Is what the developer intended good for the users of this code?
    - note: users are usually end-users (use of the functionality) as well as other developers (use of the code)
- What edge cases could there be? Have the developer missed any?
- Concurrency Problems?
    - Race conditions
    - Deadlocks

### Complexity
- Is the code more complex than needed?
  - Check every CL level - are individual lines too complex?
  - Functions?
  - Classes?
  - note: "too complex" usually means that the code is too hard to understand, others will probably introduce bugs when using this code

### Tests
- Check for appropriate tests:
  - Unit tests
  - Integration tests
  - End-to-end tests
- Will the tests actually fail when the code is broken?
- False positives?
- Does each test make simple and useful assertions?
- Are tests simple and make useful assertions?
- Are tests categorized into appropriate sections?

Note that tests also have to be maintained.

### Naming, Style & Comments 

Check if code names are appropriate, avoid redundant information.

Make sure the code follows the right naming convention and coding style used by the project. Following the style is essential.
    - For example, camel_case vs PascalCase.


When writing comments, check for the following things:
    - Are they in understandable English?
    - Are they necessary?
    - If code isn't clear enough without comments, consider mark to be re-written.
    - TODOs?

### Consistency

Code should be consistent, CL should always follow the style guide.

In edge cases where the style only make recommendations, make a judgment call if the new code should be consistent with the recommendations or the surrounding code. 

Bias should always be in favour of the style guide.

### Others things to consider:
- Get in the mindset of other users - how would they use this?


