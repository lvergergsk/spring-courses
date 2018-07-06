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
- @Validated
- @ControllerAdvice
- @JsonIgnoreProperty(value={"...","...",...})
- @JsonIgnore
- @JsonFilter("...")
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
- @MockBean !!
- @Profile
- @Conditional
- @Transactional
- @Type
- @scheduled
- @Data
- @ConfigurationProperties(prefix = "...")
- @Target
- @Slf4j
- @NoArgConstructor
- @AllArgsConstructor
- @Convert
- @AutoConfigureTestDatabase(replace = Replace.None
- @DataJpaTest
- @ExtendWith(SpringExtension.class)
- @ActiveProfile("...")
- @JsonProperty
- @JsonFormat
- @Target(ElementType.Field)
- @Retention(retentionPolicy.RUNTIME)
- @Documented
- @MappedSuperclass
- @ToString(exclude = {"...","..."})
- @PrePersist
- @LastModifiedDate
- @Version
- @CreatedDate
- @InjectMocks
- @Spy
- @DataJpaTest
- @Import
- @Getter
- @Setter

#### Others:
- URL wildcard 
- MockMvc
- MockMvcBuilder
- spring   .data.domain.sort
- spring   .data.domain.sort.direction
- spring   .data.domain.Pageable
- lombok.Data
- Data Transfer Object
- java.util.concurrent.Callable
- BeanWrapper
- PropertyAccessorFactory.forBeanPropertyAccess(...)
- java.beans.PropertyDescriptor
- import java.util.Timer;
- import java.util.TimerTask;
- How to create customized annotation
- Scope protected
- mockito.Mockito.spy
- MockRestServiceServer.bindTo(....getRestTemplate).build() (spring)
- Mockito.doReturn
- JPA Optimistic Lock & jpa pessimistic lock
- ObjectMapper.readValue(json,dto[].class)
- SoftAssertions (assertj)
- javax.crypto.Cipher
