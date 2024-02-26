package com.batch.Dao;

import java.util.List;

import com.batchBean.Batch;

public class BatchService {
	private BatchDao batchDao;
	public BatchService() {
		batchDao= new BatchDaoImpl();
	}
	
	public List<Batch> getAllBatches(){
		return batchDao.getAllBatches();
	}

	public Batch getBatchById(int id) {
		return batchDao.getBatchById(id);
	}
	
	public void addBatch(Batch batch) {
		batchDao.addBatch(batch);
	}
	public void updateBatch(Batch batch) {
		batchDao.updateBatch(batch);
	}
	
	public void deleteBatchById(int id) {
		batchDao.deleteBatchById(id);
	}
}
