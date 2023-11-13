import main.java.com.p1.redisdemo.RedisService;

@Controller
public class RedisController {
    @Autowired
    private RedisService redisService;

    @GetMapping("/getValue/{key}")
    public String getValue(@PathVariable String key) {
        return redisService.getValueByKey(key);
    }

    @PostMapping("/setValue")
    public void setValue(@RequestParam String key, @RequestParam String value) {
        redisService.setValueByKey(key, value);
    }
}
