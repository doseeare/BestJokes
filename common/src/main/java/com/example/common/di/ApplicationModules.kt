package com.example.common.di

import com.example.data.client.NetworkClient
import com.example.data.client.NetworkClientImpl
import com.example.domain.repository.SomeRepository
import com.example.domain.repository.SomeRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModules {
	
	@Provides
	@Singleton
	fun provideNetworkClient(
	): NetworkClient {
		return NetworkClientImpl()
	}
	
	@Provides
	fun provideSomeRepository(): SomeRepository {
		return SomeRepositoryImpl()
	}
	
}