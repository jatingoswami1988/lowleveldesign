package cachelld.cache.factories;

import cachelld.cache.Cache;
import cachelld.cache.policies.LRUEvictionPolicy;
import cachelld.cache.storage.HashMapBasedStorage;

public class CacheFactory<Key, Value> {

    public Cache<Key, Value> defaultCache(final int capacity) {
        return new Cache<Key, Value>(new LRUEvictionPolicy<Key>(),
                new HashMapBasedStorage<Key, Value>(capacity));
    }
}
