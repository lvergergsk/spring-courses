#### Note:
##### Spring Annotations:
- @SpringBootApplication
- @Autowired
- @Component
- @Service
- @Repository
- @Scope
- @Configuration
- @RestController
  - @RequestMapping
  - @GetMapping
  - @PostMapping
  - @UpdateMapping
  - @DeleteMapping
- @PathVariable
- @RequestBody
- @ControllerAdvice
- @JsonIgnoreProperty(value={"...","...",...})
- @JsonIgnore
- @JsonFilter
- @ManyToOne
- @OneToMany
- @OneToOne

##### Other Annotations:
- @Valid
  - @Size(min=?,max=?)
  - @Past

##### Spring Builtin
- methodOn

##### HATEOAS:
Hyper-media as the engine of application state.

##### Swagger2:
- @EnableSwagger2
- @ApiModel(description="...")
- @ApiModelProperty(notes="...")

##### Richardson Maturity Model
- Level 1: Expose resources with proper URI
- Level 2: Level 1 + HTTP Methods
- Level 3: Level 2 + HATEOAS (Next possible actions)

##### Good practice for RESTful web service:
- Consumer(user) first (ease of use, good documentation)
- Best use of http (right method, right status)
- No sensitive info on uri
- Use plurals
- Use noun for resources
- Consistency

#### TODO:
Example for:
- @Bean
- @Profile
- @Conditional


