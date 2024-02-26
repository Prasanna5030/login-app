package com.batch.Dao;

import java.util.List;

import com.batchBean.Batch;

public interface BatchDao {
	
	public List<Batch> getAllBatches();
	public Batch getBatchById(int id);
	public void addBatch(Batch batch);
	public void updateBatch(Batch batch);
	public void deleteBatchById(int id);

}
