package main.java.com.p1.redisdemo;

@Service
public class RedisService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public String getValueByKey(String key) {
        return stringRedisTemplate.opsForValue().get(key)
;
    }
    public void setValueByKey(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }
}
