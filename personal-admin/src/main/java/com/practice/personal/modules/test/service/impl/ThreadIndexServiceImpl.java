package com.practice.personal.modules.test.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.practice.personal.modules.test.dao.ThreadIndexDao;
import com.practice.personal.modules.test.entity.ThreadIndex;
import com.practice.personal.modules.test.service.ThreadIndexService;
import org.springframework.stereotype.Service;

@Service("threadIndexService")
public class ThreadIndexServiceImpl extends ServiceImpl<ThreadIndexDao,ThreadIndex> implements ThreadIndexService {
}
