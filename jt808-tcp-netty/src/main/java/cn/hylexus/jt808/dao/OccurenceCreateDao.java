/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.hylexus.jt808.dao;

import cn.hylexus.jt808.entity.Entity;
import cn.hylexus.jt808.entity.OccurenceEntity;

/**
 *
 * @author MingDi
 */
public interface OccurenceCreateDao {
  public long create(OccurenceEntity occurence);
}
